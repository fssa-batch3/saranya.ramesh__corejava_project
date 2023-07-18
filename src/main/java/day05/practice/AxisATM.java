package day05.practice;

public class AxisATM implements ATM{

	private static final double WITHDRAWAL_CHARGE = 5.0;
    private Account account;
    public AxisATM(Account account) {
        this.account = account;
    }
    @Override
    public boolean deposit(Account account, double amount) {
        if (amount <= 0) {
            return false;
        }
        account.setBalance(account.getBalance() + amount);
        return true;
    }
    @Override
    public boolean withdraw(Account account, double amount) throws Exception {
        double balanceAfterWithdrawal = account.getBalance() - amount - WITHDRAWAL_CHARGE;
        if (balanceAfterWithdrawal < 5000) {
            throw new Exception("Withdrawal failed! Balance cannot be less than 5000 after withdrawal.");
        }
        account.setBalance(balanceAfterWithdrawal);
        return true;
    }
    @Override
    public double getBalance() {
        return account.getBalance();
    }
}
