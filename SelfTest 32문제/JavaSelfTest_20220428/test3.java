/*����3
���̿� ���� ������ ���
8�� �̸��� 450��
8���̻� 19�� ���ϴ� 720��
20�� �̻��� 1250��
 */

import java.util.Scanner; // ��ĳ�� ��� ȣ��

//Ŭ���� ����, Ŭ���� �̸� test3
public class test3 {

	// �޼ҵ� ����(public), ���� �޼ҵ�(static), ���� �������� ����(void), �޼ҵ� �̸�(main)
	public static void main(String[] args) {
		
		Scanner age = new Scanner(System.in); // Scanner ����� ���� ���� age ����
		System.out.println("���̸� �Է����ּ���: "); // ���� �Է�
		int age1 = age.nextInt(); // ���� ����
		
		if(age1 <= 8 && age1 >= 0) { // age1�� 8���� �۰ų����� age1�� 0���� ũ�ų� ������
			System.out.println("450��"); // 450�� ���
		} else if(age1 >= 8 && age1 <= 19) { // age1�� 8���� ũ�ų� ���� age1�� 19���� �۰ų� ������
			System.out.println("720��"); // 720�� ���
		} else if(age1 < 0) { // age1�� 0���� ������
			System.out.println("���������� �Է����ּ���."); // ��� ���
		} else {
			System.out.println("2000��"); // 2000�� ���
		}

	} // End main

} // End class
