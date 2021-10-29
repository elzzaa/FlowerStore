package delivering;

import flowers.Item;

import java.util.List;

public class PostDeliveryStrategy implements Delivery{
    public boolean delivery(List<Item> items) {
        System.out.println("The post delivery of " + items.toString() + "is successful.");
        return true;
    }

    public boolean delivery() {
        System.out.println("The post delivery was empty.");
        return false;
    }
}
