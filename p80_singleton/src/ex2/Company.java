package ex2;

public class Company {
	private Company() {}
	private static Company instance = new Company();
	public static Company getInstance() {
		return instance;
	}
}

