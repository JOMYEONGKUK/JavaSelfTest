/*���� 1
��, ���� ���� �Է¹޾� ���ڸ��� ����ϴ� ���α׷��� �ۼ��Ͽ���.
 */

import java.util.Scanner; // ��ĳ�� ��� ȣ��

// Ŭ���� ����, Ŭ���� �̸� test1
public class test1 {

	// �޼ҵ� ����(public), ���� �޼ҵ�(static), ���� �������� ����(void), �޼ҵ� �̸�(main)
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);  // Scanner ����� ���� ���� scan ����
		
		int month = 0;  // ���� month ���� 0����
		int day = 0;  // ���� day ���� 0����
		
		System.out.print("���� �Է��� �ּ���: "); // �� �Է�
		month = scan.nextInt(); // �Է¹��� �� ����
		
		System.out.print("���� �Է��� �ּ���: "); // �� ����
		day = scan.nextInt(); // �Է¹��� �� ����
		
		switch(month) { //switch�� ����
			case 1: // case 1
				if (day >=20) { // day�� 20���� ũ�ų� ������
					System.out.println("�����ڸ�"); // �����ڸ� ���
				} else { 
					System.out.println("�����ڸ�"); // �����ڸ� ���
					} break; // switch Ż��
			case 2: // case 2
				if (day >=19) { // day�� 19���� ũ�ų� ������
					System.out.println("������ڸ�"); // ������ڸ� ���
				} else { System.out.println("�����ڸ�");  // �����ڸ� ���
				
				} 
				break; // switch Ż��
			case 3: // case 3
				if (day >=21) { // day�� 21���� ũ�ų� ������
					System.out.println("���ڸ�"); // ���ڸ� ���
				} else { System.out.println("������ڸ�"); // ������ڸ� ���
				
				} break; // switch Ż��
			case 4: // case 4
				if (day >=20) { // day�� 20���� ũ�ų� ������
					System.out.println("Ȳ���ڸ�"); // Ȳ���ڸ� ���
				} else { System.out.println("���ڸ�"); // ���ڸ� ���
				
				} break; // switch Ż��
			case 5: // case 5
				if (day >=21) { // day�� 21���� ũ�ų� ������
					System.out.println("�ֵ����ڸ�"); // �ֵ����ڸ� ���
				} else { System.out.println("Ȳ���ڸ�"); // Ȳ���ڸ� ���
				
				} break; // switch Ż��
			case 6: // case 6
				if (day >=22) { // day�� 22���� ũ�ų� ������
					System.out.println("���ڸ�"); // ���ڸ� ���
				} else { 
					System.out.println("�ֵ����ڸ�"); // �ֵ����ڸ� ���
				} 
				
				break; // switch Ż��
			case 7: // case 7
				if (day >=23) { // day�� 23���� ũ�ų� ������
					System.out.println("�����ڸ�");  // �����ڸ� ���
				} else { System.out.println("���ڸ�"); // ���ڸ� ���
				
				} break; // switch Ż��
			case 8: // case 8
				if (day >=23) { // day�� 23���� ũ�ų� ������
					System.out.println("ó���ڸ�"); // ó���ڸ� ���
				} else { System.out.println("�����ڸ�"); // �����ڸ� ���
				
				} 
				break; // switch Ż��
			case 9: // case 9
				if (day >=24) { // day�� 24���� ũ�ų� ������
					System.out.println("õĪ�ڸ�"); // õ���ڸ� ���
				} else { 
					System.out.println("ó���ڸ�"); // ó���ڸ� ���
				} 
				break; // switch Ż��
			case 10: // case 10
				if (day >=23) { // day�� 23���� ũ�ų� ������
					System.out.println("�����ڸ�"); // �����ڸ� ���
				} else { 
					System.out.println("õĪ�ڸ�"); // õĪ�ڸ� ���
				} 
				break; // switch Ż��
			case 11: // case 11
				if (day >=23) { // day�� 23���� ũ�ų� ������
					System.out.println("����ڸ�"); // ����ڸ� ���
				} else { 
					System.out.println("�����ڸ�"); // �����ڸ� ���
				} 
				break; // switch Ż��
			case 12: // case 12
				if (day >=25) { // day�� 25���� ũ�ų� ������
					System.out.println("�����ڸ�");  // �����ڸ� ���
				} else { 
					System.out.println("����ڸ�"); // ����ڸ� ���
				} 
				break; // switch Ż��
		} // End switch��
	} // End main
} // End class


