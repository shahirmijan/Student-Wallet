public class Budget {

    private int budgetID;
    private int accountID;
    private double currentSpent;
    private double spendingLimit;
    private TransactionType categoryForBudget;


    public Budget(int ID, int accountID, double currentSpent, double limit, TransactionType category) {
        budgetID = ID;
        this.accountID = accountID;
        this.currentSpent = currentSpent;
        spendingLimit = limit;
        categoryForBudget = category;
    }

    public int getBudgetID() {
        return this.budgetID;
    }

    public double getSpendingLimit() {
        return this.spendingLimit;
    }

    public double getCurrentSpent() {
        return this.currentSpent;
    }

    public void setCurrentSpend(double transactionAmount) {
        this.currentSpent = this.currentSpent + transactionAmount;
    }

    public TransactionType getCategoryForBudget() {
        return this.categoryForBudget;
    }

}