package oops;
/*Write a program to handle exceptions using try, catch, finally, throw, and throws keywords. */

class InsuffientBalance extends Exception {
    InsuffientBalance(String message) {
        super(message);
    }
}

class SBIBank {
    private double balance;
    public SBIBank(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(int amount) {
        this.balance += amount;
        System.out.println(amount + " Credited in your account");
        System.out.println("Current balance " + this.checkBalance());
    }

    public void withdraw(int amount) throws InsuffientBalance {
        if (amount > this.balance) {
            throw new InsuffientBalance("Insufficient bank balance");
        } else {
            this.balance -= amount;
            System.out.println(amount + " Debited from your account");
            System.out.println("Current balance " + this.checkBalance());
        }
    }

    public double checkBalance() {
        return this.balance;
    }
}

public class ExceptionHandling {

    public static void main(String[] args) {
        SBIBank bank = new SBIBank(5000);
        bank.checkBalance();
        try {
            bank.deposit(2000);
            bank.withdraw(8000);
        } catch (Exception e) {
            System.out.println("Exception : " + e);
        } finally {
            System.out.println("Finally block always runs...");
        }
    }

}
