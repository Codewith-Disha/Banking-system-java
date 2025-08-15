public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolderName, double balance, double interestRate) {
        super(accountNumber, accountHolderName, balance);
        this.interestRate = interestRate;
    }

    public void applyInterest() {
    double interest = getBalance() * interestRate / 100;
    setBalance(getBalance() + interest);
    System.out.println("Interest applied: " + interest);
    }

}
