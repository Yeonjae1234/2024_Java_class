package ex2;

public class Subway {
	int no;
	int count;
	int money;
	
	Subway(int no){
		this.no = no;
	}
	
	void info() {
		System.out.println(no+"호선의 승객은 "+count+"명, 수입은 "+money+"원");
	}
	
	void take(int money) {
		count++;
		this.money+=money;
	}
}
