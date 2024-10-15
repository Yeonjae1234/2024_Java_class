package ex5;

public class Main {

	public static void main(String[] args) {
		int[][] a = {{1,1,1},{2,2,2},{0,1,0}};
		int[][] b = {{3,3,3},{4,4,4},{5,5,100}};
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				System.out.print(a[i][j]+b[i][j]+" ");
			}
			System.out.println();
		}
	}
}
