/*����3
��ȭ�� �Է¹޾� �޷��� �ٲپ� ����Ͻÿ�.
 */

import java.util.Scanner; // ��ĳ�� ��� ȣ��

//Ŭ���� ����, Ŭ���� �̸� test3
public class test3 {

	// �޼ҵ� ����(public), ���� �޼ҵ�(static), ���� �������� ����(void), �޼ҵ� �̸�(main)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner ����� ���� ���� sc ����
		System.out.print("��ȭ�� �Է����ּ���. ���� ��): "); // ��ȭ �Է�
		
		int won = sc.nextInt(); // ��ȭ ����
		System.out.println(won + "���� $" + won / 1100.0 + "�Դϴ�."); // ��ȭ ���

	} // End main

} // End class
