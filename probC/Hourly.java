package lab4.probC;

public class Hourly extends Employee{
	private double hourlyWage;
	private double hoursPerWeek;
	
	public Hourly(int empId, double hourlyWage, double hoursPerWeek) {
		super(empId);
		this.hourlyWage = hourlyWage;
		this.hoursPerWeek = hoursPerWeek;
	}

	@Override
	double calcGrossPay(int month, int yr) {
		return 0;
	}

}
