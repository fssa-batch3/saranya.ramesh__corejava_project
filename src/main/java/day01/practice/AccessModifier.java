package day01.practice;

public class AccessModifier {
	private String a = "a";
	private String b = "b";
	private String c = "c";
	private static String d = "d";
	
	public static void main(String[] args) {
		
		AccessModifier alphabet = new AccessModifier();

		
		System.out.println(alphabet.a);
		System.out.println(alphabet.b);
		System.out.println(alphabet.c);
		System.out.println(d);		
	}
}
