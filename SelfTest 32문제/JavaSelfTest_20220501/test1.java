/*����1
�ֹε�Ϲ�ȣ �� �ڸ� 7�ڸ� �� ù°�� ������ ��Ÿ������ 1,3�� ���� 2,4�� ���ڸ� �ǹ��Ѵ�.
5~8������ �ܱ��� ��� ���Ŀ� ���� ������ ����ó���Ͽ���.
 */

import java.util.Scanner; // ��ĳ�� ��� ȣ��

//Ŭ���� ����, Ŭ���� �̸� test1
public class test1 {

	// �޼ҵ� ����(public), ���� �޼ҵ�(static), ���� �������� ����(void), �޼ҵ� �̸�(main)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner ����� ���� ���� sc ����
		System.out.println("�ֹε�Ϲ�ȣ�� �Է����ּ���: "); // �ֹι�ȣ �Է�
		String jumin = sc.next(); // �ֹι�ȣ ����
		
		char indexing = jumin.charAt(7); // �迭 ���� ����
		
		if(indexing == '1' || indexing == '3') { // 1�� 3�� ������
			System.out.println("�����Դϴ�."); // ����
		} if(indexing == '2' || indexing == '4') { // 2�� 4�� ������
			System.out.println("�����Դϴ�."); // ����
		} if(indexing == '5' || indexing == '6' || indexing == '7' || indexing == '8') { // 5678 �� ������
			System.out.println("�ܱ����Դϴ�."); // �ܱ���
		} else {
			System.out.println("�ֹι�ȣ�� �ٽ� �Է����ּ���."); // �ֹι�ȣ �ٽ� �Է� 
		}

	} // End main

} // End class
