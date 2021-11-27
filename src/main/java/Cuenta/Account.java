package Cuenta;

import java.text.ParseException;
import java.util.ArrayList;

public class Account {

    private double balance=0;
    private String date;
    private ArrayList<Transaction> transactions = new ArrayList<>();
    DateFormat dateFormat = new DateFormat();
    Transaction transaction;
    TransactionStatus status = new TransactionStatus();

    public Account(){}

    public Account(double balance) {
        this.balance = balance;
    }

    void deposit(int amount, String date) throws ParseException {
        this.date = date;
        if (status.isAccepted(this.balance, amount, "Credit")) {
            this.balance += amount;
            transactions.add(new Transaction(this.date, "Credit", amount, this.balance));
        }
    }

    void withdraw(int amount, String date) throws ParseException {
        this.date = date;
        if (status.isAccepted(this.balance, amount, "Debit")) {
            this.balance -= amount;
            transactions.add(new Transaction(this.date, "Debit", amount, this.balance));        
        }       
    }

    void transfer(int amount, String date, String destination) throws ParseException {
        this.date = date;
        if (status.isAccepted(this.balance, amount, "Transfer")) {
            this.balance -= amount;
            transactions.add(new Transaction(this.date, "Transfer", amount, this.balance));
        }
    }

    void printStatement() {
        transactions.sort((x, y) -> y.getDate().compareTo(x.getDate()));

        for (Transaction transaction : transactions) {
            System.out.println(transaction.getStrDate() + " " + 
            transaction.getType() + " " + 
            transaction.getAmount() + " " + 
            transaction.getActualBalance());
        }        
    }
}