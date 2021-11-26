package Cuenta;

import java.text.ParseException;
import java.util.ArrayList;

public class Account {

    private double balance=0;
    private ArrayList<Transaction> transactions = new ArrayList<>();
    DateFormat dateFormat = new DateFormat();

    TransactionStatus status = new TransactionStatus();

    public Account(){}

    public Account(double balance) {
        this.balance = balance;
    }

    void deposit(int amount, String date) throws ParseException {
        if (status.isOk(this.balance, amount, "Credit")) {
            this.balance += amount;
            transactions.add(new Transaction(date, "Credit", amount, this.balance));
        }        
    }

    void withdraw(int amount, String date) throws ParseException {
        if (status.isOk(this.balance, amount, "Debit")) {
            this.balance -= amount;
            transactions.add(new Transaction(date, "Debit", amount, this.balance));        
        }
    }

    void transfer(int amount, String date, String destination) throws ParseException {
        if (status.isOk(this.balance, amount, "Transfer")) {
            this.balance -= amount;
            transactions.add(new Transaction(date, "Transfer", amount, this.balance));
        }
    }

    void printStatement() {
        transactions.sort((x, y) -> y.getDate().compareTo(x.getDate()));

        for (Transaction transaction : transactions) {
            System.out.println(transaction.getDate() + " " + 
            transaction.getType() + " " + 
            transaction.getAmount() + " " + 
            transaction.getActualBalance());
        }
        
    }

}