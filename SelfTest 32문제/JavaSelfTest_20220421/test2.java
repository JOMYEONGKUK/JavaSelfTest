/*���� 2
for���� �̿��ؼ� 12�� ����� ���Ͻÿ�.
*/

// Ŭ���� ����, Ŭ���� �̸� test2
public class test2 {

	// �޼ҵ� ����(public), ���� �޼ҵ�(static), ���� �������� ����(void), �޼ҵ� �̸�(main)
	public static void main(String[] args) {
		
		int sum=0; // ������ ���� sum ���� 0����
		for(int i=0; i<11; i++) { // ������ ���� i�� 0�ε� i�� 11���� ������
			if(i % 2!=0) { // i�� 2�� �ȳ�������
				System.out.println(i+""); // Ȧ�� ���
				sum += i; // ���� ���� sum���� ������ ���� ���ϰ� �����
			}
		}
		System.out.println(); // ������ ��ĭ �ٹٲ�
		System.out.println("1~10�� Ȧ���� ��:" +sum); // 1���� 10���� Ȧ���� �� ���
	} // End main

} // End class
