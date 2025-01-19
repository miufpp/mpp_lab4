package lab4.probC;

public final class Paycheck {
	private double grossPay;
	private final double fica;
	private final double state;
	private final double local;
	private final double medicare;
	private final double socialSecurity;
	
	
	 
	public Paycheck(double grossPay, Tax fica, Tax state, Tax local, Tax medicare, Tax socialSecurity) {
		super();
		this.grossPay = grossPay;
		this.fica = fica.getTaxRate();
		this.state = state.getTaxRate();
		this.local = local.getTaxRate();
		this.medicare = medicare.getTaxRate();
		this.socialSecurity = socialSecurity.getTaxRate();
	}
	public double getNetPay() {
		return grossPay - (fica + state + local + medicare + socialSecurity);
	}
	
	public void print() {
		System.out.println(this);
	}
	
	@Override
    public String toString(){
        return String.format("Gross Pay: $%.2f\nFICA: $%.2f\nState: $%.2f\nLocal: $%.2f\nMedicare: $%.2f\nSocial Security: $%.2f\nNet Pay: $%.2f", grossPay, grossPay * fica, grossPay * state, grossPay * local, grossPay * medicare, grossPay * socialSecurity, getNetPay());
    }
	
	
}
