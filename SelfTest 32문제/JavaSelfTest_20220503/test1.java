/*����1
N�� X�� �Է¹ް�
N���� ������ �Է� �ް�
N���� ���� �� X���� ���� ���� ��� 
 */

import java.util.Scanner;  // ��ĳ�� ��� ȣ��

//Ŭ���� ����, Ŭ���� �̸� test1
public class test1 {

	// �޼ҵ� ����(public), ���� �޼ҵ�(static), ���� �������� ����(void), �޼ҵ� �̸�(main)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner ����� ���� ���� sc ����
		int[] arr = new int [10]; // �迭 ���� arr ����
		
		System.out.print("N �Է� : "); // N �Է�
		int N = sc.nextInt(); // N ����
		
		System.out.print("x �Է� : "); // x �Է�
		int x = sc.nextInt(); // x ����
		
		// i���� 0���� i�� 10���� �۰� i ������++
		for(int i=0; i<10; i++) {
			System.out.println((i+1) + "��° ���� �Է� : "); // ��° ���� �Է�
			arr[i] = sc.nextInt(); // ��° ���� �Է� ����
		}
		System.out.println("���: "); // ��� ���
		for(int i=0; i<10; i++) { // i���� 0���� i�� 10���� �۰� i ������++
			if(arr[i] < x) { // arr[i]�� x���� ������
				System.out.println(arr[i] + ""); // arr[i] ���
			}
		}
	} // End main

} // End class
