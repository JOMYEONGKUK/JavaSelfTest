/*���� 2
while���� Scanner�� �̿��ؼ� Ű����κ��� �Էµ� �����ͷ� ����, ���, ��ȸ, ����
����� �����ϴ� �ڵ带 �ۼ��غ�����.
 */

import java.util.Scanner; // ��ĳ�� ��� ȣ��

// Ŭ���� ����, Ŭ���� �̸� test2
public class test2 {

	// �޼ҵ� ����(public), ���� �޼ҵ�(static), ���ϰ� ����(void), �޼ҵ� �̸�(main)
	public static void main(String[] args) {
		
		boolean run = true; // boolean Ÿ�� ���� run ���� ture �� ����
		int deposit = 0; // ���� 0����
		int withdrow = 0; // ��� 0����
		int balance = 0; // �ܰ� 0����

		Scanner sc = new Scanner(System.in); // Scanner ����� ���� ���� sc ����

		while(run) { // while�� ����
			System.out.println("--------------------------------"); // ---- ���
			System.out.println("1. ���� | 2. ��� | 3. �ܰ� | 4. ����"); // ����, ���, �ܰ�,���� �� ����
			System.out.println("--------------------------------"); // ---- ���
			System.out.print("����> "); // ���ð� �Է�
			int choice = sc.nextInt(); // �Է¹��� �� ����

			if(choice == 1) { // choice�� 1�� ������
				System.out.print("���ݾ�>"); // ���ݾ� �Է�
				deposit = sc.nextInt(); // �Է¹��� ���ݾ� ���
				balance += deposit; // �Էµ� ���ݾ��� �ܰ� ������
			} else if(choice == 2) { // choice�� 2�� ������
				System.out.print("��ݾ�>"); // ��ݾ� �Է�
				withdrow = sc.nextInt(); // �Է¹��� ��ݾ� �Է�
				if(balance - withdrow < 0) { // ���ݾ� - ��ݾ��� ������ ���
					int insuf = balance - withdrow; // int insuf �ܰ� �����ݾ� ����
					System.out.printf("�ܰ� ����\n�����ݾ� : %d��\n", -insuf);
				} else{ // ���� ��ݾ��� �ܰ��� ��������
					balance -= withdrow; // �Էµ� ��ݾ��� �ܰ��� ���ش�.
				}
			} else if(choice == 3) { // choice�� 3�� ������
				System.out.println("�ܰ�>" + balance); // ���ݰ� ����� ����ϰ� �� �ܰ� ����Ѵ�.
			} else{ // ���� �ݺ��� Ż��
				break; // �ݺ��� Ż��
			}
		}
		sc.close(); // ��ĳ�� ����
		System.out.printf("\n���α׷� ����"); // ���α׷� ���� ���� ���
	} // End main
} // End class
