package paying;

public class CreditCardPaymentStrategy implements Payment{
    public boolean pay(double price) {
        System.out.println("Your Credit Card payment is successful!");
        return true;
    }
}
