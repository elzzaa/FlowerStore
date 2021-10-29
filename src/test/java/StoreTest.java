import flowers.Flower;
import flowers.FlowerPack;
import flowers.FlowerType;
import flowers.Store;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {
    private Flower flower;
    private Store store;
    @BeforeEach
    void setUp() {
        flower = new Flower(FlowerType.ROSE);
        store = new Store();
        store.setAssortment(List.of(new FlowerPack(flower)));
    }

    @Test
    void search() { assertFalse(store.search(flower)); }
}