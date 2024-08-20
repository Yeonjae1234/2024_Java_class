package ch1;

public class Q7 {
	static int big(int a,int b) {
		if(a>b) {
			return a;
		}
		else {
			return b;
		}
	}

	public static void main(String[] args) {
		System.out.println(big(10, 20));
	}

}
