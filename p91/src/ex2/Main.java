package ex2;

public class Main {

	public static void main(String[] args) {
		Customer c1 = new Customer();
		c1.cstName = "이순신";
		c1.cstID = 10010;
		c1.bonusPoint = 1000;
		
		VIPCustomer v1 = new VIPCustomer();
		v1.cstName = "김유신";
		v1.cstID = 10020;
		v1.bonusPoint = 10000;
		
		c1.showInfo();
		System.out.println();
		v1.showInfo();
	}

}
