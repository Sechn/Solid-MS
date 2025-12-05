package services;

import constants.PaymentMethods;

public class ReservationService {
    private final NotificationSender notifier;
    private final PricingService pricingService;
    private final InvoiceService invoiceService;
    private final PaymentFactory paymentFactory;

    public ReservationService(NotificationSender notifier,
                              PricingService pricingService,
                              InvoiceService invoiceService,
                              PaymentFactory paymentFactory) {
        this.notifier = notifier;
        this.pricingService = pricingService;
        this.invoiceService = invoiceService;
        this.paymentFactory = paymentFactory;
    }

    public void makeReservation(Reservation res, PaymentMethods paymentType) {
        System.out.println("Processing reservation for " + res.getCustomer().getName());

        // compute total via PricingService
        double total = pricingService.calculateTotal(res);

        // pay via PaymentMethod strategy
        PaymentMethod paymentMethod = paymentFactory.get(paymentType);
        paymentMethod.pay(total);

        // print invoice
        invoiceService.printInvoice(res, total);

        // send notification
        notifier.send(res.getCustomer(), "Your reservation confirmed!");
    }
}
