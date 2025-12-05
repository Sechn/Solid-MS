package services;

public class PricingService {
    public double calculateTotal(Reservation res){
        double base = res.getRoom().getPrice() * res.getNights();
        if("Paris".equalsIgnoreCase(res.getCustomer().getCity())){
            return base * 0.9; // 10% discount for Paris
        }
        return base;
    }
}
