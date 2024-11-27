package ex2;

public class Main {

	public static void main(String[] args) {
		Main a = new Main();   //  Main에 있는 moveAnimal 메서드를 사용하기 위해 Main 클래스의 인스턴스 생성 
		a.moveAnimal(new Human());
		a.moveAnimal(new Tiger());
		a.moveAnimal(new Eagle());
	}

	public void moveAnimal(Animal animal) {
		animal.move();
	}
}
