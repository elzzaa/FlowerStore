package flowers;

import flowers.Flower;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class FlowerPack {
    public FlowerPack(Flower flowerType) {
        flower = flowerType;
    }

    public FlowerPack() {}

    public Flower getFlower() {
        return flower;
    }

    private Flower flower;
    private int amount;

    public double getPrice() {
        return amount * flower.getPrice();
    }

    public void setFlower(Flower flower) {
        this.flower = flower;
    }

    public void setAmount(int i) {
        this.amount = i;
    }

    public int getAmount() {
        return amount;
    }
}
