package day05.practice;

public class Department {

	String deptName;
	int deptId;
	
	public Department(String deptName, int deptId) {
		this.deptName = deptName;
		this.deptId = deptId;
	}
	public void printDepartmentDetails() {
		System.out.println("Department ID: " + deptId);
		System.out.println("Department Name: " + deptName);
	}
	@Override
	public String toString() {
		return "Department deptName=" + deptName + ", deptId=" + deptId + "";
	}
	
}
