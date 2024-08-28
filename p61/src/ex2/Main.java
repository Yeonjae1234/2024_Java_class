package ex2;

public class Main {

	public static void main(String[] args) {
		SutdaCard card1 = new SutdaCard();
		SutdaCard card2 = new SutdaCard();
		
		card1.num=3;
		card1.isKwang=false;
		
		card2.num=1;
		card2.isKwang=true;
		
		card1.info();
		card2.info();
	}
}
