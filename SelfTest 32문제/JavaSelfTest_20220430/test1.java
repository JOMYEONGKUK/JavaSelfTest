/*����1
���� �Ѱ��� �Է¹ް� �ҹ����� ��� �빮�� �빮���� ��� �ҹ��ڷ� ���
���ĺ��� �ƴ� ��� �Է½� �߸��� �Է� ���
 */

import java.util.Scanner; // ��ĳ�� ��� ȣ��

//Ŭ���� ����, Ŭ���� �̸� test1
public class test1 {

	// �޼ҵ� ����(public), ���� �޼ҵ�(static), ���� �������� ����(void), �޼ҵ� �̸�(main)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner ����� ���� ���� sc ����
		String inputString = " "; // inputString ����
		
		System.out.println("�� �Է����ּ���: "); // ��� �Է�
		inputString = sc.next(); // ��� ����
		
		char[] change = inputString.toCharArray(); // char �迭 change ����
		
		// i���� 0���� i�� change ���̺��� �۰� i ������++
		for(int i=0; i<change.length; i++) {
			
			if(change[i] >= 'A' && change[i] <= 'Z') { // + 32���ְ� �ҹ��� ��ȯ
			   change[i] = (char) (change[i] + 32);
			} else if(change[i] >= 'a' && change[i] <= 'z') { // -32���ְ� �빮�� ��ȯ
				change[i] = (char) (change[i] - 32);
			} else {
				System.out.println("�߸��� �Է�"); // �߸��� �Է� ��� 
				break; // ����
			}
		}
		System.out.println(change); // ��ȯ�� �� ���
	} // End main

} // End class
