package day05.practice;

public class Main {

	 public static void main(String[] args) {
	        // Create a Department object
	        Department department = new Department("Biology", 101);
	        
	        // Create a Student object and assign the department
	        Student student = new Student("Saranya", 12345, department);
	        // Print the Student details
	        System.out.println(student.toString());
	    }
}
