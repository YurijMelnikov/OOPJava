package HomeWork2;

import java.math.BigDecimal;

interface AccountInterface {
    BigDecimal getAmount();

    void put(BigDecimal value);

    void take(BigDecimal value);
}
