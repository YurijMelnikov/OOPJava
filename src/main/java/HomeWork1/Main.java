package HomeWork1;

import java.math.BigDecimal;
import java.time.LocalDate;

class Main {
    public static void main(String[] args) {
        Account account = new Account(BigDecimal.valueOf(100.001));
        System.out.println(account.getAmount());
        account.put(BigDecimal.valueOf(0.5));
        System.out.println(account.getAmount());
        account.put(BigDecimal.valueOf(20.00));
        System.out.println(account.getAmount());
        account.take(BigDecimal.valueOf(120.50));
        System.out.println(account.getAmount());
        CreditAccount creditAccount = new CreditAccount(BigDecimal.valueOf(100));
        System.out.println(creditAccount.getAmount());
        creditAccount.put(BigDecimal.valueOf(20));
        System.out.println(creditAccount.getAmount());
        creditAccount.take(BigDecimal.valueOf(118.82));
        System.out.println(creditAccount.getAmount());
        DepositAccount depositAccount = new DepositAccount(BigDecimal.valueOf(100));
        System.out.println(depositAccount.getAmount());
        depositAccount.take(BigDecimal.valueOf(50));
        System.out.println(depositAccount.getAmount());
        depositAccount.take(BigDecimal.valueOf(2));
        System.out.println(depositAccount.getAmount());
    }
}