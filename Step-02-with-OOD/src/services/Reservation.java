package services;

import models.Customer;
import models.Room;

public class Reservation {
    private Room room;
    private Customer customer;
    private int nights;

    public Reservation(Room r, Customer c, int nights) {
        this.room = r;
        this.customer = c;
        this.nights = nights;
    }

    public Room getRoom(){ return room; }
    public Customer getCustomer(){ return customer; }
    public int getNights(){ return nights; }
}
