/*���� 2
String 2���� �迭�� �̿��� �ܾ���߱� ���� - ����ܾ��� ���� �Է��� �����̸� �����Դϴ�.
�����̸� Ʋ�Ƚ��ϴ�. ������ ~�Դϴ�. ��� ����ϴ� ���α׷��� ����ÿ�.
 */

import java.util.Scanner; // ��ĳ�� ��� ȣ��

// Ŭ���� ����, Ŭ���� �̸� test2
public class test2 {

	// �޼ҵ� ����(public), ���� �޼ҵ�(static), ���ϰ� ����(void), �޼ҵ� �̸�(main)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner ����� ���� ���� sc ����
		
		// ���ڿ� Ÿ�� 2���� �迭 a ���� ���ڿ� ����
		String[][] a = new String[][]{{"Chair", "����"},{"Computer", "��ǻ��"},{"Integer", "����"}};
		
		int i; // ������ ���� i����
		
		// for�� ���� i�� 0����, i�� a���̺��� ������, i ������++
		for(i=0; i<a.length; i++) {
			
			
			// ���� ���
			System.out.printf("Q%d. %s�� ����? ", i+1, a[i][0]);
			
			// ����� 2���� �迭 ���ڿ��� ���̸�
			if(a[i][1].equals(sc.next())) {
				System.out.println("�����Դϴ�.\n"); // �����Դϴ�. ���
			} else {
				System.out.printf("Ʋ�Ƚ��ϴ�. \n������ %s�Դϴ�.\n\n", a[i][1]); // Ʋ�Ƚ��ϴ�. �� ������ְ� ������ ���
			}
		} // End for��

	} // End main

} // End class
