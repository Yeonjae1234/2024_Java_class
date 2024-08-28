package ex8;

public class Main {

	public static void main(String[] args) {
		TV t = new TV(true, 5, 10);
		t.info();
		t.volumeUp();
		t.setCh(110);
		t.OnOff();
		t.info();
	}
}
