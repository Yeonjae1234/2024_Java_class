package ex11;

public class Member {
	private String id, name;
	private int point;
	
	public void setName(String n) {
		name = n;
	}
	
	public String getName() {
		return name;
	}
	
	public void setPoint(int p) {
		point = p;
	}
	
	public int getPoint() {
		return point;
	}
	
	public void setId(String i) {
		id = i;
	}
	
	public String getId() {
		return id;
	}
	
	public void info() {
		System.out.println(id+", "+name+", "+point);
	}
}
