/*���� 2
1. Scanner�� �̿��Ͽ� �ݾ��� �Է� ��������.
2. ������� �����ϸ� �ݾ׿��� �����ϼ���. (�ݺ��� switch)
3. �ݾ��� �����ϴٸ� "�ݾ��� �����մϴ�"�� ����ϼ���.
 */

import java.util.Scanner; // ��ĳ�� ��� ȣ��

// Ŭ���� ����, Ŭ���� �̸� test2
public class test2 {

	// �޼ҵ� ����(public), ���� �޼ҵ�(static), ���� �������� ����(void), �޼ҵ� �̸�(main)
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in); // Scanner ����� ���� ���� scan ����
		System.out.println("�ݾ��� ������ �ּ���: "); // �ݾ� ����
		int money = scan.nextInt(); // ������ �ݾ� ����
		
		while(true) { // ���ѹݺ� ����
			System.out.println("�����ݾ� : " + money + "��"); // �����ݾ� ���
			System.out.println("[1]���̼Ҵ� : 400��, [2]��Ű�� : 500��, [3]��ī�ݶ� : 600��, [4] �ܵ��ޱ�"); // �޴� �����ϴ� ���� ���
			System.out.print("����� ����: "); // ����� ����
			
			int select = scan.nextInt(); // ���õ� ����� ����
			
			
			switch(select) { // switch�� ����
				case 1 : if(money >= 400) { // case 1 , money�� 400 �̻��̸�
					System.out.println("���̼Ҵٸ� �޾ҽ��ϴ�."); // ���̼Ҵ�
					money -= 400; // money = money - 400
				} else {
					System.out.println("�ݾ��� �����մϴ�. ���� �־� �ּ���!"); // �ݾ��� �����ϸ� ���
				}
				break; // �ݺ��� �� switch�� Ż��
				
				case 2 : if(money >= 500) { // case 2 , money�� 500 �̻��̸�
					System.out.println("��Ű���� �޾ҽ��ϴ�."); // ��Ű��
					money -= 500; // money = money - 500
				} else {
					System.out.println("�ݾ��� �����մϴ�. ���� �־� �ּ���!"); // �ݾ��� �����ϸ� ���
				}
				break; // �ݺ��� �� switch�� Ż��
				
				case 3 : if(money >= 600) { // case 3 , money�� 600 �̻��̸�
					System.out.println("��ī�ݶ�� �޾ҽ��ϴ�."); // ��ī�ݶ�
					money -= 600; // money = money - 600
				} else {
					System.out.println("�ݾ��� �����մϴ�. ���� �־� �ּ���!"); // �ݾ��� �����ϸ� ���
				}
				break; // �ݺ��� �� switch�� Ż��
				
				case 4 : // case 4
					System.out.println("���� �پ� "+money+" �� ��ȯ�մϴ�."); // ��ȯ�� �����ݾ� ���
					break; // �ݺ��� �� switch�� Ż��
				
				default : // ����
					System.out.println("�߸� �Է� �߽��ϴ�."); // �߸� �Է������� ���
					System.out.println("�޴��� ��Ȯ�� �Է��ϼ���"); // �߸� �Է������� ���
					break; // �ݺ��� �� switch�� Ż��
					
			} // End switch��
			System.out.println();
		} // End while(true)
		

	} // End main

} // End class
