package ex3;

public class Main {
	public static void main(String[] args) {
		Chicken store1 = new Chicken("판교");
		Chicken store2 = new Chicken("강남");
		Chicken store3 = new Chicken("제주");
		
		System.out.println(store1.info());
		System.out.println(store2.info());
		System.out.println(store3.info());

	}
}
