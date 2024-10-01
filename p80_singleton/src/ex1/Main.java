package ex1;

public class Main {
	public static void main(String[] args) {
		Bank b1 = new Bank("부산");
		Bank.interest = 10.0;
		Bank b2 = new Bank("대구");		
		Bank b3 = new Bank("울산");
		
		b1.getInfo();
		b2.getInfo();
		b3.getInfo();
		
		Bank.interest = 5.0;	//클래스명, 스태틱변수(메서드)로 메모리할당 없이 직접 접근이 가능하다.
		
		b1.getInfo();
		b2.getInfo();
		b3.getInfo();
		
	}
}
