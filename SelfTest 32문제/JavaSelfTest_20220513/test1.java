/*���� 1
 10���� ������ �Է¹޾� ¦���� �հ� Ȧ���� ����
 ���� ����ϴ� ���α׷��� ����ÿ�.
 */

import java.util.Scanner; // ��ĳ�� ��� ȣ��

// Ŭ���� ����, Ŭ���� �̸� test1
public class test1 {

	// �޼ҵ� ����(public), ���� �޼ҵ�(static), ���ϰ� ����(void), �޼ҵ� �̸�(main)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner ����� ���� ���� sc ����

		// ������ �迭 ���� arr ���� ũ�� 10 ����
		int[] arr = new int[10];

		// for�� ���� ������ ���� i���� 1����, i�� 10���� �۰ų� ������, i ������++
		for(int i = 1; i <= 10; i++) {
			System.out.printf("������ �Է����ּ��� %d 's num: ", i); // ���� �Է�
			arr[i - 1] = sc.nextInt(); // �Է¹��� ���� ����
			System.out.println(); // ��ĭ �ٹٲ�
		} // End for��

		// ¦���� Ȧ���� �� ������ ������ ����
		int even = 0;
		int odd = 0;

		// ¦���� Ȧ���� ���� ������ �迭(�� ���� �Էµ��� �𸣹Ƿ� ũ��� �� 10���� ����)
		int[] evenArr = new int[10];
		int[] oddArr = new int[10];

		// �迭�� ����� ���� �ҷ��� �ε���
		int arrIndex = 0; // ������ ���� arrIndex ���� 0���� 
		int evenIndex = 0; // ������ ���� evenIndex ���� 0����
		int oddIndex = 0; // ������ ���� oddIndex ���� 0����

		while(arrIndex < 10) { // �ݺ��� ���� arrIndex�� 10���� ������

			// ����� ���� arr�ε��� ���� ¦���̸�
			if(arr[arrIndex] % 2 == 0) {
				evenArr[evenIndex] = arr[arrIndex]; // ¦�� �迭�� ����
				even += arr[arrIndex]; // ¦�� ���տ� ����
				arrIndex++; // arr�ε��� �� ������++
				evenIndex++;  // even�ε����� ������++

			// ���� ����� ���� Ȧ���� ��
			} else {
				oddArr[oddIndex] = arr[arrIndex]; // Ȧ�� �迭�� ����
				odd += arr[arrIndex]; // Ȧ�� ���տ� ����
				arrIndex++; // arr�ε��� �� ������++
				oddIndex++; // even�ε����� ������++

			} // End else

		} // End while

		System.out.println("< ¦�� >"); // ¦�� ���� ���
		// for�� ���� ������ i���� 0����, i�� 10���� ������, i ������++
		for(int i = 0; i < 10; i++) {
			if(evenArr[i] == 0) // ¦�� �迭���� 0�� ������
				break; // ����
			System.out.print(evenArr[i] + " "); // ¦�� �迭 �������� ���
		}
		System.out.println("\n ¦���� ����: " + even);

		System.out.println(); // ��ĭ �ٹٲ�

		System.out.println("< Ȧ�� >"); // Ȧ�� ���� ���
		// for�� ���� ������ i���� 0����, i�� 10���� ������, i ������++
		for(int i = 0; i < 10; i++) {
			if(oddArr[i] == 0) // Ȧ�� �迭���� 0�� ������ 
				break;// ����
			System.out.print(oddArr[i] + " "); // Ȧ�� �迭 �������� ���
		}
		System.out.println("\n Ȧ���� ����: " + odd); // Ȧ���� ���� ���

		sc.close(); // Scanner ����

	} // End main

} // End class