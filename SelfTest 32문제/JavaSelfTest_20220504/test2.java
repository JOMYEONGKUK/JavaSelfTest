/*����2
4�� 4��¥�� ������ �迭 ���� �Ҵ��ϰ�
1 ~ 16���� ���� ���ʴ�� ����
����� ������ ���ʴ�� ����ϼ���.
 */

//Ŭ���� ����, Ŭ���� �̸� test2
public class test2 {

	// �޼ҵ� ����(public), ���� �޼ҵ�(static), ���� �������� ����(void), �޼ҵ� �̸�(main)
	public static void main(String[] args) {
		
		// ���ڿ� 2���� �迭 ���� 4�� 4��
		int[][] arr = new int[4][4];
		
		int num = 1; // num ���� 1���� 
		
		// row ���� 0���� row�� arr ���̺��� �۰� row ������++
		for(int row = 0; row<arr.length; row++) {
			// col ���� 0���� col�� arr ���̺��� �۰� col ������++
			for(int col=0; col<arr.length; col++) {
				arr[row][col] = num++;
				System.out.printf("%2d", arr[row][col]); // 1���� 16���� ���
			}
			System.out.println(); // 4�ึ�� ��ĭ�� �ٹٲ� 
		}

	} // End main

} // End class
