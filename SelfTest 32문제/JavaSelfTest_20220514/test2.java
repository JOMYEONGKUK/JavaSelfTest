/*���� 2
�ϳ��� ���ڸ� �Է¹޾� 2�� 3�� ����� �ƴϸ� ��� while���� ����
2�� 3�� ����̸� ���α׷� �����ϱ� while�� ���
 */

import java.util.Scanner; // ��ĳ�� ��� ȣ��

// Ŭ���� ����, Ŭ���� �̸� test2
public class test2 {

	// �޼ҵ� ����(public), ���� �޼ҵ�(static), ���ϰ� ����(void), �޼ҵ� �̸�(main)
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); // Scanner ����� ���� ���� scanner ����
	    System.out.print("�ϳ��� ������ �Է��ϼ���: "); // �ϳ��� ���� �Է�
	    int num = scanner.nextInt(); // �Էµ� ���� ����
	            
	    while(true) { // while true ���ѹݺ� ����
	    	if(num%2 == 0 && num%3 == 0) { // num�� 2�� �������� &&(and) num�� 3���� ��������
	    		System.out.println(num +"��" + "2�� 3�� ����Դϴ�."); // ������ ���̸� ���
	            System.out.println("���α׷� ����!"); // ������ ���̸� ���α׷� ����! ���
	            break; // �ݺ��� Ż��
	     }
	            
	     System.out.println(num +"��" + "2�� 3�� ����� �ƴմϴ�."); // ������ ���� �ƴϸ� ���
	     System.out.print("�ϳ��� ������ �Է��ϼ���: "); // 2�� 3�� ����� �Է����� �ʾ����� ��� 
	     num = scanner.nextInt(); //�ϳ��� ���� �Է�
	            }
	            
	     scanner.close(); // scanner ����
	        
	  } // End main
	 
} // End class
