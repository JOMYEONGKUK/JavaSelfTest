/*����2
�� ���� �������� ���ϴ� ���� �Է��Ͽ� ������ �������� ����Ͻÿ�. 
 */

import java.util.Scanner;// ��ĳ�� ��� ȣ��

//Ŭ���� ����, Ŭ���� �̸� test2
public class test2 {

	// �޼ҵ� ����(public), ���� �޼ҵ�(static), ���� �������� ����(void), �޼ҵ� �̸�(main)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner ����� ���� ���� sc ����
		System.out.println("�ܼ� �Է�: ");  // �ܼ� �Է� 
		int num1 = sc.nextInt(); // �ܼ� ����
		
		System.out.println("��� ������ ���: "); // ��� ������ ���
		int num2 = sc.nextInt(); // ��� ������ ��� ����
		
		System.out.println(num1+"��"); // �� ���
		
		// i���� 0���� i�� num2���� �۰� i ������++
		for(int i=0; i<num2; i++) {
			System.out.println(num1+"*"+(i+1)+"="+(num1*(i+1))); // ���� ���
		}
	} // End main

} // End class
