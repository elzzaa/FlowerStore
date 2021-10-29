package flowers;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Flower{
    private FlowerType flowerType;
    private double price;
    private double sepalLength;

    public Flower() {
    }

    public Flower(FlowerType flowerName) {
        flowerType = flowerName;
    }


    public void setColor(double color) {
        this.color = color;
    }

    private double color;
}
