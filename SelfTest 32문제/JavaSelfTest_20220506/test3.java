/*����3
���� ����ī�忡 �ܾ��� 10000���̰� ��� �ݾ׸�ŭ �����Ͽ� �ܾ��� ������ �� "�ܾ��� ������ ����ī�带 ����� �� �����ϴ�" �޽����� ����� �� �����ϴ� ���α׷� �ۼ�
 * ����ī�� ����� Ű���� �Է��� �̿��ϰ� �Էµ� ���ڿ��� ���� ��ȯ�� Integer.parseInt("�ݾ�"); �޼��带 ����Ѵ�. 
 */

import java.util.Scanner; // ��ĳ�� ��� ȣ��

//Ŭ���� ����, Ŭ���� �̸� test3
public class test3 {

	// �޼ҵ� ����(public), ���� �޼ҵ�(static), ���� �������� ����(void), �޼ҵ� �̸�(main)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner ����� ���� ���� sc ����
		
		// ����ī�� 10000�� ����
		int busCard = 10000, useMoney;
		
		while(true)  { // ���� �ݺ� ���� 
			System.out.println("�ܾ� : "+busCard); // �ܾ� ���
			useMoney = Integer.parseInt(sc.next());
			if(busCard - useMoney < 0) {
				System.out.println("�ܾ��� ������ ���� ī�带 ����� �� �����ϴ�."); // �ܾ� �����ϸ� ���
				break; // �ݺ��� Ż�� 
			}
			busCard -= useMoney;
		}

	}  // End main

} // End class
