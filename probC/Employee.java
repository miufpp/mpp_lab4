package lab4.probC;

import java.time.Month;
import java.time.Year;

public abstract class Employee {
	private int empId;
	private Paycheck paycheck;
	
	public Employee(int empId) {
		this.empId = empId;
	}
	
	public void print() {
		System.out.println(this);
	}
	
	public Paycheck calcCompensation(int month,  int year) {
		double grossPay = calcGrossPay(month, year);
		return new Paycheck(grossPay, Tax.FICA, Tax.STATE, Tax.LOCAL, Tax.MEDICARE, Tax.SOCIAL_SECURITY);
	}
	
	abstract double calcGrossPay(int month,  int year);
}
