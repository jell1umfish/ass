class KaspiPayment implements PaymentStrategy {
    private String email;

    public KaspiPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid $" + amount + " with Kaspi (Email: " + email + ")");
    }
}