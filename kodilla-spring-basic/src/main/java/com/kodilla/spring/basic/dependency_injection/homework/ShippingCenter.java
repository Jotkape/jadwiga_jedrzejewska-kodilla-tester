package com.kodilla.spring.basic.dependency_injection.homework;

public class ShippingCenter {
    private final IDeliveryService deliveryService;
    private final INotificationService notificationService;

    public ShippingCenter(IDeliveryService deliveryService, INotificationService notificationService) {
        this.deliveryService = deliveryService;
        this.notificationService = notificationService;
    }

    public void sendPackage(String address, double weight) {
        if (deliveryService.deliverPackage(address, weight)) {
            notificationService.success(address);
        } else {
            notificationService.fail(address);
        }
    }
}
