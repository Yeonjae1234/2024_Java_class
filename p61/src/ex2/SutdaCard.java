package ex2;

public class SutdaCard {
	int num;
	boolean isKwang;
	
	void info() {
		if (isKwang==true) {
			System.out.println(num+"K");
		}
		else {
			System.out.println(num);
		}
	}
}
