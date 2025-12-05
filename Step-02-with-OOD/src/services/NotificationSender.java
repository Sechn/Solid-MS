package services;

import models.Customer;

public interface NotificationSender {
    void send(Customer customer, String message);
}
