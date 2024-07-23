package com.kodilla.notification.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

class NotificationServiceTestSuite {

    private NotificationService notificationService;
    private Client client;
    private Client secondClient;
    private Client thirdClient;
    private Notification notification;

    @BeforeEach
    public void setup() {
        notificationService = new NotificationService();
        client = Mockito.mock(Client.class);
        secondClient = Mockito.mock(Client.class);
        thirdClient = Mockito.mock(Client.class);
        notification = Mockito.mock(Notification.class);
    }

    @Test
    public void notSubscribedClientShouldNotReceiveNotification() {
        notificationService.sendNotificationToLocation(notification, "Location1");

        verify(client, never()).receive(notification);
    }

    @Test
    public void subscribedClientShouldReceiveNotification() {
        notificationService.addSubscriber(client, "Location1");

        notificationService.sendNotificationToLocation(notification, "Location1");

        verify(client).receive(notification);
    }

    @Test
    public void notificationShouldBeSentToAllSubscribedClientsForLocation() {
        addSubscribers("Location1", client, secondClient, thirdClient);

        notificationService.sendNotificationToLocation(notification, "Location1");

        verify(client).receive(notification);
        verify(secondClient).receive(notification);
        verify(thirdClient).receive(notification);
    }

    @Test
    public void shouldSendOnlyOneNotificationToMultiTimeSubscriber() {
        notificationService.addSubscriber(client, "Location1");
        notificationService.addSubscriber(client, "Location1");

        notificationService.sendNotificationToLocation(notification, "Location1");

        verify(client).receive(notification);
    }

    @Test
    public void unsubscribedClientShouldNotReceiveNotification() {
        notificationService.addSubscriber(client, "Location1");
        notificationService.removeSubscriber(client, "Location1");

        notificationService.sendNotificationToLocation(notification, "Location1");

        verify(client, never()).receive(notification);
    }

    @Test
    public void removeAllSubscriptionsShouldUnsubscribeClientFromAllLocations() {
        addSubscribers("Location1", client);
        addSubscribers("Location2", client);
        notificationService.removeAllSubscriptions(client);

        notificationService.sendNotificationToLocation(notification, "Location1");
        notificationService.sendNotificationToLocation(notification, "Location2");

        verify(client, never()).receive(notification);
    }

    @Test
    public void sendNotificationToAllShouldReachAllClients() {
        notificationService.addAllSubscriber(client);
        notificationService.addAllSubscriber(secondClient);

        notificationService.sendNotificationToAll(notification);

        verify(client).receive(notification);
        verify(secondClient).receive(notification);
    }

    @Test
    public void removeLocationShouldRemoveAllSubscribersFromThatLocation() {
        addSubscribers("Location1", client, secondClient);
        notificationService.removeLocation("Location1");

        notificationService.sendNotificationToLocation(notification, "Location1");

        verify(client, never()).receive(notification);
        verify(secondClient, never()).receive(notification);
    }

    private void addSubscribers(String location, Client... clients) {
        for (Client currentClient : clients) {
            notificationService.addSubscriber(currentClient, location);
        }
    }

}