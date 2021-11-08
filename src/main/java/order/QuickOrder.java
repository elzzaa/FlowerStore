package order;

import flowers.Item;

import java.util.ArrayList;
import java.util.List;

public class QuickOrder extends Order{
    private List<User> users = new ArrayList<>();

    private QuickOrder(List<Item> items, User user){
        addUser(user);
        order();
    }

    public QuickOrder createQuickOrder(List<Item> items, User user){
        return new QuickOrder(items, user);
    }
}
