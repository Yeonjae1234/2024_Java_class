package ex2;

public class Main {
	public static void main(String[] args) {
		Student stLee=new Student();
		stLee.name="Lee";
		System.out.println(stLee.name+" 학번: "+stLee.stID);
		
		Student stSon=new Student();
		stSon.name="Son";
		System.out.println(stSon.name+" 학번: "+stSon.stID);
	}
}
