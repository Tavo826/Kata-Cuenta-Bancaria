package Cuenta;

import java.text.ParseException;

public class StartApp {

    public static void main(String[] args) throws ParseException {

        Account account = new Account();

        account.deposit(1000, "10/01/2021");
        account.deposit(2000, "13/01/2021");
        account.withdraw(500, "14/01/2021");
        account.transfer(1000, "15/01/2021", "123456");

        account.printStatement();

    }
}
