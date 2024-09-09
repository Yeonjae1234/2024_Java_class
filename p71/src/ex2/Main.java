package ex2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s_James = new Student("James",5000);
		Student s_Tomas = new Student("Tomas",10000);
		
		Bus b100 = new Bus(100);
		s_James.takeBus(b100);
		s_James.info();
		b100.info();
		
		Subway s2 = new Subway(2);
		s_Tomas.takeSubway(s2);
		s_Tomas.info();
		s2.info();
		
		Student s_Edward = new Student("Edward", 15000);
		Taxi t2222 = new Taxi("2222");
		s_Edward.takeTaxi(t2222);
		s_Edward.info();
		t2222.info();
	}

}
