package com.kodilla.spring.basic.dependency_injection.homework;

public interface INotificationService {
    void success(String address);
    void fail(String address);
}
