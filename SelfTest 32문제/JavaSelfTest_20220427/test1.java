/*����1
 ���� ������ �Է¹޾� 90~100���� A, 80~89���� B, 70~79���� C, 60~69���� D, �������� F�� ����ϴ�
 ���α׷��� �ۼ��Ͻÿ�.
 */

import java.util.Scanner; // ��ĳ�� ��� ȣ��

//Ŭ���� ����, Ŭ���� �̸� test1
public class test1 {

	// �޼ҵ� ����(public), ���� �޼ҵ�(static), ���� �������� ����(void), �޼ҵ� �̸�(main)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner ����� ���� ���� sc ����
		int score = sc.nextInt(); // ���� ����
		sc.close(); // ��ĳ�� ����
		
		if(score <= 100 && score >= 90) { // score�� 100���� �۰ų� ���� 90���� ũ�ų� ������
			System.out.println("A"); // A ���
		} else if(score <= 89 && score >= 80) { // score�� 89���� �۰ų� ���� 80���� ũ�ų� ������
			System.out.println("B"); // B ���
		} else if(score <= 79 && score >= 70) { // score�� 79���� �۰ų� ���� 70���� ũ�ų� ������
			System.out.println("C"); // C ���
		} else if(score <= 69 && score >= 60) { // score�� 69���� �۰ų� ���� 60���� ũ�ų� ������
			System.out.println("D"); // D ���
		} else {
			System.out.println("F"); // F ���
		} 
	} // End main

} // End class
