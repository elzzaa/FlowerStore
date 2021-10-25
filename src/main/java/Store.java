import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Scanner;

@Getter @Setter
public class Store {
    public Scanner sc = new Scanner(System.in);
    List<FlowerPack> assortment = List.of();
    public boolean search(Flower flowerName) {
        for (FlowerPack flower: assortment) {
            if (flower.getFlower().toString().toLowerCase() == flowerName.toString().toLowerCase()) {
                return true;
            }
        }
        return false;
    }

    public List<FlowerPack> getAssortment() {
        return assortment;
    }

    public void setAssortment(List<FlowerPack> assortment) {
        this.assortment = assortment;
    }

}

