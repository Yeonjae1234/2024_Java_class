package ex6;

public class Main {
	 public static void main(String[ ] args) {
		// 2. 객체 배열 생성
		Book[ ] library = new Book[5];

		// 3. 배열의 각 요소가 가리킬 인스턴스 생성 후 각 요소가 가리키게 함
		library[0] = new Book("태백산맥", "조정래");
		library[1] = new Book("데미안", "헤르만 헤세");
		library[2] = new Book("어떻게 살 것인가", "유시민");
		library[3] = new Book("토지", "박경리");
		library[4] = new Book("어린왕자", "생텍쥐페리");
		  
		for(int i = 0; i < library.length; i++) {
		    library[i].showBookInfo( );
		}
	 }
}
