/*���� 3
�⺻ ���α׷� : � ��(n)�� �ԷµǸ�, �� ���� �� �Ҽ��� ������ ��Ÿ�� �� ������
�� �Ҽ��� ������������ ����ϰ�, �׷��� ������ "Wrong number"�� ����Ѵ�.
*/

import java.util.Scanner; // ��ĳ�� ��� ȣ��

// Ŭ���� ����, Ŭ���� �̸� test3
public class test3 {

	// �޼ҵ� ����(public), ���� �޼ҵ�(static), ���� �������� ����(void), �޼ҵ� �̸�(fum), �Ű����� ������ num
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // Scanner ����� ���� ���� sc ����
		System.out.println("Enter the number: "); // ������ ���� �Է�
		int num = sc.nextInt(); // �Է¹��� ���� ����
		boolean isPos = false; // boolean ���� isPos ���� false �� ����
		int i = 1; // ������ i���� 1����
		int j = 2; // ������ j���� 2����
		
		while(!isPos & i < num) { // �ݺ��� ���� !isPos & i�� num���� ������
			i++; // i������ ++ 
			boolean Pr_i = true; // boolean ���� Pr_i ���� true �� ����
			for(int n=2; n<i; n++) { // for�� ���� ������ ���� n���� 2���� n�� i���� ������ n ������++
				if(i % n == 0) { // i�� n���� ���������� 0�� ������
					Pr_i = false; // Pr_i �� false ����
				}
			}
			for(j = i; j<num; j++) {  // for�� ���� ������ ���� j���� i���� j�� num���� ������ j ������+
				boolean Pr_j = true; // boolean ���� Pr_j ���� true �� ����
				for(int n=2; n<j; n++) { // for�� ���� ������ ���� n���� 2���� n��j���� ������ n ������++ 
					if(j % n == 0) { // j�� n���� ���������� 0�� ������
						Pr_j = false; // Pr_j �� false ����
					}
				}
				if(Pr_i & Pr_i & num == i*j) { // Pr_i & Pr_i & num �� i*j �� ���� ������
					isPos = true; // isPos �� true �� ����
					break; // ����
				}
			}
		}
		if(isPos) { 
			System.out.printf("%d = %d x %d", num, j, i); // ������ �� ���
		}
		else {
			System.out.println("Wrong number"); // ������ ������ �ȵǸ� ���
		}
	} // End main

} // End class
