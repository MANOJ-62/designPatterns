package designpatters.structural.Adapter;

public class PayPalPayment implements PaymentProcessor{
    @Override
    public void pay(double amount) {
        System.out.println("Processing payment using paypal for " + amount);
    }
}
