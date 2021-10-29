package paying;

public class PayPalPaymentStrategy implements Payment{
    public boolean pay(double price) {
        System.out.println("Your PalPal payment is successful!");
        return true;
    }
}
