package ex9;

public class Main {

	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person("김한주");
		Person p3 = new Person("김춘추",20);
		
		p1.info();
		p2.info();
		p3.info();
	}
}
