/*����2
���� ���� ��� 80�� �̻��̸� �հ�
���� ������ ��� 80�� �̸��̸� ���հ�
���� �ϳ��� 80�� �̻��̸� ����� ��ȸ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */

import java.util.Scanner; // ��ĳ�� ��� ȣ��

//Ŭ���� ����, Ŭ���� �̸� test2
public class test2 {
	
	// �޼ҵ� ����(public), ���� �޼ҵ�(static), ���� �������� ����(void), �޼ҵ� �̸�(main)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner ����� ���� ���� sc ����
		System.out.println("���������� �Է����ּ���: \n"); // �������� �Է�
		int num1 = sc.nextInt(); // �������� ����
		
		Scanner sc1 = new Scanner(System.in); // Scanner ����� ���� ���� sc1 ����
		System.out.println("���������� �Է����ּ���: "); // �������� �Է�
		int num2 = sc1.nextInt(); // �������� ����
		
		if(num1 >= 80 && num2 >= 80) { // num1�� 80���� ũ�ų� ���� num2�� 80���� ũ�ų� ������
			System.out.println("�հ��Դϴ�."); // �հ�
		} else if(num1 < 80 && num2 < 80) { // num1,num2 80���� ������
			System.out.println("���հ��Դϴ�."); // ���հ�
		} else if(num1 >= 80 || num2 < 80) { // num1�� 80���� ũ�ų� ���� num2�� 80���� ������
			System.out.println("����� ��ȸ����"); // �����
		}

	} // End main

} // End class
