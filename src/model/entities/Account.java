package model.entities;

import model.exceptions.DomainException;

public class Account {
	
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	
	public Account(Integer number, String holder, Double balance, Double withdrawLimit){
		
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}
	
	
	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}

	public Double getBalance() {
		return balance;
	}



	public Double deposit(Double balance) {
		
		return balance += balance ;
	}
	
	
	public Double withdraw(Double withdraw) throws DomainException {
		if(withdraw > withdrawLimit) {
			
			throw new DomainException("withdrawal cannot be greater than the withdrawal limit");
		}else if(withdraw > balance) {
			
			throw new DomainException("insufficient funds ");
		}
		
		return balance -= withdraw;
	}


	@Override
	public String toString() {
		return "New Balance: " + balance;
	}
	
	
}
