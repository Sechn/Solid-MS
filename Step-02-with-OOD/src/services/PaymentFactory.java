package services;

import constants.PaymentMethods;

public class PaymentFactory {
    public PaymentMethod get(PaymentMethods method){
        switch(method){
            case CARD: return new CardPayment();
            case PAYPAL: return new PayPalPayment();
            case CASH: return new CashPayment();
            case ONSITE: return new OnSitePayment();
            default: throw new IllegalArgumentException("Unknown payment method: " + method);
        }
    }
}
