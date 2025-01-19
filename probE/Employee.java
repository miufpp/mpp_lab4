package lab4.probE;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private String name;
	private List<Account> accounts;
	private Account account;
	
	public Employee(String name) {
		this.name = name;
		this.accounts = new ArrayList<>();
	}
	
	public void addAccount(Account account) {
		accounts.add(account);
	}
	
	
	
	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

	public double computeUpdatedBalanceSum() {
		double sum = 0;
		for(Account acc: accounts) {
			if(acc != null) {
				sum += acc.computeUpdatedBalance();
			}
		}
		return sum;
	}
}
