package lab4.probC;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Commissioned extends Employee{
	private double commission;
	private double baseSalary;
	private List<Order> orders;
	
	public Commissioned(int empId, double commission, double baseSalary) {
		super(empId);
		this.commission = commission;
		this.baseSalary = baseSalary;
		this.orders = new ArrayList<>();
	}
	
	public void addOrder(String orderNo, LocalDate orderDate, double orderAmount) {
		orders.add(new Order(orderNo, orderDate, orderAmount, this));
	}

	@Override
	double calcGrossPay(int month, int yr) {
		return 0;
	}

}
