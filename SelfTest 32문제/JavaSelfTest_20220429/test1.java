/*����1
���̵�� �н����� �Է� �޾�
��� ��ġ�ϸ� �α��� �ϼ̽��ϴ�.
��� ����ġ�ϸ� ���̵�� ��й�ȣ Ȯ�� ���
 */

import java.util.Scanner; // ��ĳ�� ��� ȣ��

//Ŭ���� ����, Ŭ���� �̸� test1
public class test1 {

	// �޼ҵ� ����(public), ���� �޼ҵ�(static), ���� �������� ����(void), �޼ҵ� �̸�(main)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner ����� ���� ���� sc ����
		System.out.println("���̵� �Է����ּ���: "); // ���̵� �Է�
		String id = sc.next(); // ���̵� ����
		
		Scanner sc1 = new Scanner(System.in); // // Scanner ����� ���� ���� sc1 ����
		System.out.println("��й�ȣ�� �Է����ּ���: "); // ��й�ȣ �Է�
		int password = sc1.nextInt(); // ��й�ȣ ����
		
		String id2 = "java"; // ���̵�
		int password2 = 1234; // ��й�ȣ
		
		// �Է°��� ���̵�� ����� ������
		if(id == id2 || password == password2) {
			System.out.println("�α��� �ϼ̽��ϴ�."); // �α���
		} else {
			System.out.println("���̵�� ��й�ȣ�� Ȯ�����ּ���."); // ���̵� ��й�ȣ Ȯ��
		}
	} // End main

} // Enc class
