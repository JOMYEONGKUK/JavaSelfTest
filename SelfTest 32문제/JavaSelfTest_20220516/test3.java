/*���� 3
switch������ 12��~ 2���� �ܿ� ���, 3��~5���� ��, 6��~8���� ����, 9�� ~11���� ������ ����ϼ���.
 */

import java.util.Scanner; // ��ĳ�� ��� ȣ��

// Ŭ���� ����, Ŭ���� �̸� test3
public class test3 {

	// �޼ҵ� ����(public), ���� �޼ҵ�(static), ���ϰ� ����(void), �޼ҵ� �̸�(main)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Scanner ����� ���� ���� sc ����
		System.out.println("���� ������ �Է� :"); // �� �Է�
		int ���� = sc.nextInt(); // �Է¹��� �� ����
		
		switch(����){ // ����ġ ����
		case 12 :  // 12 ����
		case 1 :  // 1 ����
		case 2 : // 2 ����
			System.out.println("�ܿ��Դϴ�."); // �ܿ��Դϴ�. ���
			break; // ����ġ ����
		case 3 : // 3 ����
		case 4 : // 4 ����
		case 5 : // 5 ����
			System.out.println("��"); // �� ���
			break; // ����ġ ����
		case 6 : // 6 ����
		case 7 : // 7 ����
		case 8 : // 8 ����
			System.out.println("����"); // ���� ���
		break; // ����ġ ����
		case 9 : // 9 ����
		case 10 : // 10 ����
		case 11 : // 11 ����
			System.out.println("����"); // ���� ���
			break; // ����ġ ����
		} // End switch 
	} // End main
} // End class

