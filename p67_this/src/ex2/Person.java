package ex2;

public class Person {
	String name;
	int age;
	
	Person(){
		//  이 부분에 다른 코드 있다면 오류 발생
		this("이름 없음", 1);  //  아래 Person(String name, int age) 생성자 호출
	}
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
}
