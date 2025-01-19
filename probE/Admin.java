package lab4.probE;

import java.util.List;

public class Admin {
	public static double computeUpdatedBalanceSum(List<Employee> list) {
		double sum = 0.0;
		if(list == null) throw new NullPointerException();
		for(Employee e: list) {
//			System.out.println(e.computeUpdatedBalanceSum());
			sum += e.computeUpdatedBalanceSum();
		}
		return sum;
	}
}
