/*���� 1
���� for���� �̿��ؼ� 1���� 20������ 2,3,4,5 ��� ���
*/

// Ŭ���� ����, Ŭ���� �̸� test1
public class test1 {

	// �޼ҵ� ����(public), ���� �޼ҵ�(static), ���� �������� ����(void), �޼ҵ� �̸�(main)
	public static void main(String[] args) {
		
		// num ���� 2���� num�� 5���� �۰ų� ���� num ������++
		for(int num = 2; num <= 5; num++) {
			System.out.printf("%d�� ��� :", num);  // 2345 ��� ��� 
			// i ���� 1���� i�� 20���� �۰ų� ���� i ������++
			for(int i = 1; i <= 20; i++) {
				if(i % num != 0) { // i�� num�� �ȳ�������
					continue; // �ǳʶ�
				}
				System.out.printf("%4d", i); // 4�ڸ� ���� Ȯ���ϰ� ���
			}
			System.out.println(); // ������� ������ ��ĭ�� ������ ���
		} // End for��	

	} // End main

} // End class
