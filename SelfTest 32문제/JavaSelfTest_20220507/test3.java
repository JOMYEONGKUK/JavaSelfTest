/*����3
�ʸ� �Է¹޾� �ð� �� �ʸ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */

import java.util.Scanner; // ��ĳ�� ��� ȣ��

//Ŭ���� ����, Ŭ���� �̸� test3
public class test3 {

	// �޼ҵ� ����(public), ���� �޼ҵ�(static), ���� �������� ����(void), �޼ҵ� �̸�(main)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner ����� ���� ���� sc ���� 
		System.out.println("�ʸ� �Է����ּ���: "); // �� �Է�
		int time = sc.nextInt(); // �� ����
		
		int hour = time / 3600; // ���� hour ����
		int minute = (time % 3600) / 60; // ���� minute ����
		int second = (time % 3600) % 60; // ���� second ����
		
		if(hour != 0) { // hour�� 0�� �ٸ���
			System.out.printf("��� ��� : %d�ð� ", hour);
		}
		if(minute != 0) { // minute�� 0�� �ٸ���
			System.out.printf("%d�� ", minute);
		}
		if(second != 0) { // second�� 0�� �ٸ���
			System.out.printf("%d�� ", second);
		}

	} // End main

} // End class
