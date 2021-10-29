package decorators;

import flowers.FlowerBucket;
import flowers.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecoratorTest {
    Decorator paperDecoratorTest;
    Decorator ribbonDecoratorTest;

    @BeforeEach
    void setUp() {
        Item item = new FlowerBucket();
        paperDecoratorTest = new PaperDecorator(item) {
            @Override
            protected double price() {
                return 0;
            }
        };
        ribbonDecoratorTest = new RibbonDecorator(item) {
            @Override
            protected double price() {
                return 0;
            }
        };
    }


    @Test
    void getPrice() {
        assertEquals(13, paperDecoratorTest.getPrice());
        assertEquals(40, ribbonDecoratorTest.getPrice());
    }
}