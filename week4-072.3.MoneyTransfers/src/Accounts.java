
public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
//        Creates an account "A" with the balance of 100.0
//        Creates an account "B" with the balance of 0.0
//        Creates an account "C" with the balance of 0.0
//        Transfers 50.0 from account A to account B
//        Transfers 25.0 from account B to account C
        Account A = new Account("A",100);
        Account B = new Account("B",0);
        Account C = new Account("C",0);

        transfer(A,B,50);
        transfer(B,C,25);

    }

    public static void transfer(Account from, Account to, double howMuch){
        from.withdrawal(howMuch);
        to.deposit(howMuch);
    }
}
