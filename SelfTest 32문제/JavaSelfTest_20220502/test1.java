/*����1
1���� 100������ ���ڸ� �Է� ����ڰ� �Է� ��ǻ�� �߻���Ų ���� ��ġ�ϸ� ���ߴ� ���α׷��� �ۼ��Ͻÿ�.
 */

import java.util.Random; // ���� ��� ȣ��
import java.util.Scanner; // ��ĳ�� ��� ȣ��

//Ŭ���� ����, Ŭ���� �̸� test1
public class test1 {

	// �޼ҵ� ����(public), ���� �޼ҵ�(static), ���� �������� ����(void), �޼ҵ� �̸�(main)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner ����� ���� ���� sc ����
		
		int randomNum = 0; // randomNum ���� 0����
		
		int userNum = 0; // userNum ���� 0����
		
		int count = 0; // count ���� 0����
		
		Random ran = new Random();
		randomNum = ran.nextInt(100) + 1;
		
		while(true) { // while true ���ѹݺ� ����
			System.out.println("1���� 100���� ���ڸ� �Է��ϼ���."); // ���� �Է�
			userNum = sc.nextInt(); // ���� ����
			count++; // count ������ ++
			if(randomNum > userNum) // ran�� user���� ũ��
				System.out.println("1�� 100������ �� �� �Է��� ������ ū ���� �Է��ϼ���."); // ���̸� ���  
			else if(randomNum < userNum) // user�� ran���� ũ�� 
				System.out.println("1�� 100������ �� �� �Է��� ������ ���� ���� �Է��ϼ���."); // ���̸� ��� 
			else {
				System.out.println("����ڰ� �Է��� ���� ��ǻ�Ͱ� �߻���Ų ������ ���� ��ġ�մϴ�."); // ��ġ�ϸ� ���
				System.out.printf("�� ���� Ƚ���� %d�� �Դϴ�.", count);
				break; // �ݺ��� Ż��
			}
		} // End while true	

	} // End main

} // End class
