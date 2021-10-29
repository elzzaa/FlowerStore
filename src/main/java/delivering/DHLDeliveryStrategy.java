package delivering;

import flowers.Item;

import java.util.List;

public class DHLDeliveryStrategy implements Delivery {
    public boolean delivery(List<Item> items) {
        System.out.println("The DHL delivery of " + items.toString() + "is successful.");
        return true;
    }

    public boolean delivery() {
        System.out.println("The DHL delivery was empty.");
        return false;
    }
}
