/*���� 2
 ���ڸ� �Է� �޾� 3�� ����� ���ڸ� ����ϴ� ���α׷��� �ۼ��ϼ���.
  */

package kosta.phone; // ��Ű�� ����, ��Ű�� �̸� kosta.phone

import java.util.Scanner; // ��ĳ�� ��� ȣ��

//Ŭ���� ����, Ŭ���� �̸� test2
public class test2 {

	// �޼ҵ� ����(public), ���� �޼ҵ�(static), ���� �������� ����(void), �޼ҵ� �̸�(main)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner ����� ���� ���� sc ����
		int[] arr = new int[10]; // ������ �迭 ���� arr ���� 10��
		
		// for�� ���� ������ i���� 0���� i�� 10���� ������, i ������++
		for(int i = 0; i<10; i++) {
			System.out.println((i+1)+"��° ���� �Է� : "); // ���� �Է�
			arr[i] = sc.nextInt(); // �Է¹��� ������ �迭������ ����
		}
		System.out.println("3�� ��� : "); // 3�� ��� ���
		
		// for�� ���� ������ ���� i���� 0���� i�� 10���� ������, i ������++
		for(int i = 0; i<10; i++) {
			if(arr[i] % 3 == 0) { // arr[i]�� 3�� ���������� 0�� ������
				System.out.println(arr[i]); // �迭�� ���
			} // End if
		} // End �ι�° for��

	} // End main

} // End class
