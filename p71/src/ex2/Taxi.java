package ex2;

public class Taxi {
	String no;
	int money;
	
	Taxi(String no){
		this.no = no;
	}
	
	void info() {
		System.out.println(no+"번 택시의 수입은 "+money+"원이다.");
	}
	
	void take(int money) {
		this.money+=money;
	}
}
