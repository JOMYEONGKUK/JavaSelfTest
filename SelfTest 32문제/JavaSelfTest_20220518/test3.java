/*���� 3
��� ����� ������ ���� ������������ �Ѵ�. �ο� ���� ���� ������ Ű����� �Է� �ް� 
1�δ� �����ϰ� �������� ���� ������ �����ְ� ���� ������ ������ ����ϼ���.
 */

import java.util.Scanner; // ��ĳ�� ��� ȣ��

//Ŭ���� ����, Ŭ���� �̸� test3
public class test3 {

	// �޼ҵ� ����(public), ���� �޼ҵ�(static), ���� �������� ����(void), �޼ҵ� �̸�(main)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner ����� ���� ���� scan ����
		
		System.out.print("�ο� �� : "); // �ο� �� �Է�
		int people = sc.nextInt(); // �ο� �� ����
	
		System.out.print("���� ���� : "); // ���� ���� �Է�
		int candy = sc.nextInt(); // ���� ���� ����
		
		System.out.println("1�δ� ���� ���� : " + candy / people ); // 1�δ� ���� ���� ���
		System.out.println("���� ���� ���� : " + candy % people ); // ���� ���� ���� ���
	
	} // End main
} // End class