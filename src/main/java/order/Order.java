package order;

import delivering.Delivery;
import flowers.Item;
import paying.Payment;

import java.util.LinkedList;
import java.util.List;

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

    List<User> users;

    public void addUser(User newUser){
        users.add(newUser);
        System.out.println("User was added.");
    }

    public void removeUser(User delUser) {
        users.remove(delUser);
        System.out.println("User was removed.");
    }

    void notifyUser() {
        for (User user: users) {
            User.update(true);
        }
    }

    public void order(){
        processOrder();
        notifyUser();
    }
}
