package Cuenta;

import java.util.ArrayList;

public class Account {

    private double balance=0;
    private ArrayList<Transaction> transactions = new ArrayList<>();

    public Account(){}

    public Account(double balance) {
        this.balance = balance;
    }

    void deposit(int amount, String date) {
        this.balance += amount;
        transactions.add(new Transaction(date, "Credit", amount, balance));
    }

    void withdraw(int amount, String date){
        this.balance -= amount;
        transactions.add(new Transaction(date, "Debit", amount, balance));        
    }

    void printStatement() {
        for (Transaction transaction : transactions) {
            System.out.println(transaction.getDate() + " " + transaction.getType() + " " + " " + transaction.getAmount() + " " + transaction.getActualBalance());
        }
    }
}