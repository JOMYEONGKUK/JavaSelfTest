/*���� 1
- if�� ���� ���̱ⱸ
- Scanner�� ���� Ű�� �Է¹���
- Ű�� 110cm �̻��� �� ��� Ʈ�����͸� ž�� �����մϴ�.
- ������ ���� ž�°���, ������ ������ ��ȣ�ڶ� ���̿�����. ���� ���
 */

import java.util.Scanner; // ��ĳ�� ��� ȣ��

// Ŭ���� ����, Ŭ���� �̸� test1
public class test1 {

	// �޼ҵ� ����(public), ���� �޼ҵ�(static), ���ϰ� ����(void), �޼ҵ� �̸�(main)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner ����� ���� ���� sc ����
		System.out.println("����� Ű�� �Է����ּ���: "); // Ű �Է�
		int cm = sc.nextInt(); // �Է¹��� Ű ����
		
		if(cm>=110) { // cm�� 110���� ũ�ų� ������
			System.out.println("Űī 110cm �̻��Դϴ�. ž�����ּ���."); // ������ ���̸� ���
		} else { // ���� ��ȣ�ڰ� �翡 �ְų� ������
			System.out.println("��ȣ�ڰ� �翡 ������:1/������:0 �Է�"); // ��ȣ�� �翡 �ִ��� ������ ���� �Է�
			int parents = sc.nextInt(); // ��ȣ�� ���� ����
			
			if(parents == 1) { // parents�� 1�� ������
				System.out.println("��ȣ�ڿ� ���� ����ž�����ּ���."); // ������ 1�� ������ ���
			} else if(parents == 0) { // parents�� 0�� ������
				System.out.println("������ ��ȣ�ڶ� ���� ���ּ���."); // parents�� 0�� ������ ���
			} else { // ����
				System.out.println("���ڸ� �߸� �Է��ϼ̽��ϴ�."); // ���ڸ� �߸��Է������� ���
			}
		}	
 
	} // End main

} // End class
