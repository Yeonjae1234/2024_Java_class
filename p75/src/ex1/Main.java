package ex1;

public class Main {
	public static void main(String[] args) {
		Student stLee = new Student();
		System.out.println(stLee.serialNum);  //참조변수로 static 변수 접근
		stLee.name="Lee";
		stLee.serialNum++;
		
		Student stSon=new Student();
		stLee.name="Son";
		System.out.println(stSon.serialNum);
		
		Student.serialNum++;
		System.out.println(Student.serialNum);  //클래스 이름으로 static 변수 접근도 가능
	}
}
