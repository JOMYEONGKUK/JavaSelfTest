/*���� 3
 ������ ���������� �Է� �޴ٰ� 8�� ����� 5�� �ԷµǸ� �ݺ�����
 �����ϴ� ���α׷��� ����ÿ�.
 */

import java.util.Scanner; // ��ĳ�� ��� ȣ��

// Ŭ���� ����, Ŭ���� �̸� test3
public class test3 {

	// �޼ҵ� ����(public), ���� �޼ҵ�(static), ���ϰ� ����(void), �޼ҵ� �̸�(main)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner ����� ���� ���� sc ����
		int count = 0; // ������ ���� count ���� 0����
		
		for(;;) { // for�� ����
			System.out.println("�����Է�1 > "); // �����Է�
			int b = sc.nextInt(); // �Էµ� ���� ����
			
			if(b % 8 == 0) { // b�� 8�� ��������
				count++; // count ������++
			}
			
			if(count == 5) break; // count�� 5�� ������ ����
		}
		System.out.println("�ݺ�����11!"); // �ݺ��� ����11 ���
		
		System.out.println("=========================");

		Scanner input2 = new Scanner(System.in); // �ι�° Scanner ����� ���� ���� input2 ����
		
		int count2 = 0; // ������ ���� count2 ���� 0����
		
		while(count2 != 5) { // while�� ���� count2�� 5�� �ٸ��� 
			System.out.println("�����Է�2 > "); // �ι�° �Է�
			int c = input2.nextInt(); // �Էµ� �ι�° ���� ����
			if (c % 8 == 0) { // c�� 8�� ��������
				count2++; // c ������++
			} // End if
		} // End while
		System.out.println("�ݺ�����22!"); // �ݺ�����22 ���

	}  // End main

} // End class
