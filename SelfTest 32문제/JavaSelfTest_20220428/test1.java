/*����1
���̸� �Է¹޾� 10�� ���ϴ� 1000�� 65���̻��� 0�� �⺻ ������ 0�� ���α׷��� ����ÿ�.
 */

import java.util.Scanner; // ��ĳ�� ��� ȣ��

//Ŭ���� ����, Ŭ���� �̸� test1
public class test1 {

	// �޼ҵ� ����(public), ���� �޼ҵ�(static), ���� �������� ����(void), �޼ҵ� �̸�(main)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner ����� ���� ���� sc ����
		System.out.println("���̸� �Է����ּ���: "); // ���� �Է�
		int num = sc.nextInt(); // ���� ����
		
		if(num <= 10) { // num�� 10���� �۰ų� ������
			System.out.println("1000��"); // 1000�� ��� 
		} else if(num >= 65) { // num�� 65���� ũ�ų� ������
			System.out.println("0��"); // 0�� ���
		} else {
			System.out.println("2000��"); // 2000�� ���
		}
	} // End main

} // End class
