/*���� 3
1���� ������, 2���� �����, 3���� ���Ƹ��� ���ϰ� ��ȣ�� �Է��ϸ� ��ȣ��
�ش��ϴ� ������ ����� ����ϴ� ���α׷��� switch���� ����ؼ� ����ÿ�.
 */

import java.util.Scanner; // ��ĳ�� ��� ȣ��

// Ŭ���� ����, Ŭ���� �̸� test3
public class test3 {

	// �޼ҵ� ����(public), ���� �޼ҵ�(static), ���� �������� ����(void), �޼ҵ� �̸�(main)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner ����� ���� ���� sc ����
		System.out.println("��ȣ�� �Է��ϼ���: "); // ��ȣ �Է�
		int a = sc.nextInt(); // �Էµ� ��ȣ ����
		
		String b = ""; // ���� b���� "" ����
		
		switch(a) { // switch�� ����
			case 1 : // case 1
				b = "dog"; // ���� b�� dog ����
				break; // switch�� Ż��
			case 2 : // case 2
				b = "cat"; // ���� b�� cat ����
				break; // switch�� Ż��
			case 3 : // case 3
				b = "chick"; // ���� b�� chick ����
			default : // ����
				b = "��ȣ�� �߸��Ǿ����ϴ�."; // ��ȣ�� �߸��Ǿ����ϴ�. ����
		
		} // End switch
		
		System.out.println(b); // b ���

	} // End main

} // End class
