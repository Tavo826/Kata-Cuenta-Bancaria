package Cuenta;

public class TransactionStatus {
    
    public boolean isAccepted(double balance, double amount, String type) {
        switch (type) {
            case "Credit": if (amount > 0) return true;
            case "Debit": if (balance - amount >= 0) return true;
            case "Transfer": if (balance - amount >= 0) return true;                
            default: return false;
        } 
    }    
}
