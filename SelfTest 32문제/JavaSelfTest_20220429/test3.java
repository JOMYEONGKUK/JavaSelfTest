/*����3
����ڷκ��� �Է¹��� ���� 20�� ���� �����
20�� ���� ��갪�� 255�� �ʰ��ϸ� 255�� ���
 */

import java.util.Scanner; // ��ĳ�� ��� ȣ��

//Ŭ���� ����, Ŭ���� �̸� test3
public class test3 {

	// �޼ҵ� ����(public), ���� �޼ҵ�(static), ���� �������� ����(void), �޼ҵ� �̸�(main)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner ����� ���� ���� sc ����
		System.out.println("������ �Է����ּ���: "); // ���� �Է�
		int num = sc.nextInt(); // ���� ����
		
		// num+20 �Ѱ��� 255���� �۰ų� ������
		if(num+20 <= 255) {
			System.out.println(num + 20); //num + 20 �� �� ���
		} else {
			System.out.println(255); // 255 ���
		}

	} // End main

} // End class
