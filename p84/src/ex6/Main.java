package ex6;

public class Main {
	 public static void main(String[ ] args) {
		// 2. ��ü �迭 ����
		Book[ ] library = new Book[5];

		// 3. �迭�� �� ��Ұ� ����ų �ν��Ͻ� ���� �� �� ��Ұ� ����Ű�� ��
		library[0] = new Book("�¹���", "������");
		library[1] = new Book("���̾�", "�츣�� �켼");
		library[2] = new Book("��� �� ���ΰ�", "���ù�");
		library[3] = new Book("����", "�ڰ渮");
		library[4] = new Book("�����", "�������丮");
		  
		for(int i = 0; i < library.length; i++) {
		    library[i].showBookInfo( );
		}
	 }
}
