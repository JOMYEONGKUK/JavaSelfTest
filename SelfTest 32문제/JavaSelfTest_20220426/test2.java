/*���� 2
�Է¹��� �������� �ƽ�Ű �ڵ尪�� ���
*/

import java.util.Scanner; // ��ĳ�� ��� ȣ��

//Ŭ���� ����, Ŭ���� �̸� test2
public class test2 { 

	// �޼ҵ� ����(public), ���� �޼ҵ�(static), ���� �������� ����(void), �޼ҵ� �̸�(main)
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // Scanner ����� ���� ���� sc����
		System.out.println("�����ڸ� �Է����ּ���: "); // ������ �Է�
		String alpa = sc.nextLine(); // �Է¹��� ������ ����
		
		// i���� 0���� i�� alpa ���̺��� ������ i ������++
		for(int i=0; i < alpa.length(); i++) {
			char askii = alpa.charAt((int)i);
			System.out.println(askii + " = " + (int)askii); // �����ڸ� �ƽ�Ű�ڵ�� ��ȯ�ؼ� ���
		} // End for��

	} // End main

} // End class
