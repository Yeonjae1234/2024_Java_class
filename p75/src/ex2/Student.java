package ex2;

public class Student {
	public static int serialNum=1000;  
	public int stID;
	public String name;
	
	//stID = ++serialNum;
	
	//생성자 정의 - 학번 자동 부여하도록
	public Student() {
		serialNum++;    //학생이 생성될 때마다 증가
		stID=serialNum;  //증가된 값을 학번 멤버 변수에 부여
	}
}
