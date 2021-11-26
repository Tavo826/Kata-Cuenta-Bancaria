package Cuenta;

import java.text.ParseException;

public class StartApp {

    public static void main(String[] args) throws ParseException {

        Account account = new Account();

        account.deposit(1000, "10/01/2022");
        account.deposit(2000, "01/02/2021");
        account.withdraw(500, "22/03/2022");

        account.printStatement();

    }
}
