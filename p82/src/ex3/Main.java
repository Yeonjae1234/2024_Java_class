package ex3;

public class Main {

	public static void main(String[] args) {
		double[ ] data = new double[5];
		   
     	data[0] = 10.0;    // 첫 번째 요소에 값 10.0 대입
     	data[1] = 20.0;    // 두 번째 요소에 값 20.0 대입
     	data[2] = 30.0;    // 세 번째 요소에 값 30.0 대입
  
     	for(double i : data) {
        	System.out.println(i);
      	}
	}
}
