package bank.accounts;

import bank.services.InterestApplicable;

// public class SavingsAccount extends Account implements InterestApplicable {
//     private double interestRate = 0.05; // 5%

//     public SavingsAccount(String accNo, String accHolder, double balance) {
//         super(accNo, accHolder, balance);
//     }

//     @Override
//     public void deposit(double amount) {
//         if (amount > 0) {
//             setBalance(getBalance() + amount);
//             addTransaction("Deposit", amount);
//             System.out.println("Deposited: " + amount);
//         } else {
//             System.out.println("Invalid amount.");
//         }
//     }
public class SavingsAccount extends Account {
    public SavingsAccount(String accNo, String accHolder, double balance) {
        super(accNo, accHolder, balance);
    }

    @Override
    public void showAccountType() {
        System.out.println("Savings Account");
    }
}

    // @Override
    // public void deposit(double amount) {
    //     if(amount > 0) {
    //         setBalance(getBalance() + amount);
    //         System.out.println("Deposited: " + amount);
    //     }
    // }

    @Override
    public void withdraw(double amount) {
        if(amount > 0 && getBalance() >= amount) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    @Override
    public void applyInterest() {
        double interest = getBalance() * interestRate;
        setBalance(getBalance() + interest);
        System.out.println("Interest applied: " + interest);
    }
}



// public class SavingsAccount extends BankAccount {
//     private double interestRate;

//     public SavingsAccount(String accountNumber, String accountHolderName, double balance, double interestRate) {
//         super(accountNumber, accountHolderName, balance);
//         this.interestRate = interestRate;
//     }

//     public void applyInterest() {
//     double interest = getBalance() * interestRate / 100;
//     setBalance(getBalance() + interest);
//     System.out.println("Interest applied: " + interest);
//     }

// }
