package day02.mise;

public class Student {

	String name;
	int id;
	String email;
	public static String academy;
	static int count = 0;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	static {
		academy = "FSSA";
	}
	
	Student() {
		Student.count++;
	}
}

