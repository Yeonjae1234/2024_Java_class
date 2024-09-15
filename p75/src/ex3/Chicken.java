package ex3;

public class Chicken {
	static String brand = "JAVA";
	static int lastNo = 0;
	
	int no;
	String name;
	
	Chicken(String name){
		this.name = name;
		no = ++lastNo;
	}
	
	String info() {
		return "안녕하세요 "+brand+" 치킨 "+no+"호 "+name+"점입니다.";
	}
}
