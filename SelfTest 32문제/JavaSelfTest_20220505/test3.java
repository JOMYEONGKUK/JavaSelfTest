/*����3
����ڿ��� ���� ũ�⸦ �Է� �ް� �� ����ŭ�� �ݺ��� ���� ���� ũ�⵵ �޾�
������ ���� �迭�� ���� �� �Ҵ��ϼ���.
�׸��� �� �ε����� ��a������ �� �ε����� ������ŭ �ϳ��� �÷� �����ϰ� ����ϼ���.
 */

import java.util.Scanner; // ��ĳ�� ��� ȣ��

//Ŭ���� ����, Ŭ���� �̸� test3
public class test3 {

	// �޼ҵ� ����(public), ���� �޼ҵ�(static), ���� �������� ����(void), �޼ҵ� �̸�(main)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Scanner ����� ���� ���� sc ����
		 
		int rowNum; // rowNum ����
		int colNum; // colNum ����
		char[][] arr; // 2���� �迭 ����
		char ch = 'a'; // ������ ����
		
		System.out.print("�� ũ�� : "); // �� ũ�� �Է� 
		rowNum = sc.nextInt(); // �� ũ�� ����
		
		arr = new char[rowNum][];
		
		// row ���� 0���� row�� arr ���̺��� �۰� row ������++
		for (int row = 0; row < arr.length; row++) {
			System.out.print(row + "���� ũ�� : "); // ���� ũ�� �Է�
			colNum = sc.nextInt(); // ���� ũ�� ����
			
			arr[row] = new char[colNum];
			
			// col ���� 0���� col�� arr[i]���̺��� �۰� col ������++
			for (int col = 0; col < arr[row].length; col++)
				arr[row][col] = ch++;
		}
		
		// row ���� 0���� row�� arr ���̺��� �۰� row ������++
		for (int row = 0; row < arr.length; row++) {
			// col ���� 0���� col�� arr[i]���̺��� �۰� col ������++
			for (int col = 0; col < arr[row].length; col++)
				System.out.print(arr[row][col] + " ");
			
			System.out.println(); // ��ĭ �ٹٲ�
		}
		
		
	} // End main
} // End class
