package ex2;

public class Customer {
	int cstID;
	String cstName;
	String cstGrade;
	int bonusPoint;
	double bonusRatio;
	
	Customer(){
		cstGrade = "SILVER";
		bonusRatio = 0.01;
	}
	
	void showInfo() {
		System.out.println("고객 이름 : "+cstName);
		System.out.println("등급 : "+cstGrade);
		System.out.println("현재 포인트 : "+bonusPoint);
	}
	
}
