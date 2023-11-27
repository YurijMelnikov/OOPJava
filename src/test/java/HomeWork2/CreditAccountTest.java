package HomeWork2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

class CreditAccountTest {
    CreditAccount testObject = new CreditAccount(BigDecimal.valueOf(10.01));

    @Test
    void take() {
        testObject.take(BigDecimal.valueOf(5));
        Assertions.assertEquals(BigDecimal.valueOf(10.01).subtract(BigDecimal.valueOf(5).add(BigDecimal.valueOf(5).multiply(BigDecimal.valueOf(0.01)))), testObject.getAmount());
    }
}