package ex3;

public class Main {

	public static void main(String[] args) {
		Student sLee = new Student(1001, "Lee");
		Student sKim = new Student(1002, "Kim");
		sLee.addSubject("����", 100);
		sLee.addSubject("����", 50);
		
		sKim.addSubject("����", 70);
		sKim.addSubject("����", 85);
		sKim.addSubject("����", 100);

		sLee.info();
		sKim.info();
	}
}
