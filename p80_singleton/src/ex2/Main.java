package ex2;

public class Main {

	public static void main(String[] args) {
		Company C1 = Company.getInstance();
		Company C2 = Company.getInstance();
		System.out.println(C1 == C2);	
	}
}
