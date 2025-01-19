package lab4.probC;

public enum Tax {
	FICA(0.23), STATE(0.05), LOCAL(0.01), MEDICARE(0.03), SOCIAL_SECURITY(0.075);
	private double taxRate;
	
	Tax(double taxRate){
		this.taxRate = taxRate;
	}
	
	public double getTaxRate() {
		return this.taxRate;
	}
}
