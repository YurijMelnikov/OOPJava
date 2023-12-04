package HomeWork2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.math.BigDecimal;
import java.math.RoundingMode;

class AccountTest {
    Account testObject = new Account(BigDecimal.valueOf(10.01));
    @Test
    void getAmount() {
        Assertions.assertEquals(BigDecimal.valueOf(10.01).setScale(2, RoundingMode.FLOOR), testObject.getAmount());
    }
    @Test
    void put() {
        testObject.put(BigDecimal.valueOf(10));
        Assertions.assertEquals(BigDecimal.valueOf(20.01), testObject.getAmount());
//        Executable executable = () -> testObject.put(BigDecimal.valueOf(-20));
        Assertions.assertThrows(IllegalArgumentException.class, () -> testObject.put(BigDecimal.valueOf(-20)));
    }

    @Test
    void take() {
        testObject.take(BigDecimal.valueOf(5));
        Assertions.assertEquals(BigDecimal.valueOf(05.01), testObject.getAmount());
    }
}