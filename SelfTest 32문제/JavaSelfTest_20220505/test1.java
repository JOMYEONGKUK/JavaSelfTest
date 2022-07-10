/*����1
4�� 4��¥�� ������ �迭 ���� 0�� 0�� 2�� 2�������� 1~10������ ���� �� ���� �� ����ϼ���.
 */

import java.util.Scanner; // ��ĳ�� ��� ȣ��

//Ŭ���� ����, Ŭ���� �̸� test1
public class test1 {

	// �޼ҵ� ����(public), ���� �޼ҵ�(static), ���� �������� ����(void), �޼ҵ� �̸�(main)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner ����� ���� ���� sc ����
		
		// ������ 2���� �迭 arr ���� 4�� 4�� 
		int[][] arr = new int[4][4];
		
		final int RowFinal = arr.length - 1;
		final int ColFinal = arr[0].length - 1;
		
		// row ���� 0���� row�� arr ���̺��� �۰� row ������++
		for(int row = 0; row < arr.length; row++) {
			// col ���� 0���� col�� arr[i]���̺��� �۰� col ������++
			for(int col = 0; col < arr[row].length; col++){
				// row�� RowFianl�� �ٸ��� col�� ColFinal�� �ٸ���
				if(row != RowFinal && col != ColFinal) {
					arr[row][col] = (int)(Math.random() * 10 + 1);
					
					arr[row][ColFinal] += arr[row][col];
					arr[RowFinal][col] += arr[row][col];
					arr[RowFinal][ColFinal] += arr[row][col];
				}
				System.out.printf("%4d ", arr[row][col]);
			}
			System.out.println(); // ��ĭ �ٹٲ�
		}

	} // End main

} // End class
