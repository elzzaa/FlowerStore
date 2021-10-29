import delivering.Delivery;
import flowers.Item;
import paying.Payment;

import java.util.LinkedList;

public class Order {
    LinkedList<Item> items;
    Payment payment;
    Delivery delivery;
    double totalPrice = 0;

    public void setPaymentStrategy(Payment payment) {
        this.payment = payment;
    }

    public void setDeliveryStrategy(Delivery delivery) {
        this.delivery = delivery;
    }

    public double calculateTotalPrice() {
        for (Item item: items) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }

    public String processOrder() {
        return "Your order was processed.";
    }

    public boolean addItem(Item item) {
        return items.add(item);

    }

    public boolean removeItem(Item item) {
        return items.remove(item);}
}
