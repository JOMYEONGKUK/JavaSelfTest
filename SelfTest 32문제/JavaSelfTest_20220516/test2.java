/*���� 2
���� �Է¹޾� 3�� ����� "����" 5�� ����� "����" 3�� 5�� ���� �����"�ѽ�"�� ����Ͻÿ� 
 */

import java.util.Scanner; // ��ĳ�� ��� ȣ��

// Ŭ���� ����, Ŭ���� �̸� test2
public class test2 {

	// �޼ҵ� ����(public), ���� �޼ҵ�(static), ���ϰ� ����(void), �޼ҵ� �̸�(main)
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // Scanner ����� ���� ���� sc ����
		System.out.println("���� �Է��ϼ���: "); // �� �Է�
		int num = sc.nextInt(); // �Է¹��� �� ����
		
		// num�� 3���� �������� num�� 5�� ��������
		if(num % 3 == 0 && num % 5 == 0) {
			System.out.println("�ѽ�"); // �ѽ� ��� 
		} else if(num % 3 == 0) { // num�� 3���� ��������
			System.out.println("����"); // ���� ���
		} else if(num % 5 == 0) { // num�� 5�� ��������
			System.out.println("����"); // ���� ���
		}
	} // End main

} // End class
