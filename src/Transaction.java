import java.util.Date;

public class Transaction {

    private int transactionID;
    private double transactionAmount;
    private String transactionName;
    private Date transactionDate;
    private TransactionType categoryOfTransaction;
    private int accountID;

    public Transaction(int ID, int accountID, String name, double amount, Date date, TransactionType category) {
        transactionID = ID;
        this.accountID = accountID;
        transactionName = name;
        transactionDate = date;
        transactionAmount = amount;
        categoryOfTransaction = category;
    }

    public int getTransactionID() {
        return this.transactionID;
    }

    public double getTransactionAmount() {
        return this.transactionAmount;
    }

    public Date getTransactionDate() {
        return this.transactionDate;
    }

    public TransactionType getCategoryOfTransaction() {
        return this.categoryOfTransaction;
    }

    public String getTransactionName() {
        return this.transactionName;
    }

}