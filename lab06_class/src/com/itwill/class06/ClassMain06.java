package com.itwill.class06;

public class ClassMain06 {

	public static void main(String[] args) {
		Account accountment = new Account(1234,0);
		Account accountment2 = new Account(4567,0);
		
		accountment.info();
		accountment2.info();

		
		// account1 계좌에 10,000원 입금
		
		accountment.deposit(10000);
		

		// account1 계좌에서 5000원 출금
		
		accountment.withdraw(5000);
		
		// account1에서 account2으로 2000원 이체
		accountment.transfer(accountment2, 5000);
		
		// account2에서 account으로 10000원 이체
		

	}

}
