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
		System.out.println("�� �̸� : "+cstName);
		System.out.println("��� : "+cstGrade);
		System.out.println("���� ����Ʈ : "+bonusPoint);
	}
	
}
