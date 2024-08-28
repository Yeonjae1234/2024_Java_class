package ex9;

public class Person {
	String name;
	int age;
	
	void info() {
		System.out.println(age+"살 "+name);
	}
	
	Person(){
		System.out.println("디폴트 생성자 실행");
	}
	
	Person(String n){
		System.out.println("첫번째 생성자 실행");
		name = n;
	}
	
	Person(String n, int a){
		System.out.println("두번째 생성자 실행");
		name = n;
		age = a;
	}
}

