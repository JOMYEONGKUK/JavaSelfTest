/*���� 3
2020���̶�� �����Ͽ� ��� ������ �Է��ϸ� ������ ������ ����� �����غ��ÿ�.
 */

package cooperation; // ��Ű�� ����, ��Ű�� �̸� cooperation

import java.util.Scanner; // ��ĳ�� ��� ȣ��

//Ŭ���� ����, Ŭ���� �̸� test3
public class test3 {

	// �޼ҵ� ����(public), ���� �޼ҵ�(static), ���� �������� ����(void), �޼ҵ� �̸�(main)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner ����� ���� ���� Scanner ����
		
		int m, d, days = 0, t; // m:��, d:��, days = 0 : �ջ곯¥��, t:7�� ���� ������
		// ���� ���� �Է¹޽��ϴ�.
		System.out.printf("�� �Է� : "); // �� �Է�
		m = sc.nextInt(); // �� ����
		System.out.printf("�� �Է� : "); // �� �Է�
		d = sc.nextInt(); // �� ����

		System.out.println("�Է��� ��¥ : " + m + "�� " + d + "��"); // �Է��� ��¥, ���� ���
		
		// �Էµ� ���� ���ޱ����� ��¥�� �ջ�
		if (m == 1) // m�� 1�� ������
			days = 0;
		else if (m == 2) // m�� 2�� ������
			days = 31;
		else if (m == 3) // m�� 3�� ������
			days = 31 + 29;
		else if (m == 4) // m�� 4�� ������
			days = 31 + 29 + 31;
		else if (m == 5) // m�� 5�� ������
			days = 31 + 29 + 31 + 30;
		else if (m == 6) // m�� 6�� ������
			days = 31 + 29 + 31 + 30 + 31;
		else if (m == 7) // m�� 7�� ������
			days = 31 + 29 + 31 + 30 + 31 + 30;
		else if (m == 8) // m�� 8�� ������
			days = 31 + 29 + 31 + 30 + 31 + 30 + 31;
		else if (m == 9) // m�� 9�� ������
			days = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31;
		else if (m == 10) // m�� 10�� ������
			days = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
		else if (m == 11) // m�� 11�� ������
			days = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
		else if (m == 12) // m�� 12�� ������
			days = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;

		// �Էµ� ���� �ջ�
		days = days + d;
		
		// �ջ�� �ѳ�¥�� 7�� ���� �������� ���
		t = days % 7;
		
		// ������ ����մϴ�
		if (t == 1) // t�� 1�� ������
			System.out.println("�������Դϴ�."); // �������Դϴ� ���
		else if (t == 2) // t�� 2�� ������
			System.out.println("������Դϴ�."); // ������Դϴ� ���
		else if (t == 3) // t�� 3�� ������
			System.out.println("�ݿ����Դϴ�."); // �ݿ����Դϴ�. ���
		else if (t == 4) // t�� 4�� ������
			System.out.println("�����Դϴ�."); // �����Դϴ�. ���
		else if (t == 5) // t�� 5�� ������
			System.out.println("�Ͽ����Դϴ�."); // �Ͽ����Դϴ�. ���
		else if (t == 6) // t�� 6�� ������
			System.out.println("�������Դϴ�."); // �������Դϴ�. ���
		else if (t == 0) // t�� 0�� ������
			System.out.println("ȭ�����Դϴ�."); // ȭ�����Դϴ�. ���
	
	} // End main
} // End class
