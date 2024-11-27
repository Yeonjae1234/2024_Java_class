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
		System.out.println("�� �̸� : "+cstName);
		System.out.println("��� : "+cstGrade);
		System.out.println("���� ����Ʈ : "+bonusPoint);
	}
	
	int calcPrice(int price) {
		bonusPoint += price*bonusRatio;
		return price;
	}
	
}
