/*���� 2
A, B, C ����� ������ �Է� �ް� �� ����� ������ �μ�Ƽ�긦 ������ ������ ����Ͽ� ����ϰ� 
�μ�Ƽ�� ���� �޿��� 3000���� �̻��̸� "3000 �̻�", �̸��̸� "3000 �̸�"�� ����ϼ���.
(A ����� �μ�Ƽ��� 0.4, B ����� �μ�Ƽ��� ������, C ����� �μ�Ƽ��� 0.15)
 */

import java.util.Scanner; // ��ĳ�� ��� ȣ��

//Ŭ���� ����, Ŭ���� �̸� test2
public class test2 {

	// �޼ҵ� ����(public), ���� �޼ҵ�(static), ���� �������� ����(void), �޼ҵ� �̸�(main)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner ����� ���� ���� scan ����
		   
		System.out.print("A����� ���� : "); // A��� ���� �Է�
		int a = sc.nextInt(); // A��� ���� ����
		System.out.print("B����� ���� : "); // B��� ���� �Է�
		int b = sc.nextInt(); // B��� ���� ����
		System.out.print("C����� ���� : "); // C��� ���� �Է�
		int c = sc.nextInt(); // C��� ���� ����
		   
		double alncen = a * 1.4; // a + a * 0.4 --> a + 0.4a --> a(1+0.4) --> a * 1.4
		double blncen = b; // double Ÿ�� blncen ���� b ����
		double clncen = c * 1.15; // b + b * 0.15 --> b(1 + 0.15) --> b * 1.15; 
		   
		System.out.println(); // ��ĭ �ٹٲ�
		  
		System.out.println("A����� �μ�Ƽ������ ���� : " + alncen); // ���� ���
		System.out.println(alncen >= 3000 ? "3000�̻�" : "3000�̸�"); // 3000�̻����� 3000�̸����� ���
		  
		System.out.println("B����� �μ�Ƽ������ ���� : " + blncen); // ���� ��� 
		System.out.println(blncen >= 3000 ? "3000�̻�" : "3000�̸�"); // 3000�̻����� 3000�̸����� ���
		  
		System.out.println("C����� �μ�Ƽ������ ���� : " + clncen); // ���� ���
		System.out.println(clncen >= 3000 ? "3000�̻�" : "3000�̻�"); // 3000�̻����� 3000�̸����� ���
		  
	
	} // End main
} // End class
