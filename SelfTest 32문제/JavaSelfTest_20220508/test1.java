/*����1
while���� Ȱ���Ͽ� 'q'�� �Էµ� ������ �Է��� ���ڸ� ��� ����ϴ� ���α׷��� �ۼ��غ���.
 */

import java.util.Scanner; // ��ĳ�� ��� ȣ��

//Ŭ���� ����, Ŭ���� �̸� test1
public class test1 {

	// �޼ҵ� ����(public), ���� �޼ҵ�(static), ���� �������� ����(void), �޼ҵ� �̸�(main)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner ����� ���� ���� sc ����
		char ch; // char�� ���� ch ����
		
		do { // do�� ����
			System.out.println("Enter the alphaber: ");
			ch = sc.next().charAt(0); // �Է¹��� ���� ����
		} while(ch != 'q'); // ch�� q�� �ٸ���
			System.out.println("Finish");
	} // End main

} // End class
