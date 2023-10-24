package HomeWork2;

import java.math.BigDecimal;
import java.time.LocalDate;

public class DepositAccount extends AbstractAccount{
    private LocalDate date;
    DepositAccount(BigDecimal balance) {
        super(balance);
    }
    @Override
    public void take(BigDecimal value) {
        if (date == null || LocalDate.now().isAfter(this.date.plusMonths(1))) {
            super.take(value);
            this.date = LocalDate.now();
        }
        else {
            throw new Error(String.format("Со времени последнего снятия %s не прошёл один месяц", this.date));
        }
    }
}
