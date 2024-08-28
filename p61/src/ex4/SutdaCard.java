package ex4;

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
	
	SutdaCard(int n, boolean k){
		num = n;
		isKwang = k;
	}
}
