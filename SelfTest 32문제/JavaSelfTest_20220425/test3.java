/*���� 3
�ڸ��� �ʵ��б� 1�г���� 4�г���� 4�г��� 70�� �̻� �հ� �׿ܴ� 60�� �̻� �հ�
�̸� �Ǵ��ϴ� ���α׷� �ۼ�
������ 0�̸� 100 �ʰ��̸� ������� ����϶�.
*/

import java.util.Scanner; // ��ĳ�� ��� ȣ�� 

// Ŭ���� ����, Ŭ���� �̸� test3
public class test3 {

	// �޼ҵ� ����(public), ���� �޼ҵ�(static), ���� �������� ����(void), �޼ҵ� �̸�(main)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner ����� ���� ���� sc ����
		System.out.println("�г�� ������ �Է����ּ���: "); // �г� ���� �����
		int grade = sc.nextInt(); // grade ����
		int score = sc.nextInt(); // score ����
		
		String msg = "�߸� �Է��ϼ̽��ϴ�."; // ��� ���� ����
		if(0 <= score && score <= 100) { // score�� 0���� ũ�ų� ���� 100���� �۰ų� ������ 
			if(60 <= score) { // score�� 60���� ũ�ų� ������
				if(grade != 4) { // grade�� 4�� �ٸ���
					msg = "�հ�";  // �հ� ���
				} else if(score >= 70) { // score�� 70���� ũ�ų� ������
					msg = "�հ�"; // �հ� ���
				} else { // ����
					msg = "���հ�"; // ���հ� ���
				}
			} else { // ����
				msg = "���հ�"; // ���հ� ���
			}
		}
		System.out.println(msg);  // msg ��� 
	} // End main

} // End class
