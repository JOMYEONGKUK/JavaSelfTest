/*���� 2
������ �Է� �޾� "����̾簡"�� ���ϴ� ���α׷�
 */

import java.util.Scanner; // ��ĳ�� ��� ȣ��

//Ŭ���� ����, Ŭ���� �̸� test2
public class test2 {

	// �޼ҵ� ����(public), ���� �޼ҵ�(static), ���� �������� ����(void), �޼ҵ� �̸�(main)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  // Scanner ����� ���� sc ���� ����
		System.out.print("������ �Է��ϼ���: "); // ���� �Է�
		int score = sc.nextInt(); // �Է¹��� ���� ����
		
		String grade = "��"; // grade ���� "��" ����
		
		// score�� 0���� ũ�ų� ���� &&(and) score�� 100���� �۰ų� ������
		if(score>=0 && score<=100) { 
			switch(score/10) { // switch�� ���� score�� 10���� ������
				case 10 : // case 10 ����
				case 9 : // case 9 ����
				
				grade = "��"; // grade �� �� ����
				break; // switch�� ����
				
				case 8 : // case 8 ����
				grade = "��"; // grade �� �� ����
				break; // switch�� ����
				
				case 7 : // case 7 ����
				grade = "��"; // grade �� �� ����
				break; // switch�� ����
				
				case 6 : // case 6 ����
				grade = "��"; // grade �� �� ����
				} 
		} else {  // ���� �������� 0�̸� 100�ʰ� ���� �Է����� ��
			grade = "�������� �߸��Ǿ����ϴ�."; }  // �������� �߸��Ǿ����ϴ�. ���
		System.out.print(grade); // grade ���
	
	} // End main 
} // End class