package oops;
/* Write a program to demonstrate encapsulation.*/

class Bank {

    private int balance;

    public Bank(int balance) {
        this.balance = balance;
    }

    /** Get the current balance */
    public int checkBalance() {
        return balance;
    }

    public void deposit(int amount) {
        balance = balance + amount;
        System.out.println(amount + " Creadeted in your account");
        System.out.println("Current balance " + checkBalance());
    }

    public void withdraw(int amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance!");
            return;
        }
        balance = balance - amount;
        System.out.println(amount + " Debited from your account");
        System.out.println("Current balance " + checkBalance());
    }
}

public class Encapsulation {

    public static void main(String[] args) {
        Bank bank = new Bank(5000);
        // We cannot have directly access to the private variables defined in the class, we can do it using the getter and setter method
        // bank.balance; //It will throw an error
        System.out.println("Current balance : " + bank.checkBalance());
        bank.deposit(2500);
        bank.withdraw(2000);
    }

}
