package flowers;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket extends Item{
    public static List<FlowerPack> flowerPackList = new ArrayList<>();

    public FlowerBucket(List<FlowerPack> flowers) {
        flowerPackList = flowers;
    }

    public FlowerBucket() {

    }


    public double getPrice() {
        double price = 0;
        for (FlowerPack flowerPack: flowerPackList) {
            price += flowerPack.getPrice();
        }
        return price;
    }

    @Override
    public double price() {
        return getPrice();
    }

    public static void addFlowers() {
        flowerPackList.add(new FlowerPack());
    }
}
