/*����4
����ڷκ��� �Է¹��� ���� 20�� �� ����� ������ 0~255�̴�.
0���� ������ 255 ��� 255���� ū���� �ǵ� 255���
 */

import java.util.Scanner; // ��ĳ�� ��� ȣ��

//Ŭ���� ����, Ŭ���� �̸� test4
public class test4 {

	// �޼ҵ� ����(public), ���� �޼ҵ�(static), ���� �������� ����(void), �޼ҵ� �̸�(main)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner ����� ���� ���� sc ����
		System.out.println("������ �Է����ּ���: "); // ���� �Է� 
		int num = sc.nextInt(); // ���� ����
		
		int result = num - 20; // result ���� num - 20 �� ����
		
		if(result > 255) { // result�� 255���� ũ��
			System.out.println(255); // 255 ���
		} else if(result < 0) { // result�� 0���� ������
			System.out.println(0); // 0���
		} else {
			System.out.println(result); // result ���
		}

	}  // End main

} // End class
