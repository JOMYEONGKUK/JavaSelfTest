/*����2
����ȣ(Carnumber) �Է� �� �� ���Ϻ� ���ڸ��� ���� �¿��� �������� �ִ�. ������ ����ϴ� ���α׷� �ۼ��ϱ�
 */

import java.util.Scanner; // ��ĳ�� ��� ȣ��

//Ŭ���� ����, Ŭ���� �̸� test2
public class test2 {

	// �޼ҵ� ����(public), ���� �޼ҵ�(static), ���� �������� ����(void), �޼ҵ� �̸�(main)
	public static void main(String[] args) {
		
		System.out.println("������ȣ�� �Է��ϼ���: "); // ������ȣ �Է�:
	    Scanner sc = new Scanner(System.in);  	// Scanner ����� ���� ���� sc ����
	    int number = sc.nextInt(); // ������ȣ ���� 
	    
	    // num % 10�� ���� 1�� 6�� ������
	    if((number%10)==1 |(number%10)==6) {
	    	System.out.println("������");
	    	// num % 10�� ���� 2�� 7�� ������
	    } else if((number%10)==2 |(number%10)==7) {
	        System.out.println("ȭ����");
	     // num % 10�� ���� 3�� 8�� ������
	    } else if((number%10)==3 |(number%10)==8) {
	        System.out.println("������");
	     // num % 10�� ���� 4�� 9�� ������
	    } else if((number%10)==4 |(number%10)==9) {
	        System.out.println("�����");
	     // num % 10�� ���� 5�� 0�� ������
	    } else if((number%10)==5 |(number%10)==0) {
	        System.out.println("�ݿ���");
	        }
	    
	   } // End main
	 
} // End class




