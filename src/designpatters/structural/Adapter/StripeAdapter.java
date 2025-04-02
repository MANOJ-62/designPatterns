package designpatters.structural.Adapter;

public class StripeAdapter implements PaymentProcessor{

    private final StripePayment stripePayment;

    public StripeAdapter(StripePayment stripePayment) {
        this.stripePayment = stripePayment;
    }

    @Override
    public void pay(double amount) {
        stripePayment.payment(amount);
    }
}
