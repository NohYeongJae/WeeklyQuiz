package chap08.basic;

public class Paypal implements Payment {
    private String email;

    public Paypal(String email) {
        this.email = email;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Paypal processing amount " + amount + "using email " + email);
    }
}
