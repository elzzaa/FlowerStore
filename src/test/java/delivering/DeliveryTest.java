package delivering;

import flowers.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class DeliveryTest {
    PostDeliveryStrategy postTest;
    Delivery dhlTest;

    @BeforeEach
    void setUp() {
        postTest = new PostDeliveryStrategy();
        dhlTest = new DHLDeliveryStrategy();
    }

    @Test
    void deliver() {
        assertFalse(postTest.delivery());
        assertFalse(dhlTest.delivery());
    };
}