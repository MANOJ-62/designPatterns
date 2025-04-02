package designpatters.structural.Adapter;

public class AdapterPatternMain {
    public static void main(String[] args) {
        // ✅ Using PayPal directly
        PaymentProcessor paypal = new PayPalPayment();
        paypal.pay(100.0);

        // ✅ Using Stripe via Adapter
        StripePayment stripeAPI = new StripePayment();  // Incompatible class
        PaymentProcessor stripeAdapter = new StripeAdapter(stripeAPI);
        stripeAdapter.pay(200.0);
    }
}
