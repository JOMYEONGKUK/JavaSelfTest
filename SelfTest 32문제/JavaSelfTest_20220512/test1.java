/*���� 1
������ ���� 10�⵿�� ������ ��� ������ ��� �󸶳� ���� ���ִ��� ����ϼ���. 
 */

import java.util.Scanner; // ��ĳ�� ��� ȣ��

// Ŭ���� ����, Ŭ���� �̸� test1
public class test1 {

	// �޼ҵ� ����(public), ���� �޼ҵ�(static), ���� �������� ����(void), �޼ҵ� �̸�(main)
	public static void main(String[] args) {
		
		int salary; // ������ ���� salary ����
	    int YEAR = 10; // ������ ���� YEAR ���� 10����
	       
	    Scanner input = new Scanner(System.in); // Scanner ����� ���� ���� sc ����
	    System.out.print("������ �Է��ϼ���: "); // ���� �Է�:
	    salary = input.nextInt()*YEAR*12; // �Է¹��� ���� ����
	    
	    System.out.println(YEAR+"�� ������ ����� : "+salary); // 10�� ������ ����� ���
	 
	} // End main
} // End class
