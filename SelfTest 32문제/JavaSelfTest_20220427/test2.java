/*����2
2�ڸ��� ����(10~99)�� �Է� �ް� 10�� �ڸ��� 1���ڸ���
������ �Ǻ��ϴ� ���α׷��� ����ÿ�.
 */

import java.util.Scanner; // ��ĳ�� ��� ȣ��

//Ŭ���� ����, Ŭ���� �̸� test2
public class test2 {

	// �޼ҵ� ����(public), ���� �޼ҵ�(static), ���� �������� ����(void), �޼ҵ� �̸�(main)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner ����� ���� ���� sc ����
		System.out.println("2�ڸ��� ������ �Է����ּ���(10~99): ");  // 2�ڸ��� ���� �Է�
		int integer = sc.nextInt(); // �Է¹��� ���� ����
		
		// integer�� 10���� �������� integer�� ���� 10���� ��������
		if(integer / 10 == integer % 10) {
			System.out.println("Yes 10�� �ڸ��� 1�� �ڸ��� �����ϴ�."); // ���̸� ���
		} else {
			System.out.println("No! 10�� �ڸ��� 1�� �ڸ��� �ٸ��ϴ�."); // �����̸� ���
		}

	} // End main

} // End class
