// Account Simulation Method
public class PaymentSystem {
    private double balance = 5000.0;

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Error: Requested UGX " + amount + " but balance is only UGX " + balance);
        }
        balance -= amount;
        System.out.println("Withdrawal successful. New balance: UGX " + balance);
    }
}
