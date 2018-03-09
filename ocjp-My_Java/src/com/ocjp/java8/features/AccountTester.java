package com.ocjp.java8.features;

public class AccountTester {

	public static void main(String[] args) {
		float amt = 2000f; 
		float interestRate = 5.0f;
		
		Account account = new Account();
		account.setInterestCalculator(
				(amount,interest) -> amount * interest
				);
		System.out.println(account.getInterestCalculator().calculateInterest(amt, interestRate));
	}

}
