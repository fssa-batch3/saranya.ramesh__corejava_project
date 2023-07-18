package day05.practice;

public class IciciATM implements ATM{

	 private static final double WITHDRAWAL_CHARGE = 10.0;
	    private Account account;
	    public IciciATM(Account account) {
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
	        if (balanceAfterWithdrawal < 10000) {
	            throw new Exception("Withdrawal failed! Balance cannot be less than 10000 after withdrawal.");
	        }
	        account.setBalance(balanceAfterWithdrawal);
	        return true;
	    }
	    @Override
	    public double getBalance() {
	        return account.getBalance();
	    }
}
