package bank.main;

import bank.accounts.Account;
//import bank.services.TransactionService;

import bank.accounts.*;
import bank.services.*;
//import bank.services.Transaction;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TransactionService service = new TransactionService();

        while(true) {
            System.out.println("\n=== Banking Menu ===");
            System.out.println("1. Create Savings Account");
            System.out.println("2. Create Current Account");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Apply Interest (Savings only)");
            System.out.println("6. View Transactions");
            System.out.println("7. Show All Accounts");
            System.out.println("8. Exit");
            System.out.print("Choose: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice) {
                case 1 -> {
                    System.out.print("Enter Acc No: ");
                    String accNo = sc.nextLine();
                    System.out.print("Enter Holder: ");
                    String holder = sc.nextLine();
                    service.addAccount(new SavingsAccount(accNo, holder, 0));
                }
                case 2 -> {
                    System.out.print("Enter Acc No: ");
                    String accNo = sc.nextLine();
                    System.out.print("Enter Holder: ");
                    String holder = sc.nextLine();
                    service.addAccount(new CurrentAccount(accNo, holder, 0));
                }
                case 3 -> {
                    System.out.print("Enter Acc No: ");
                    String accNo = sc.nextLine();
                    Account acc = service.findAccount(accNo);
                    if(acc != null) {
                        System.out.print("Enter Amount: ");
                        acc.deposit(sc.nextDouble());
                    } else System.out.println("Account not found!");
                }
                case 4 -> {
                    System.out.print("Enter Acc No: ");
                    String accNo = sc.nextLine();
                    Account acc = service.findAccount(accNo);
                    if(acc != null) {
                        System.out.print("Enter Amount: ");
                        acc.withdraw(sc.nextDouble());
                    } else System.out.println("Account not found!");
                }
                case 5 -> {
                    System.out.print("Enter Acc No: ");
                    String accNo = sc.nextLine();
                    Account acc = service.findAccount(accNo);
                    if(acc instanceof InterestApplicable ia) {
                        ia.applyInterest();
                    } else System.out.println("This account type has no interest.");
                }
                case 6 -> {
                    account.showTransactions();
                    break;
                }
                case 7 -> service.showAllAccounts();
                case 8 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice!");
            }
        }
    }
}



// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         SavingsAccount account = new SavingsAccount("1001", "John Doe", 5000, 5); // 5% interest

//         while (true) {
//             System.out.println("\n=== Banking Menu ===");
//             System.out.println("1. Deposit");
//             System.out.println("2. Withdraw");
//             System.out.println("3. Check Balance");
//             System.out.println("4. Apply Interest");
//             System.out.println("5. Exit");
//             System.out.print("Choose an option: ");
            
//             int choice = sc.nextInt();

//             switch (choice) {
//                 case 1:
//                     System.out.print("Enter amount: ");
//                     account.deposit(sc.nextDouble());
//                     break;
//                 case 2:
//                     System.out.print("Enter amount: ");
//                     account.withdraw(sc.nextDouble());
//                     break;
//                 case 3:
//                     account.checkBalance();
//                     break;
//                 case 4:
//                 if (account instanceof SavingsAccount) {
//                     ((SavingsAccount) account).applyInterest();
//                 } else {
//                     System.out.println("Interest not applicable for this account type.");
//                 }
//                 break;
//                 case 5:
//                     System.out.println("Goodbye!");
//                     return;
//                 default:
//                     System.out.println("Invalid option.");
//             }
//         }
//     }
// }
