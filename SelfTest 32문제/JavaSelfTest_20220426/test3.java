/*���� 3
�ϳ��� ������ �Է� �ް�, ������ ���� ���� �Է¹��� ����
��� �������� ȭ�鿡 ����ϼ���.
*/

import java.util.Scanner; // ��ĳ�� ��� ȣ��

//Ŭ���� ����, Ŭ���� �̸� test3
public class test3 {

	// �޼ҵ� ����(public), ���� �޼ҵ�(static), ���� �������� ����(void), �޼ҵ� �̸�(main)
	public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in); // Scanner ����� ���� ���� num ����
		
		System.out.println("������ �Է����ּ���: "); // ���� �Է�
		int num1 = num.nextInt(); // ���� ����
		System.out.println("���� ���� �Է����ּ���: "); // ������ �Է�
		int num2 = num.nextInt(); // ������ ����
		
		System.out.printf("�� : %d\n", num1/num2); // �� ���
		System.out.printf("������ : %d\n", num1%num2); // ������ ���

	} // End main

} // End class
