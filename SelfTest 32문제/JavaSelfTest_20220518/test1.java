/*���� 1
Ű����� �Է� ���� ������ ������ ����ϰ� ����� ���� ���� ȭ�鿡 ����Ͽ� Ȯ���ϼ���.
�� �� ������ 'M'�̸� ���л�, 'M'�� �ƴϸ� ���л����� ��� ó�� �ϼ���.
 */

import java.util.Scanner; // ��ĳ�� ��� ȣ��

//Ŭ���� ����, Ŭ���� �̸� test1
public class test1 {
	
	// �޼ҵ� ����(public), ���� �޼ҵ�(static), ���� �������� ����(void), �޼ҵ� �̸�(main)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner ����� ���� ���� scan ����
		
		System.out.print("�̸� : "); // �̸� �Է�
		String name = sc.nextLine(); // �̸� ����
		
		System.out.print("�г�(���ڸ�) : "); // �г� �Է�
		int grade = sc.nextInt(); // �г� ����
		
		System.out.print("��(���ڸ�) : "); // �� �Է�
		int classgrade = sc.nextInt(); // �� ����
		
		System.out.print("��ȣ(���ڸ�) : "); // ��ȣ �Է�
		int classNum = sc.nextInt(); // ��ȣ ����
		sc.nextLine();
		
		System.out.print("����(M/F) : "); // ���� �Է�
		char gender = sc.nextLine().charAt(0); // ���� ����
		
		System.out.print("����(�Ҽ��� �Ʒ� ��° �ڸ����� : "); // ���� �Է�
		double score = sc.nextDouble(); // ���� ����
		
		String student = (gender == 'M') ? ("���л�") :("���л�"); // ���л����� ���л����� ����
		
		System.out.println(grade + "�г� " + classgrade + "�� " + classNum + "�� " + 
		name + student + "�� ������ " + score + "�̴�"); // �г�, ��, ��ȣ, ���� ���
		
		// �� ���� ���
		System.out.printf("%d�г� %d�� %d�� %s %s�� ������ %.2f�̴�.", grade, classgrade, classNum, name, student, score);
		
	} // End main
} // End class