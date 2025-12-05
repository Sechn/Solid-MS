package services;

import models.Customer;

public class SmsSender implements NotificationSender {
    @Override
    public void send(Customer customer, String message) {
        System.out.println("Sending SMS to " + customer.getMobile() + ": " + message);
    }
}
