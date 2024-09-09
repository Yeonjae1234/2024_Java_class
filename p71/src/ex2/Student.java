package ex2;

public class Student {
	String name;
	int money;

	
	Student(String name, int money){
		this.name=name;
		this.money=money;
	}
	
	void info() {
		System.out.println(name+"의 남은 돈은 "+money+"원이다.");
	}
	
	void takeBus(Bus bus) {
		bus.take(1000);
		money-=1000;
	}
	
	void takeSubway(Subway sub) {
		sub.take(1500);
		money-=1500;
	}
	
	void takeTaxi(Taxi taxi) {
		taxi.take(10000);
		money-=10000;
	}
}
