package HomeWork2;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Account account = new Account(BigDecimal.valueOf(100.001));
        System.out.println(account.getAmount());
        account.put(BigDecimal.valueOf(20));
        System.out.println(account.getAmount());
        account.take (BigDecimal.valueOf(119));
        System.out.println(account.getAmount());
        CreditAccount creditAccount = new CreditAccount(BigDecimal.valueOf(100.001));
        System.out.println(creditAccount.getAmount());
        creditAccount.put(BigDecimal.valueOf(10));
        System.out.println(creditAccount.getAmount());
        creditAccount.take(BigDecimal.valueOf(10));
        System.out.println(creditAccount.getAmount());
        DepositAccount depositAccount = new DepositAccount(BigDecimal.valueOf(140));
        System.out.println(depositAccount.getAmount());
        depositAccount.put(BigDecimal.valueOf(60));
        System.out.println(depositAccount.getAmount());
        depositAccount.take(BigDecimal.valueOf(50));
        System.out.println(depositAccount.getAmount());
        FixedAmountAccount fixedAmountAccount = new FixedAmountAccount(BigDecimal.valueOf(101));
        System.out.println(fixedAmountAccount.getAmount());
        fixedAmountAccount.put (BigDecimal.valueOf(10));
        System.out.println(fixedAmountAccount.getAmount());
        fixedAmountAccount.take(BigDecimal.valueOf(10));
    }
}
