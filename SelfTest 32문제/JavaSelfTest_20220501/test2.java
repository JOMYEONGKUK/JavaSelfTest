/*����2
�޴�����ȣ ���ڸ��� ���� ��Ż縦 ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */

import java.util.Scanner;// ��ĳ�� ��� ȣ��

//Ŭ���� ����, Ŭ���� �̸� test2
public class test2 {

	// �޼ҵ� ����(public), ���� �޼ҵ�(static), ���� �������� ����(void), �޼ҵ� �̸�(main)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner ����� ���� ���� sc ����
		
		System.out.println("�޴�����ȣ�� �Է����ּ���: "); // �޴��� ��ȣ �Է�
		String num = sc.next(); // �޴��� ��ȣ ����
		
		char phonnumber = num.charAt(2); // �迭 ���� ����
		
		if(phonnumber == '1') { // 1�� ������
			System.out.println("SKT ������Դϴ�.");  // SKT
		} if(phonnumber == '6') { // 6�� ������
			System.out.println("KT ������Դϴ�."); // KT
		} if(phonnumber == '9') { // 9�� ������
			System.out.println("LGU ������Դϴ�."); // LGU
		} else {
			System.out.println("�˼�����"); // �˼�����
		}

	} // End main

} // End class
