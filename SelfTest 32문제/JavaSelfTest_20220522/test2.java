/*���� 2
3���� ����� �̸��� �Է� �޾Ƽ� �迭�� �����ѵ� �Է� ���� ���� ����ϼ���.
*/

import java.util.Scanner; // ��ĳ�� ��� ȣ��

// Ŭ���� ����, Ŭ���� �̸� test2
public class test2 {

	// �޼ҵ� ����(public), ���� �޼ҵ�(static), ���� �������� ����(void), �޼ҵ� �̸�(main)
	public static void main(String[] args) {
                   
		String[] names = new String[3]; // ���ڿ� �迭 names ���� 3�� ����
        int size = names.length; // size ���� names ���� ����

        Scanner put = new Scanner(System.in); // Scanner ����� ���� put ���� ����

        // i���� 0����, i�� size���� ������, i ������++
        for(int i=0; i<size; i++){
        	System.out.print("�̸��� �Է��ϼ���. "); // �̸� �Է�
        	names[i] = put.next(); // �Է¹��� �̸� ����
       
        } // End ù��° for��
        
        // i���� 0����, i�� size���� ������, i ������++
        for(int i=0; i<size; i++){
        	System.out.println("�̸�: " +names[i]); // �Է¹��� �̸� �迭�������� ���

     } // End �ι�° for��

   } // End main

} // End class
