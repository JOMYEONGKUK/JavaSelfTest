/*����3
369 ������ �ۼ��غ���. 1~99���� ������ �Է¹ް�
369 �� �ϳ��� �ִ� ���� �ڼ�¦ �ΰ� �ִ� ���� �ڼ�¦¦�� ����϶�.
 */

import java.util.Scanner; // ��ĳ�� ��� ȣ��

//Ŭ���� ����, Ŭ���� �̸� test3
public class test3 {

	// �޼ҵ� ����(public), ���� �޼ҵ�(static), ���� �������� ����(void), �޼ҵ� �̸�(main)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner ����� ���� ���� sc ����
		System.out.println("1~99������ ������ �Է����ּ���: "); // ���� �Է� 
		
		int n = sc.nextInt(); // ���� ����
		int a = n / 10; // a ���� n / 10 ����
		int b = n % 10; // b ���� n % 10 ����
		
		// a�� 0���� ũ�� b�� 0���� ũ�� a, b�� 3���� ��������
		if(a > 0 && b > 0 && a % 3 == 0 && b % 3 == 0) {
			System.out.println("�ڼ�¦¦"); // �ڼ�¦¦ ���
		} else if(a > 0 && a % 3  == 0) { // a�� 0���� ũ�� a�� 3���� ��������
			System.out.println("�ڼ�¦"); // �ڼ�¦ ���
		} else if(b > 0 && b % 3 == 0) { // b�� 0���� ũ�� b�� 3���� ��������/
			System.out.println("�ڼ�¦"); // �ڼ�¦ ���
		}

	} // End main

} // End class
