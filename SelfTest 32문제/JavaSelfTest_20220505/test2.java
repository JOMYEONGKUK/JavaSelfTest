/*����2
1~10 ������ ������ �Է��ϰ� ��� �� �ٽ� ������ �ް� �ϼ���.
ũ�Ⱑ ������ ������ �迭 �ȿ��� ���� �빮�ڰ� �������� ���� �� �� ���
 */

import java.util.Scanner;// ��ĳ�� ��� ȣ��

//Ŭ���� ����, Ŭ���� �̸� test2
public class test2 {

	// �޼ҵ� ����(public), ���� �޼ҵ�(static), ���� �������� ����(void), �޼ҵ� �̸�(main)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Scanner ����� ���� ���� sc ����
		
		int rowNum; // rowNum ����
		int colNum; // colNum ����
		int[][] arr; // 2���� �迭 ����
		
		while (true) { // ���ѹݺ� ����
			System.out.print("�� ũ�� : "); // �� ũ�� �Է�
			rowNum = sc.nextInt(); // �� ũ�� ����
			
			if (rowNum < 1 || rowNum > 10) // romNum�� 1���� �۰� 10���� ũ��
				System.out.println("�ݵ�� 1~10 ������ ������ �Է��ؾ� �մϴ�.");
			else {
				while (true) { // ���ѹݺ� ����
					System.out.print("�� ũ�� : "); // �� ũ�� �Է�
					colNum = sc.nextInt(); // �� ũ�� ����
					
					if (colNum < 0 || colNum > 10) // colNumdl 0���� �۰� colNum�� 10���� ũ�� 
						System.out.println("�ݵ�� 1~10 ������ ������ �Է��ؾ� �մϴ�.");
					else {
						arr = new int[rowNum][colNum];
						
						// row ���� 0���� row�� arr ���̺��� �۰� row ������++
						for (int row = 0; row < arr.length; row++) {
							// col ���� 0���� col�� arr[i]���̺��� �۰� col ������++
							for (int col = 0; col < arr[row].length; col++) {
								arr[row][col] = (int)(Math.random() * 26 + 65);
								
								System.out.print((char)arr[row][col] + " ");
							}
							System.out.println();  // �� ������ ��ĭ�� �ٹٲ�
						}
						
						break; // ù��° �ݺ��� Ż��
					}
				}
				
				break; // �ι�° �ݺ��� Ż��
			}
		}
		
	} // End main
} // End class