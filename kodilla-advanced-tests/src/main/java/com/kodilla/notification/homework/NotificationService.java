package com.kodilla.notification.homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class NotificationService {
    private Map<String, Set<Client>> locationSubscribers = new HashMap<>();
    private Set<Client> allSubscribers = new HashSet<>();

    public void addSubscriber(Client client, String location) {
        locationSubscribers.putIfAbsent(location, new HashSet<>());
        locationSubscribers.get(location).add(client);
    }

    public void removeSubscriber(Client client, String location) {
        if (locationSubscribers.containsKey(location)) {
            locationSubscribers.get(location).remove(client);
        }
    }

    public void removeAllSubscriptions(Client client) {
        for (Set<Client> clients : locationSubscribers.values()) {
            clients.remove(client);
        }
        allSubscribers.remove(client);
    }

    public void sendNotificationToLocation(Notification notification, String location) {
        if (locationSubscribers.containsKey(location)) {
            for (Client client : locationSubscribers.get(location)) {
                client.receive(notification);
            }
        }
    }

    public void sendNotificationToAll(Notification notification) {
        for (Client client : allSubscribers) {
            client.receive(notification);
        }
    }

    public void addAllSubscriber(Client client) {
        allSubscribers.add(client);
    }

    public void removeLocation(String location) {
        locationSubscribers.remove(location);
    }
}
