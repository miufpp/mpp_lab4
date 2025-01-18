package lab4.probC;

public final class PayCheck {
	private double grossPay;
	private final double fica;
	private final double state;
	private final double local;
	private final double medicare;
	private final double socialSecurity;
	
	public PayCheck(double grossPay) {
		this.grossPay = grossPay;
		this.fica = grossPay * 0.23;
		this.state = grossPay * 0.05;
		this.local = grossPay * 0.01;
		this.medicare = grossPay *0.03;
		this.socialSecurity = grossPay * 0.075;
	}
	
	public double getNetPay() {
		return grossPay - (fica + state + local + medicare + socialSecurity);
	}
	public String print() {
		return "PayCheck [grossPay=" + grossPay + ", fica=" + fica + ", state=" + state + ", local=" + local
				+ ", medicare=" + medicare + ", socialSecurity=" + socialSecurity + "Net Pay="+ getNetPay() + "]";
	}
	
	
}
