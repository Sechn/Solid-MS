package services;

public class InvoiceService {
    public void printInvoice(Reservation res, double total){
        System.out.println("----- INVOICE -----");
        System.out.println("Customer: " + res.getCustomer().getName());
        System.out.println("Room: " + res.getRoom().getNumber() + " (" + res.getRoom().getType() + ")");
        System.out.println("Total: " + total);
        System.out.println("-------------------");
    }
}
