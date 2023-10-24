package HomeWork2;

import java.math.BigDecimal;
import java.math.RoundingMode;

class CreditAccount extends AbstractAccount{
    CreditAccount(BigDecimal balance) {
        super(balance);
    }
    @Override
    public void take(BigDecimal value){
        super.take(value.add(value.multiply(BigDecimal.valueOf(0.01)).setScale(2, RoundingMode.FLOOR)));
    }
}
