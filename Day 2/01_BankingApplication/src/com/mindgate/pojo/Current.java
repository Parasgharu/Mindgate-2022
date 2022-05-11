package com.mindgate.pojo;

public class Current extends Account {
	private double overdrafBalance;

	public Current() {
		System.out.println("Default constructor of Current");
	}

	public Current(int accountNumber, String name, double balance, double overdrafBalance) {
		super(accountNumber, name, balance);
		this.overdrafBalance = overdrafBalance;
		System.out.println("Overloaded constructor of Current");
	}

	@Override
	public boolean withdraw(double amount) {
		if (amount >0) {
		if (getBalance()>0) {
			setBalance(getBalance()-amount);
			return true;
		}
			if (getBalance()==0 && amount <= getOverdrafBalance()) {
				
			}
			
			}
	
		return false;
	}

	@Override
	public boolean deposit(double amount) {

		return false;
	}

	public double getOverdrafBalance() {
		return overdrafBalance;
	}

	public void setOverdrafBalance(double overdrafBalance) {
		this.overdrafBalance = overdrafBalance;
	}

	@Override
	public String toString() {
		return "Current [overdrafBalance=" + overdrafBalance + ", toString()=" + super.toString() + "]";
	}

}
