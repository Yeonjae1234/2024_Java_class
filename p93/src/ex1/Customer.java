package ex1;

public class Customer {
	int cstID;
	String cstName;
	String cstGrade;
	int bonusPoint;
	double bonusRatio;
	
	Customer(){
		cstGrade = "SILVER";
		bonusRatio = 0.01;
		System.out.println("Customer() ������ ȣ��");
	}
	
	void showInfo() {
		System.out.println("�� �̸� : "+cstName);
		System.out.println("��� : "+cstGrade);
		System.out.println("���� ����Ʈ : "+bonusPoint);
	}
	
}
