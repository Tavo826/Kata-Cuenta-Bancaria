package Cuenta;

public class Transaction {

    private String date;
    private String type;
    private double amount;
    private double actualBalance;

    public Transaction(String date, String type, double amount, double actualBalance) {
        this.date = date;
        this.type = type;
        this.amount = amount;
        this.actualBalance = actualBalance;
    }

    public String getDate() {
        return date;
    }
    
    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getActualBalance() {
        return actualBalance;
    }

    public void setActualBalance(double actualBalance) {
        this.actualBalance = actualBalance;
    }
    
}
