/*���� 3
2001����� 2012�� ���̿��� ������ ���Ͻÿ�.
*/

// Ŭ���� ����, Ŭ���� �̸� test3
public class test3 {

	// �޼ҵ� ����(public), ���� �޼ҵ�(static), ���� �������� ����(void), �޼ҵ� �̸�(main)
	public static void main(String[] args) {
		
		// ������ ���� year ���� 2001 ���� year�� 2012���� �۰� year ������++
		for(int year = 2001; year <= 2012; year++) {
			// year�� 4�� ���������� year�� 100�� �ȳ������� year�� 400�� �������°�
			if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ) {
				
				// ������ ���
				System.out.println(year);
			} // End if
		} // End for

	} // End main

} // End class
