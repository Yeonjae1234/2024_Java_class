package ex5;

public class Student {
	String name;
	int ban, no, kor, eng, math;
	
	int getTotal() {
		return kor+eng+math;
	}
	
	Student(String n,int b, int n1, int k, int e, int m){
		name=n;
		ban=b;
		no=n1;
		kor=k;
		eng=e;
		math=m;
	}
	
	void info() {
		System.out.println(name+","+ban+","+no+","+kor+","+eng+","+math);
	}
}
