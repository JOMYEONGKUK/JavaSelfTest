/*���� 1
�̸�, ����, Ű, �ڱ�Ұ��� �Է¹޾� ȭ�鿡 ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
*/

import java.util.Scanner; // ��ĳ�� ��� ȣ��

// Ŭ���� ����, Ŭ���� �̸� test1
public class test1 {

	// �޼ҵ� ����(public), ���� �޼ҵ�(static), ���� �������� ����(void), �޼ҵ� �̸�(main)
	public static void main(String[] args) {
		
		String name; // �̸�
		int age; // ����
		double height; // Ű
		String intro; // �ڱ�Ұ�
		String buffer; 
		
		Scanner sc = new Scanner(System.in); // Scanner ����� ���� ���� sc ����
		System.out.println("�̸��� �Է����ּ���: "); // �̸� �Է�
		name = sc.next(); // �̸� ����
		System.out.println("���̸� �Է����ּ���: "); // ���� �Է�
		age = sc.nextInt(); // ���� ����
		System.out.println("Ű�� �Է����ּ���: "); // Ű �Է�
		height = sc.nextDouble(); // Ű ����
		System.out.println("�ڱ�Ұ��� �Է����ּ���: "); // �ڱ�Ұ� �Է�
		buffer = sc.nextLine();
		intro = sc.nextLine(); // �ڱ�Ұ� ����
		
		// �̸�, ����, Ű ���
		System.out.println("�̸��� "+name+" ���̴�"+age+ " Ű�� "+height+ " �Դϴ�.");
		System.out.println(intro); // �ڱ�Ұ� ���
	} // End main

} // End class
