/*���� 2
���ڿ��� �Է� �޾Ƽ� �� ������ �ƽ�Ű�ڵ尪�� ���Ͽ� ����ϴ� ���α׷��� �ۼ��ϼ���.
*/

import java.util.Scanner; // ��ĳ�� ��� ȣ��

// Ŭ���� ����, Ŭ���� �̸� test2
public class test2 {

	// �޼ҵ� ����(public), ���� �޼ҵ�(static), ���� �������� ����(void), �޼ҵ� �̸�(fum), �Ű����� ������ num
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner ����� ���� ���� sc ����
		System.out.println("Enter: "); // ���ڿ� �Է�
		String str = sc.nextLine(); // �Է¹��� ���ڿ� ����
		
		int sum = 0; // ������ ���� sum ���� 0����
		
		// for�� ���� ������ i���� 0����, i�� str ���̺��� ������, i ������++
		for(int i=0; i<str.length(); i++) {
			sum += (int)str.charAt(i); // sum += ���ڿ� �ƽ�Ű�ڵ尪
		}
		System.out.println(sum); // sum ���
	} // End main

} // End class
