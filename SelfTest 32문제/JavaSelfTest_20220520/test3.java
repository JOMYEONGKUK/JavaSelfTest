/*���� 3
���� if���� ����Ͽ� ���� �ֹ� ���α׷��� �ۼ��Ͻÿ�.
 */

import java.io.IOException; // IOException ��� ȣ��

//Ŭ���� ����, Ŭ���� �̸� test3
public class test3 {

	// �޼ҵ� ����(public), ���� �޼ҵ�(static), ���� �������� ����(void), �޼ҵ� �̸�(main)
	public static void main(String[] args) throws IOException {
		
		System.out.println("�԰� ���� �޴��� ������."); // �԰� ���� �޴��� ������. ��� 
		System.out.println("1.¥��, 2.«��, 3.������, 4.�Ⱥ�ä"); // �޴� 4���� ���
		System.out.print("�޴�: "); // �޴� �Է�
		
		int menu=System.in.read()-48; // �Էµ� �޴� ����
		
		if(menu == 1){ // menu�� 1�� ������
			System.out.println("¥����� �ֹ��ϼ̽��ϴ�."); // ¥���
		}else if(menu == 2){ // menu�� 1�� ������
			System.out.println("«���� �ֹ��ϼ̽��ϴ�."); // «��
		}else if(menu == 3){ // menu�� 1�� ������
			System.out.println("�������� �ֹ��ϼ̽��ϴ�."); // ������
		}else if(menu == 4){ // menu�� 1�� ������
			System.out.println("�Ⱥ�ä�� �ֹ��ϼ̽��ϴ�."); // �Ⱥ�ä
		}else{ // �߸� �ֹ� �������� ����
			System.out.println("�߸� �ֹ����׽��ϴ�"); // �߸� �ֹ� �������� ���
		}
	} // End main
} // End class
