/*���� 1
���� �빮�ڸ� �Է¹޾� 'A'�̸� "�Ǹ��մϴ�.", 'B'�̸� "�����ϴ�.", 'C'�̸� "�����Դϴ�.", 'D'�̸� "����ϼ���.", 
���ܹ̿��ڴ� "�߸��Է��ϼ̽��ϴ�."��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */

import java.util.Scanner; // ��ĳ�� ��� ȣ��

// Ŭ���� ����, Ŭ���� �̸� test1
public class test1 {

	// �޼ҵ� ����(public), ���� �޼ҵ�(static), ���� �������� ����(void), �޼ҵ� �̸�(main)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner ����� ���� sc ���� ����
		
		System.out.println("���� �빮�ڸ� �Է����ּ���: "); // ���� �빮�� �Է�
		String d = sc.next(); // �Է¹��� ���� �빮�� ����
		String c = ""; // ���� c���� ���� ����
		
		
		char b = d.charAt(0); // ������ b ����
		int a = d.length(); // �彺�� a���� d ���̸�ŭ ����
		
		
		if(a==1) { // a�� 1�� ������
			switch(b) { // switch�� ����
				case 'A' : // case A ����
					c = "�Ǹ��մϴ�."; // c���� �Ǹ��մϴ�. ����
					break; // switch�� ����
				case 'B' : // case B ����
					c = "�����ϴ�."; // c���� �����ϴ�. ����
					break; // switch�� ����
				case 'C' : // case C ����
					c = "�����Դϴ�."; // c���� �����Դϴ�. ����
					break; // switch�� ����
				case 'D' : // case D ����
					c = "����ϼ���."; // c���� ����ϼ���. ����
					break; // switch�� ����
				default :
					c = "�߸��Է��ϼ̽��ϴ�."; // c���� �Ǹ��մϴ�. ����
			} // End switch
		} // End if
		else { // ���� �ѱ��ڸ� �Ѱ�����
			c = "�ѱ��ڸ� �Է��ϼ���."; // c���� �ѱ��ڸ� �Է��ϼ��� ���
		} // End else
		System.out.println(c); // c �� ���
	} // End main

} // End class
