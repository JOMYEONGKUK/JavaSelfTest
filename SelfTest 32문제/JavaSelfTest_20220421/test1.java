/*���� 1
0 ~ 10���� ���� ���� ����ϼ���.
*/

// Ŭ���� ����, Ŭ���� �̸� test1
public class test1 {
	
	// �޼ҵ� ����(public), ���� �޼ҵ�(static), ���� �������� ����(void), �޼ҵ� �̸�(main)
	public static void main(String[] args) {
		
		int sum = 0; // ������ ���� sum ���� 0����
		for(int i=0; i<11; i++)  { // ������ ���� i�� 0�ε� i�� 11���� ������
			sum += i; // ���� ���� sum���� ������ ���� ���ϰ� �����
		}
		System.out.println("���� �� �����:"+sum); // �ֿܼ� ��µǴ� ���๮
	} // End main

} // End class
