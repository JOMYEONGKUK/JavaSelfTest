/*����5
����ڿ��� ���� �� ������ �����ϰ� �µ��� 25�� �̻��̸� �ݹ��� ��õ 25��
�̸��̸� ������� ��õ�ϴ� ���α׷��� �ۼ��غ���.
 */

import java.util.Scanner; // ��ĳ�� ��� ȣ��

//Ŭ���� ����, Ŭ���� �̸� test5
public class test5 {

	// �޼ҵ� ����(public), ���� �޼ҵ�(static), ���� �������� ����(void), �޼ҵ� �̸�(main)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner ����� ���� ���� sc ����
		System.out.println("���� �µ��� �Է����ּ���: "); // �µ� �Է�
		int temperature = sc.nextInt(); // �µ� ����
		
		// 25�� �̻��̸�
		if(temperature >= 25) {
			System.out.println("�ݹ����� ��������."); // �ݹ���
		} else {
			System.out.println("������� ��������."); // �����
		} 

	} // End main

} // End class
