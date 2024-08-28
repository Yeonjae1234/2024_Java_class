package ex5;

public class Main {
	public static void main(String[] args) {
		Student s = new Student("홍길동",1,1,100,60,76); 
		s.info();
		System.out.println("점수 합계: "+s.getTotal());
	}
}
