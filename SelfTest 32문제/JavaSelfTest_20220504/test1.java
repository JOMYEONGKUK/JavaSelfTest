/*����1
3�� 3��¥�� ���ڿ� �迭 ���� �� �Ҵ�
�ε��� 0�� 0������ 2�� 2������ ���ʴ�� �����Ͽ� (0,0) �������� ���� �� ����ϼ���.
 */

//Ŭ���� ����, Ŭ���� �̸� test1
public class test1 {

	// �޼ҵ� ����(public), ���� �޼ҵ�(static), ���� �������� ����(void), �޼ҵ� �̸�(main)
	public static void main(String[] args) {
		
		// ���ڿ� 2���� �迭 arr ���� 3�� 3��
		String[][] arr = new String[3][3];
		
		// row ���� 0���� row�� arr ���̺��� �۰� row ������++
		for(int row = 0; row < arr.length; row++) {
			// col ���� 0���� col�� arr ���̺��� �۰� col ������++
			for(int col = 0; col < arr.length; col++) {
				System.out.println("(" + row + ", " + col + ")"); // �迭 ���
			System.out.println(); // ��ĭ�� �ٹٲ�
			
			} // End ���� for��
				
		} // End for�� 

	} // End main

} // End class
