package bank.accounts;

// public class CurrentAccount extends Account {
//     private double overdraftLimit = 5000;

//     public CurrentAccount(String accNo, String accHolder, double balance) {
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


public class CurrentAccount extends Account {
    public CurrentAccount(String accNo, String accHolder, double balance) {
        super(accNo, accHolder, balance);
    }

    @Override
    public void showAccountType() {
        System.out.println("Current Account");
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
        if(amount > 0 && getBalance() - amount >= -overdraftLimit) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Overdraft limit exceeded or invalid amount.");
        }
    }
}



// public class CurrentAccount extends BankAccount {
//     private double overdraftLimit;

//     public CurrentAccount(String accountNumber, String accountHolderName, double balance, double overdraftLimit) {
//         super(accountNumber, accountHolderName, balance);
//         this.overdraftLimit = overdraftLimit;
//     }

//     @Override
//     public void withdraw(double amount) {
//         if (amount > 0 && getBalance() - amount >= -overdraftLimit) {
//             setBalance(getBalance() - amount);
//             System.out.println("Withdrawn: " + amount);
//         } else {
//             System.out.println("Overdraft limit exceeded or invalid amount.");
//         }
//     }
// }
