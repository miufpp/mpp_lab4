package lab4.probC;

public abstract class Employee {
	private int empId;
	private PayCheck paycheck;
	
	public Employee(int empId) {
		this.empId = empId;
		
		
	}
	public void print() {
		
	}
	
	
	
	public PayCheck calcCompensation(int month, int year) {
		return null;
	}
	
	abstract double calcGrossPay(int month, int yr);
}
