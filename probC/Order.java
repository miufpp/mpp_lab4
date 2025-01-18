package lab4.probC;

import java.time.LocalDate;

public class Order {
	private String orderNo;
	private LocalDate orderDate;
	private double orderAmount;
	private Employee owner;
	
	public Order(String orderNo, LocalDate orderDate, double orderAmount, Employee owner) {
		this.orderNo = orderNo;
		this.orderDate = orderDate;
		this.orderAmount = orderAmount;
		this.owner = owner;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public double getOrderAmount() {
		return orderAmount;
	}

	@Override
	public String toString() {
		return "Order [orderNo=" + orderNo + ", orderDate=" + orderDate + ", orderAmount=" + orderAmount + "]";
	}
	
	
}
