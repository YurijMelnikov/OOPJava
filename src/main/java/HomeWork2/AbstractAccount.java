package HomeWork2;

import java.math.BigDecimal;
import java.math.RoundingMode;

abstract class AbstractAccount implements AccountInterface {
    private BigDecimal balance;

    AbstractAccount(BigDecimal balance) {
        this.balance = balance.setScale(2, RoundingMode.FLOOR);
    }

    @Override
    public void put(BigDecimal value) {
        if (value.compareTo(BigDecimal.ZERO) > 0) {

            this.balance = this.balance.add(value).setScale(2, RoundingMode.FLOOR);
        } else {
            throw new IllegalArgumentException("Значение не может быть равным либо меньше нуля");
        }
    }

    @Override
    public void take(BigDecimal value) {
        if (value.compareTo(BigDecimal.ZERO) > 0) {
            if (this.balance.compareTo(value) >= 0) {
                this.balance = this.balance.subtract(value).setScale(2, RoundingMode.FLOOR);
            } else {
                throw new Error("На счету не достаточно средств для снятия");
            }
        } else {
            throw new IllegalArgumentException("Значение не может быть равным либо меньше нуля");
        }
    }

    @Override
    public BigDecimal getAmount() {
        return this.balance;
    }
}
