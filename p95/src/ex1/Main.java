package ex1;

public class Main {

	public static void main(String[] args) {
		Customer c1 = new Customer(10010,"이순신");
		c1.cstName = "이순신";
		c1.cstID = 10010;
		c1.bonusPoint = 1000;
		
		VIPCustomer v1 = new VIPCustomer(10020,"김유신","1234");
		v1.cstName = "김유신";
		v1.cstID = 10020;
		v1.bonusPoint = 10000;
		
		int price=10000;
		System.out.println(c1.cstName+"의 지불금액 : "+c1.calcPrice(price));
		System.out.println(v1.cstName+"의 지불금액 : "+v1.calcPrice(price));
		
		
		Customer vc = new VIPCustomer(10030,"익명","1234");
		System.out.println(vc.cstName+"의 지불금액 : "+vc.calcPrice(price));
		
	}
}
