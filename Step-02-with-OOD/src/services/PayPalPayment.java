package services;

public class PayPalPayment implements PaymentMethod {
    @Override
    public void pay(double amount){
        System.out.println("Paid by PayPal: " + amount);
    }
}
