package ex1;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// ArrayList ����
		ArrayList<Book> library = new ArrayList<Book>();
		
		// add()�޼���� ��� �� �߰�
		library.add(new Book("�¹���", "������"));
		library.add(new Book("���̾�", "�츣�� �켼"));
		library.add(new Book("��� �� ���ΰ�", "���ù�"));
		library.add(new Book("����", "�ڰ渮"));
		library.add(new Book("�����", "�������丮"));
		
		// for������ ����� ������ŭ ���
		for(int i = 0; i<library.size();i++) {
			Book book = library.get(i);
			book.showBookInfo();
		}
		
		System.out.println();
		
		// ���� for�� ����غ���
		for(Book book : library) {
			book.showBookInfo();
		}
	}
}
