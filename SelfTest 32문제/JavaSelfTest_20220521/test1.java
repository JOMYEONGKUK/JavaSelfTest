/*���� 1
�̸�, �ֹι�ȣ 6�ڸ�(���ڸ�), ��ȭ��ȣ�� �Է� �޾� ����ϴ� ���α׷��� ����ÿ�.
 */

import java.util.Scanner; // ��ĳ�� ��� ȣ��

//Ŭ���� ����, Ŭ���� �̸� test1
public class test1 {

	// �޼ҵ� ����(public), ���� �޼ҵ�(static), ���� �������� ����(void), �޼ҵ� �̸�(main)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner ����� ���� sc ���� ����
		System.out.println("[�ʼ� ���� �Է�]"); // �ʼ� ���� �Է� ��� 
		System.out.print("1. �̸� : "); // �̸� �Է�
		String strName = sc.nextLine(); // �Էµ� �̸� ����
		
		System.out.print("2. �ֹι�ȣ 6�ڸ�(���ڸ�) : "); // �ֹι�ȣ �� 6�ڸ� �Է�
		String strSecurityNumber = sc.nextLine(); // �ֹι�ȣ 6�ڸ� ����
		
		System.out.print("3. ��ȭ��ȣ : "); // ��ȭ��ȣ �Է�
		String strPhoneNumber = sc.nextLine(); // ��ȭ��ȣ ����
		
		System.out.println("[�Է��� ����]"); // �Է��� ���� ���
		System.out.println("�̸� : " + strName); // �̸� ���
		System.out.println("�ֹι�ȣ 6�ڸ� : " + strSecurityNumber); // �ֹι�ȣ 6�ڸ� ���
		System.out.println("PH : " + strPhoneNumber); // ��ȭ��ȣ ���

	} // End main

} // End class