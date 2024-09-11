package ex3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Machine ven = new Machine();
		ven.init_machine(); //음료 초기화
		
		Scanner sc = new Scanner(System.in);
		System.out.println("금액을 투입하세요");
		ven.show_cans(sc.nextInt());
		
		sc.nextLine();  //  버퍼에 남아있는 enter 제거
		
		System.out.println("음료를 선택하세요");
		int m = ven.sell_cans(sc.nextLine());
		System.out.println("잔액 : "+m);
	}
}
