/*���� 3
 ����ڿ��� �Է� �޾� �迭�� �ε��� ����ŭ ���� ����غ�����.
 */

package kosta.phone; // ��Ű�� ����, ��Ű�� �̸� kosta.phone

import java.util.Scanner; // ��ĳ�� ��� ȣ��

// Ŭ���� ����, Ŭ���� �̸� test3
public class test3 {

	// �޼ҵ� ����(public), ���� �޼ҵ�(static), ���� �������� ����(void), �޼ҵ� �̸�(main)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner ����� ���� ���� sc ����
		int[] arr = new int[5]; // ������ �迭 ���� arr ���� 5��
		
		// for�� ���� ������ i���� 0����, i�� arr ���̺��� ������, i ������++
		for(int i = 0; i<arr.length; i++) {
			System.out.println(i+"��° ���� �� : "); // ���� �� �Է�
			arr[i] = sc.nextInt(); // �Է¹��� ���� �� ����
		
		} // End ù��° for��
		
		// for�� ���� ������ i���� 0����, i�� arr ���̺��� ������, i ������++
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]+" : "); // : ���
			// ���� for�� ���� ������ ���� j���� 0����, j�� arr[i] ������, j ������++
			for(int j = 0; j<arr[i]; j++) {
				System.out.println("*"); // * ���
			} System.out.println(); // ����Ҷ����� ��ĭ�� �ٹٲ�
		} // End �ι�° for��

	} // End main

} // End class
