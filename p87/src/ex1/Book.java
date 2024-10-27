package ex1;

public class Book {
	public String bookName;
    public String author;
 
    public Book(String bookName, String author) {    // 책 이름, 저자 이름을 매개변수로 받는 생성자
        this.bookName = bookName;
        this.author = author;    
    }

    public void showBookInfo( ) {        //책 정보를 출력해 주는 메서드
        System.out.println(bookName + ", " + author);    
    } 
}
