/*���� 1
� �� n�� �ԷµǸ� n�� �� �ڸ����� ���� �� �ڸ��� �� ������
����Ͽ� ����ϴ� ���α׷��� �ۼ��ϼ���.
 */

import java.util.Scanner; // ��ĳ�� ��� ȣ��

// Ŭ���� ����, Ŭ���� �̸� test1
public class test1 {

	// �޼ҵ� ����(public), ���� �޼ҵ�(static), ���� �������� ����(void), �޼ҵ� �̸�(fum), �Ű����� ������ num
	public static void fun(int num) {
		
		while(num >= 10) { // �ݺ��� ���� num�� 10���� ũ�ų� ������
			int sum = 0; // ������ ���� sum ���� 0����
			int n = 1; // ������ ���� n���� 1����
			while(num > n) { // �ݺ��� ���� num�� n���� ũ��
				sum += num/n%10; // sum = sum + num/n%10
				System.out.printf("+ %d", num/n%10); // �� ���
				n *= 10;
			}
			System.out.printf("= %d\n", sum); // �հ� ���
			num = sum; // num�� sum ���� ����
		}

	}
	
	// �޼ҵ� ����(public), ���� �޼ҵ�(static), ���� �������� ����(void), �޼ҵ� �̸�(main)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Scanner ����� ���� ���� sc ����
		System.out.println("Enter the number: "); // ���� �Է�
		int num = sc.nextInt(); // �Է¹��� ���ڸ� ����
		fun(num);
	}

}
