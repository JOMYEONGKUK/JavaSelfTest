/*���� 3
��Ģ���� ��� 10, 100, 1000�� ������.
�� ���� ���� ���� �缱��x
print�ȿ� ���� ���x
�ּ� �ΰ� ���� ���
*/

// Ŭ���� ����, Ŭ���� �̸� test3
public class test3 {

	// �޼ҵ� ����(public), ���� �޼ҵ�(static), ���� �������� ����(void), �޼ҵ� �̸�(main)
	public static void main(String[] args) {
		
		int a = 1; // ���� a���� 1����
		int b = 2; // ���� b���� 2����
		int c = 3; // ���� c���� 3����
		
		System.out.println((a+b) * c + a); // 3 x 3 + 1 �� ���
		System.out.println((a+ c*c) * (a+ c*c)); // 10 * 10 �� ���
		System.out.println(a*500+ b*100 + c*100); // 500 + 200 + 300 �� ���

	} // End main

} // End class
