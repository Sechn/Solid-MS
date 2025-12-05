import constants.PaymentMethods;
import models.Customer;
import models.LuxuryRoom;
import services.Reservation;
import models.Room;
import services.ReservationService;
import services.NotificationSender;
import services.EmailSender;
import services.SmsSender;
import services.PricingService;
import services.InvoiceService;
import services.PaymentFactory;

public class Main {
    public static void main(String[] args){
        Customer customer = new Customer("Ali", "ali@example.com","09124483765", "Paris");
        Room room = new LuxuryRoom("203", 150);
        Reservation res = new Reservation(room, customer, 2);

        // create dependencies (simple manual DI)
        NotificationSender notifier = new EmailSender(); // or new SmsSender()
        PricingService pricing = new PricingService();
        InvoiceService invoice = new InvoiceService();
        PaymentFactory paymentFactory = new PaymentFactory();

        ReservationService service = new ReservationService(notifier, pricing, invoice, paymentFactory);
        service.makeReservation(res, PaymentMethods.PAYPAL);
    }
}
