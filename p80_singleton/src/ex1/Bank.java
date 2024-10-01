package ex1;

public class Bank {
	private String point; //은행 지점
	static double interest; //이자율
	
	public Bank(String point){
		this.point=point;
	}
	
	public void getInfo() {
		System.out.println("지점 위치 : "+point+", 이자율 : "+interest);
	}
}
