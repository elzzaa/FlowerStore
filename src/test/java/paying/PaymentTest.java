package paying;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentTest {

    @Test
    void pay() {
        assertTrue(Payment.pay(10));
    }
}