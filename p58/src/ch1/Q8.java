package ch1;

public class Q8 {
	
	static void prime(int a) {
		int i;
		for(i=2;i<a;i++) {
			if(a%i==0) {
				System.out.println("not prime");
				return;
			}
		}
		System.out.println("prime");
		return;
	}

	public static void main(String[] args) {
		prime(17);
		prime(20);
	}
}
