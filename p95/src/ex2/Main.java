package ex2;

public class Main {

	public static void main(String[] args) {
		Main a = new Main();   //  Main�� �ִ� moveAnimal �޼��带 ����ϱ� ���� Main Ŭ������ �ν��Ͻ� ���� 
		a.moveAnimal(new Human());
		a.moveAnimal(new Tiger());
		a.moveAnimal(new Eagle());
	}

	public void moveAnimal(Animal animal) {
		animal.move();
	}
}
