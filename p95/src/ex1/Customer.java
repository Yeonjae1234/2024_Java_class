package ex1;

public class Customer {
	int cstID;
	String cstName;
	String cstGrade;
	int bonusPoint;
	double bonusRatio;
	
	public Customer(int cstID, String cstName) {
		this.cstID=cstID;
		this.cstName=cstName;
		cstGrade="SILVER";
		bonusRatio=0.01;
	}
	
	void showInfo() {
		System.out.println("고객 이름 : "+cstName);
		System.out.println("등급 : "+cstGrade);
		System.out.println("현재 포인트 : "+bonusPoint);
	}
	
	int calcPrice(int price) {
		bonusPoint += price*bonusRatio;
		return price;
	}
	
}
