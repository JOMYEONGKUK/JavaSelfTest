/*���� 2
���� �� ���� �Է¹޾� �� ���� 3�� ������� �Ǵ��غ���.
*/

import java.util.Scanner; // ��ĳ�� ��� ȣ��

// Ŭ���� ����, Ŭ���� �̸� test2
public class test2 {

	// �޼ҵ� ����(public), ���� �޼ҵ�(static), ���� �������� ����(void), �޼ҵ� �̸�(main)
	public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in); // Scanner ����� ���� ���� num ����
		System.out.println("���� �Է�: "); // ���� �Է�
		int nums = num.nextInt(); // �Էµ� ���� ����
		
		String msg = "3�� ����� �ƴմϴ�."; // ���ڿ� ���� 
		if(nums % 3 == 0) { // nums�� 3���� ��������
			msg = "3�� ��� �Դϴ�."; // ���̸� ���
		}
		
		System.out.println("�Է��Ͻ� ������ " + msg);
		
	} // End main

} // End class
