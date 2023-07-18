package day05.practice;

public class App {
	public static void main(String[] args) {

	 Account axisAccount = new Account("AXIS123", 7000);
     Account iciciAccount = new Account("ICICI456", 12000);
     
     ATM axisATM = new AxisATM(axisAccount);
     ATM iciciATM = new IciciATM(iciciAccount);
     try {
         axisATM.withdraw(axisAccount, 2000);
         iciciATM.withdraw(iciciAccount, 3000);
         System.out.println("Axis Account Balance: " + axisATM.getBalance()); // Output: Axis Account Balance: 4995.0
         System.out.println("ICICI Account Balance: " + iciciATM.getBalance()); // Output: ICICI Account Balance: 8990.0
         axisATM.deposit(axisAccount, 1000);
         iciciATM.deposit(iciciAccount, 2000);
         System.out.println("Axis Account Balance: " + axisATM.getBalance()); // Output: Axis Account Balance: 5995.0
         System.out.println("ICICI Account Balance: " + iciciATM.getBalance()); // Output: ICICI Account Balance: 10990.0
     } catch (Exception e) {
         System.out.println(e.getMessage());
     }
}
}

