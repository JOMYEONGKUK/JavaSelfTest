/*���� 1
���� �ð��� �Է¹޾� �� �ӱ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
*/

import java.util.Scanner; // ��ĳ�� ��� ȣ��

// Ŭ���� ����, Ŭ���� �̸� test1
public class test1 {

	// �޼ҵ� ����(public), ���� �޼ҵ�(static), ���� �������� ����(void), �޼ҵ� �̸�(main)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner ����� ���� sc ���� ����
		
		//���� �ð��� �Է¹޾� �� �ӱ��� ����ϴ� �ñް���
		//�ñ��� 5000���̸� 8�ð����� �ʰ� �ٹ��� �ð��� ���� 1.5�� ���޿���
		
		System.out.print("���ѽð��� �Է��ϼ���:"); //���� �ð� �Է�
		int work_hour = sc.nextInt(); // ���� �ð� ����
		int work_a = 5000 * 8; // work_a ���� 5000 * 8 �� �� ����
		int usu_pay = 5000 * work_hour; // usu_pay ���� 5000 * work_hour �� �� ����
		double over_pay = (work_hour - 8) * (5000 * 1.5d); // double ���� over_pay ���� work_hour - 8 * 5000 * 15.d �� �� ���� 
		
		
		// work_hour�� 8���� �۰ų� ������
		if(work_hour <= 8) {
			System.out.println("�� �ӱ��� " + usu_pay + "�� �Դϴ�." ); // �� �ӱ� ���
		}else { // ���� �ʰ��ӱ� ���
			System.out.println("�� �ӱ��� " + (int)(work_a +over_pay) +"�� �Դϴ�."); // �ʰ��ӱ� ���
			
			
		} // End else
		
		
	} // End main

} // End class
