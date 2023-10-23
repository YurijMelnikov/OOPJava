package HomeWork1;

import java.math.BigDecimal;
import java.math.RoundingMode;
class Account {
    protected BigDecimal balance;

    protected Account(BigDecimal balance) {
        this.balance = balance.setScale(2, RoundingMode.FLOOR);
    }

    protected void put(BigDecimal value) {
        if (value.compareTo(BigDecimal.ZERO) > 0) {

            this.balance = this.balance.add(value).setScale(2, RoundingMode.FLOOR);
        } else {
            throw new IllegalArgumentException("Значение не может быть равным либо меньше нуля");
        }
    }

    protected void take(BigDecimal value) {
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

    String getAmount() {
        return this.balance.toString();
    }
}