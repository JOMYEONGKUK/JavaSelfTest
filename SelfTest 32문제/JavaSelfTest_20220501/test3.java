/*����3
�� ���� �ֻ����� ������ �� ���� ���� 6�� �Ǵ� ��� ����� ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */

//Ŭ���� ����, Ŭ���� �̸� test3
public class test3 {

	// �޼ҵ� ����(public), ���� �޼ҵ�(static), ���� �������� ����(void), �޼ҵ� �̸�(main)
	public static void main(String[] args) {
		
		int sum = 6; // sum ���� 6����
		
		// i���� 1���� i�� 6���� �۰ų� ���� i ������++
		for(int i = 1; i<=6; i++) {
			for(int j = 6; j>0; j--) { // j���� 1���� j�� 0���� ũ�� j ���Ұ�--
				if(i + j == 6) { // i+j �� ���� 6�� ������
					System.out.println(i + "+" + j + "=" +  (i + j)); // �� ���
				} // End if��
			} // End ���� for��
		} // End ù��° for��

	} // End main

} // End class
