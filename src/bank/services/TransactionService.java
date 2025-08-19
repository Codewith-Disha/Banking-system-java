import bank.accounts.Account;


import bank.accounts.Account;
import java.util.ArrayList;

// public class TransactionService {
//     private ArrayList<Account> accounts = new ArrayList<>();

//     public void addAccount(Account acc) {
//         accounts.add(acc);
//     }

//     public Account findAccount(String accNo) {
//         for(Account acc : accounts) {
//             if(acc.getAccountNumber().equals(accNo)) return acc;
//         }
//         return null;
//     }

//     public void showAllAccounts() {
//         for(Account acc : accounts) {
//             System.out.println(acc.getAccountNumber() + " - " + acc.getAccountHolder() +
//                                " | Balance: " + acc.getBalance());
//         }
//     }
// }

package bank.services;

import bank.accounts.Account;
import java.util.List;

public class TransactionService {
    public void printAccounts(List<Account> accounts) {
        for (Account acc : accounts) {
            System.out.println(acc.getAccountNumber() + " - " + acc.getAccountHolder() +
                               " | Balance: " + acc.getBalance());
        }
    }
}
