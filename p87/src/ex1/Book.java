package ex1;

public class Book {
	public String bookName;
    public String author;
 
    public Book(String bookName, String author) {    // å �̸�, ���� �̸��� �Ű������� �޴� ������
        this.bookName = bookName;
        this.author = author;    
    }

    public void showBookInfo( ) {        //å ������ ����� �ִ� �޼���
        System.out.println(bookName + ", " + author);    
    } 
}
