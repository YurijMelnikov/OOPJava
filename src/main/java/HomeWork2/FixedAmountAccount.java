package HomeWork2;

import java.math.BigDecimal;

public class FixedAmountAccount extends AbstractAccount{
    FixedAmountAccount(BigDecimal balance) {
        super(balance);
    }
    @Override
    public void put(BigDecimal value){
        System.out.println("Аккаунт заморожен, внесение средств не возможно");
    }
    @Override
    public void take (BigDecimal value){
        System.out.println("Аккаунт заморожен, снятие средств не возможно");
    }
}
