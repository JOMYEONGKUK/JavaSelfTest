/*����2
����ڷκ��� ������ �޾Ƽ� �� ������ 2�� 3���� ������ ������ �� �ִ��� ����϶�.
 */

import java.util.Scanner; // ��ĳ�� ��� ȣ��

//Ŭ���� ����, Ŭ���� �̸� test2
public class test2 {

	// �޼ҵ� ����(public), ���� �޼ҵ�(static), ���� �������� ����(void), �޼ҵ� �̸�(main)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner ����� ���� ���� sc ����
		System.out.println("������ �Է����ּ���: "); // ���� �Է�
		int num = sc.nextInt();  // ���� ����
		
		// num�� 2�� 3���� ����������
		if(num % 2 == 0 && num % 3 == 0) {
			System.out.println("2�� 3���� ������ ������"); // ���̸� ���
		} else {
			System.out.println("2�� 3���� ������ �������� �ʽ��ϴ�."); // �����̸� ���
		}

	} // End main

} // End class
