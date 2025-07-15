package org.example;

public class AlertManager {
    private NotificationService service;

    public AlertManager(NotificationService service) {
        this.service = service;
    }

    public void triggerAlert(String message) {
        service.send(message); // void method
    }
}

