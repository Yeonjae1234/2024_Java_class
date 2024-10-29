package ex3;
import java.util.ArrayList;

public class Student {
	int stID;
	String stName;
	ArrayList<Subject> subList = new ArrayList<Subject>();
	
	Student(int stID, String stName){
		this.stID=stID;
		this.stName=stName;
	}
	
	void addSubject(String subName, int score) {
		Subject subject = new Subject();
		subject.setSubName(subName);
		subject.setScore(score);
		subList.add(subject);
	}
	
	void info() {
		int total=0;
		for(Subject i:subList) {
			total += i.getScore();
			System.out.println(stName+" "+i.getSubName()+" ¼ºÀû : "+i.getScore());
		}
		System.out.println(stName+" ÃÑÁ¡ : "+total);
	}
}
