package Cuenta;

import java.text.ParseException;
import java.time.LocalDate;

public class Transaction {

    private LocalDate date;
    private String type;
    private double amount;
    private double actualBalance;

    DateFormat dateFormat = new DateFormat();

    public Transaction(String date, String type, double amount, double actualBalance) throws ParseException {
        this.date = dateFormat.dateTransform(date);;
        this.type = type;
        this.amount = amount;
        this.actualBalance = actualBalance;
    }

    public LocalDate getDate() { return date;}
    
    public String getType() { return type; }

    public double getAmount() { return amount;}

    public void setDate(LocalDate date) { this.date = date; }

    public void setType(String type) { this.type = type; }

    public void setAmount(double amount) { this.amount = amount; }

    public double getActualBalance() { return actualBalance; }

    public void setActualBalance(double actualBalance) { this.actualBalance = actualBalance; }
    
}
