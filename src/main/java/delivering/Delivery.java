package delivering;

import flowers.Item;

import java.util.List;

public interface Delivery {
    static boolean delivery(List<Item> items) {
        return true;
    }

    boolean delivery();
}
