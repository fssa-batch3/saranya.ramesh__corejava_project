package day02.practice;

public class Logger {
	
	public static void debug (String msg) {
		System.out.println("DEBUG: " + msg);
	}
	
	
	public static void info (String msg) {
		// TODO complete this code using the above template
	}
	
	public static void error (String msg) {
		// TODO complete this code using the above template
	}
	
	public static void debug (int num) {
		// TODO Complete this code
	}
	
	public static void info (int msg) {
		// TODO complete this code using the above template
	}
	public static void error (int msg) {
		// TODO complete this code using the above template
	}
	
	public static void main(String[] args) {
	
		// Create a new object 
		Logger obj = new Logger();
		
		obj.info("Saranya");
		obj.error("String");
		obj.debug("String");
		
		// Below the code for bug 
		obj.info(10);
		obj.error(10);
		obj.debug(10);
}
}
