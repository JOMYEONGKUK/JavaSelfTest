/*����2
����ڷκ��� �� ���� ���� �Է� ���� ū ���� ���
�Է°��� �´� ���� ��� ���ڸ� �ٽ� �Է��ϼ��� ��°��� ������ �϶�.
 */

import java.util.Scanner; // ��ĳ�� ��� ȣ��

//Ŭ���� ����, Ŭ���� �̸� test2
public class test2 {

	// �޼ҵ� ����(public), ���� �޼ҵ�(static), ���� �������� ����(void), �޼ҵ� �̸�(main)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner ����� ���� ���� sc ����
		System.out.println("ù��° ���� �Է�: "); // ù��° ���� �Է�
		int num1 = sc.nextInt(); // ù��° ���� ����
		
		Scanner sc1 = new Scanner(System.in); // Scanner ����� ���� ���� sc2 ����
		System.out.println("�ι�° ���ڸ� �Է�: "); // �ι�° ���� �Է�
		int num2 = sc1.nextInt(); // �ι�° ���� ����
		
		Scanner sc2 = new Scanner(System.in); // Scanner ����� ���� ���� sc2 ����
		System.out.println("����° ���ڸ� �Է�: "); // ����° ���� �Է�
		int num3 = sc2.nextInt(); // ����° ���� ����
		
		if(num1 > num2 && num1 > num3) { // num1�� num2 num3 ���� ũ��
			System.out.println("���� ū ���ڴ� ù��° ������" +num1+" �Դϴ�.");
		} else if(num2 > num1 && num2 > num3) { // num2�� num1 num2 ���� ũ��
			System.out.println("���� ū ���ڴ� ù��° ������" +num2+" �Դϴ�.");
		} else if(num3 > num1 && num3 > num2) { // num3�� num1 num2 ���� ũ��
			System.out.println("���� ū ���ڴ� ù��° ������" +num3+" �Դϴ�.");
		} else {
			System.out.println("���ڸ� �ٽ� �Է����ּ���."); // ���ڸ� �ٽ� �Է����ּ���. ���
		}
	} // End main
	

} // End class
