package ex1;

public class Main {

	public static void main(String[] args) {
		Car c1=new Car();
		Bus b1=new Bus();
		
		// run�� Car�� �޼����̰� c1�� Car�� �ν��Ͻ��ϱ� ��� ����
		c1.run();
		
		// takeBus�� Bus�� �޼����̰� b1�� Bus�� �ν��Ͻ��ϱ� ��� ����
		b1.takeBus();
		
		// Bus �� �ν��Ͻ� b1�� Car�� �ִ� �޼��嵵 ��� ����
		// (Bus�� Car�� ��� ���� Car�� ���� Ŭ�����̱� ����)
		b1.run();
	}
}
