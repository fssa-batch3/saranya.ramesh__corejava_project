package day02.mise;

public class App {

	public static void main(String[] args) {
		
	Academy academy = new Academy();
		
		academy.setName("Freshworks Software Academy");
		academy.setCode("FSSA");
		academy.setId(1234);
		
	Student std1 = new Student();
	
		std1.setName("Saranya");
		std1.setId(12);
		std1.setEmail("Saranya@gmail.com");
		System.out.println(Student.count);
	
	Student std2 = new Student();
		
		std2.setName("Saran");
		std2.setId(3);
		std2.setEmail("Saran@gmail.com");
		System.out.println(Student.count);
				
	}
}
