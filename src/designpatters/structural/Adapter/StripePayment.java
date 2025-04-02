package designpatters.structural.Adapter;

// ❌ Stripe API (Incompatible with PaymentProcessor)
public class StripePayment{

    public void payment(double amount) {
        System.out.println("Processing payment using stripe for " + amount);
    }
}
