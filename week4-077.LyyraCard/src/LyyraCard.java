public class LyyraCard {
    private double balance;

    public LyyraCard(double balanceAtStart) {
        // write code here
        this.balance = balanceAtStart;
    }

    public String toString() {
        // write code here
        return "The card has "+balance+" euros";
    }

    public void payEconomical() {
        // write code here
        if(balance >= 2.5) {
            this.balance -= 2.5;
        }
    }

    public void payGourmet() {
        // write code here

        if(balance >= 4) {
            this.balance -= 4;
        }
    }

    public void loadMoney(double amount) {
        // write code here
        if (amount >= 0) {
            this.balance += amount;
        }
        if (this.balance > 150) {
            this.balance = 150;
        }

    }
}
