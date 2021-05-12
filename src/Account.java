import java.util.Date;

public class Account {

    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private int accountID;
    private double accountAmount;
    private double income;
    private Date date;


    public Account(int ID, String fname, String sname, String uname, String pword, double amount, double income, Date date) {
        accountID = ID;
        accountAmount = amount;
        firstName = fname;
        lastName = sname;
        userName = uname;
        password = pword;
        this.income = income;
        this.date = date;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAccountID() {
        return this.accountID;
    }

    public double getAccountAmount() {
        return this.accountAmount;
    }

    public void setAmount(double transaction) {
        this.accountAmount = this.accountAmount - transaction;
    }

    public void increaseAmount(double transaction) {
        this.accountAmount = this.accountAmount + transaction;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public double getIncome() {
        return this.income;
    }

    public Date getDate() {
        return this.date;
    }
}