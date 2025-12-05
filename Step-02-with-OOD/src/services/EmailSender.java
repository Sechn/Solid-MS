package services;

import models.Customer;

public class EmailSender implements NotificationSender {
    @Override
    public void send(Customer customer, String message) {
        System.out.println("Sending email to " + customer.getEmail() + ": " + message);
    }
}
