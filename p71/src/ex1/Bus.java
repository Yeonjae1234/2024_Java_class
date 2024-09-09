package ex1;

public class Bus {
	int no;
	int count;
	int money;
	
	Bus(int no){
		this.no = no;
	}
	
	void info() {
		System.out.println("버스 "+no+"번의 승객은 "+count+"명, 수입은 "+money+"원");
	}
	
	void take(int money) {
		count++;
		this.money+=money;
	}

}
