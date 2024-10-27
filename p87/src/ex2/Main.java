package ex2;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Dog> dogList = new ArrayList<Dog>();
		
		dogList.add(new Dog("Alice","Beagle"));
		dogList.add(new Dog("Buddy","Poddle"));
		dogList.add(new Dog("Charlie","Chihuahua"));
		dogList.add(new Dog("Daisy","Bichon"));
		dogList.add(new Dog("Emma","Maltese"));
		
		for(Dog dog:dogList) {
			System.out.println(dog.showDogInfo());
		}
	}
}
