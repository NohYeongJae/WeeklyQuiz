package chap08.basic;

public class Order {
    public static void main(String[] args) {
        double amount = 100.34;

        Payment creditCardPayment = new CreditCard("1234-5678-9012-1234");
        Payment payPalPayment = new Paypal("user@xample.com");

        creditCardPayment.processPayment(amount);
        payPalPayment.processPayment(amount);
    }
}
