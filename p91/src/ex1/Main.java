package ex1;

public class Main {

	public static void main(String[] args) {
		Car c1=new Car();
		Bus b1=new Bus();
		
		// run은 Car의 메서드이고 c1은 Car의 인스턴스니까 사용 가능
		c1.run();
		
		// takeBus는 Bus의 메서드이고 b1은 Bus의 인스턴스니까 사용 가능
		b1.takeBus();
		
		// Bus 의 인스턴스 b1은 Car에 있는 메서드도 사용 가능
		// (Bus는 Car를 상속 받은 Car의 하위 클래스이기 때문)
		b1.run();
	}
}
