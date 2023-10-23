package HomeWork1;

import java.math.BigDecimal;
import java.math.RoundingMode;

class CreditAccount extends Account {
    CreditAccount(BigDecimal balance) {
        super(balance);
    }

    @Override
    protected void take(BigDecimal value) {
        if (value.compareTo(BigDecimal.ZERO) > 0) {
            BigDecimal commission = value.add(value.multiply(BigDecimal.valueOf(0.01)).setScale(2, RoundingMode.FLOOR));
            if (this.balance.compareTo(commission) >= 0) {
                this.balance = this.balance.subtract(commission).setScale(2, RoundingMode.FLOOR);
            } else {
                throw new Error("На счету не достаточно средств для снятия");
            }
        } else {
            throw new IllegalArgumentException("Значение не может быть равным либо меньше нуля");
        }
    }
}
