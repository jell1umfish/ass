public class Main {
    public static void main(String[] args) {
        // Singleton usage ;
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println("Is singleton1 the same instance as singleton2? " + (singleton1 == singleton2));

        ShoppingCart cart = new ShoppingCart();

        PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9876-5432", "Duman Dudarbek");
        PaymentStrategy kaspiPayment = new KaspiPayment("dumanch1k@chetam.com");

        cart.setPaymentStrategy(creditCardPayment);
        cart.checkout(66);

        cart.setPaymentStrategy(kaspiPayment);
        cart.checkout(228);
    }
}