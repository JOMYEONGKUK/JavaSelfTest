/*���� 3
��ø for���� �̿��Ͽ� ������ 4x + 5y = 60�� ��� �ظ� ���ؼ� (x, y) ���·� ����Ͻÿ�. 
��, x�� y�� 10������ �ڿ����Դϴ�.
 */

// Ŭ���� ����, Ŭ���� �̸� test3
public class test3 {

	// �޼ҵ� ����(public), ���� �޼ҵ�(static), ���ϰ� ����(void), �޼ҵ� �̸�(main)
	public static void main(String[] args) {
		// for�� ���� ������ ���� i���� 1����, i�� 10���� �۰ų� ������, i ������++
		for(int i = 1; i <= 10; i++) {
			// ���� for�� ���� ������ ���� j���� 1����, j�� 10���� �۰ų� ������, j ������++
			for(int j = 1; j <= 10; j++) {
				int cal = 4 * i + 5 * j; // ������ ���� cal ���� 4 * i + 5 * j �� �� ����
				if(cal == 60) { // cal�� 60�� ������
					System.out.printf("(%d, %d)\n", i, j); // x, y�� ���
				
				} // End if��
			} // End ���� for��
		} // End ù��° for��
	} // End main
} // End class
