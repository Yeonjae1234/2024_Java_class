package ex3;

public class Main {

	public static void main(String[] args) {
		Student sLee = new Student(1001, "Lee");
		Student sKim = new Student(1002, "Kim");
		sLee.addSubject("국어", 100);
		sLee.addSubject("수학", 50);
		
		sKim.addSubject("국어", 70);
		sKim.addSubject("수학", 85);
		sKim.addSubject("영어", 100);

		sLee.info();
		sKim.info();
	}
}
