package HomeWork1;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

class DepositAccount extends Account{
    private LocalDate date;
    protected DepositAccount(BigDecimal balance) {
        super(balance);
    }
    @Override
    protected void take(BigDecimal value) {
        if (date == null || LocalDate.now().isAfter(this.date.plusMonths(1))) {
            super.take(value);
            this.date = LocalDate.now();
        }
        else {
            throw new Error(String.format("Со времени последнего снятия %s не прошёл один месяц", this.date));
        }
    }
}