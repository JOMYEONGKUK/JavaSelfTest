/*����3
����ڿ��� �Է� �޾� �迭�� �ε��� ����ŭ ���� ����غ�����.
 */

import java.util.Scanner; // ��ĳ�� ��� ȣ��

//Ŭ���� ����, Ŭ���� �̸� test3
public class test3 {

	// �޼ҵ� ����(public), ���� �޼ҵ�(static), ���� �������� ����(void), �޼ҵ� �̸�(main)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner ����� ���� ���� sc ����
		int[] arr = new int[5]; // �迭 ���� arr ����
		
		// i���� 0����, i�� arr���̺��� �۰� i ������++
		for(int i=0; i<arr.length; i++) {
			System.out.println(i+"��° ���� ��: "); // ���Ǽ� �Է�
			arr[i] = sc.nextInt(); // ���Ǽ� ����
		}
		// i���� 0����, i�� arr���̺��� �۰� i ������++
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]+" : "); // arr ���
			// j���� 0����, j�� arr���̺��� �۰� j ������++
			for(int j=0; j<arr.length; j++) {
				System.out.println("*"); // ��
			} System.out.println(); // ��ĭ �ٹٲ�
		}
	} // End main

} // End class
