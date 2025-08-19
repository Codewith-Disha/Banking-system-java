// File: src/BankAccount.java
package bank.accounts;

import java.util.ArrayList;
import java.util.List;
import bank.accounts.Transaction;

public abstract class Account {
    protected String accountNumber;
    protected String accountHolder;
    protected double balance;

    public Account(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public abstract void showAccountType();
}


// package bank.accounts;

// public abstract class Account {
//     private String accountNumber;
//     private String accountHolder;
//     private double balance;

//     // Constructor
//     public Account(String accountNumber, String accountHolder, double balance) {
//         this.accountNumber = accountNumber;
//         this.accountHolder = accountHolder;
//         this.balance = balance;
//     }

//     // Getters & Setters (Encapsulation)
//     public double getBalance() { return balance; }
//     protected void setBalance(double balance) { this.balance = balance; }
//     public String getAccountNumber() { return accountNumber; }
//     public String getAccountHolder() { return accountHolder; }

//     // Abstract Methods
//     public abstract void deposit(double amount);
//     public abstract void withdraw(double amount);
// }


// public class BankAccount {
//     private String accountNumber;
//     private String accountHolder;
//     private double balance;

//     public BankAccount(String accountNumber, String accountHolder, double balance) {
//         this.accountNumber = accountNumber;
//         this.accountHolder = accountHolder;
//         this.balance = balance;
//     }

//     public void setBalance(double balance) {
//     this.balance = balance;
//     }


//     public void deposit(double amount) {
//         if (amount > 0) {
//             balance += amount;
//             System.out.println("Deposited: " + amount);
//         } else {
//             System.out.println("Invalid deposit amount.");
//         }
//     }

//     public void withdraw(double amount) {
//         if (amount > 0 && amount <= balance) {
//             balance -= amount;
//             System.out.println("Withdrawn: " + amount);
//         } else {
//             System.out.println("Invalid or insufficient balance.");
//         }
//     }

//     public void checkBalance() {
//         System.out.println("Current Balance: " + balance);
//     }

//     public double getBalance() {
//         return balance;
//     }
// }
