/*����3
���� 3���� �Է� �ް� �߰� ũ���� ���� ����϶�.
 */

import java.util.Scanner; // ��ĳ�� ��� ȣ��

//Ŭ���� ����, Ŭ���� �̸� test3
public class test3 {

	// �޼ҵ� ����(public), ���� �޼ҵ�(static), ���� �������� ����(void), �޼ҵ� �̸�(main)
	public static void main(String[] args) {
		
		// ������ ���� ���� ����
		int numA, numB, numC;
		
		Scanner sc = new Scanner(System.in); // Scanner ����� ���� ���� sc ����
		System.out.println("A�� ���� �Է��ϼ���: "); // A�� �� �Է� 
		numA = sc.nextInt(); // A�� ����
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("B�� ���� �Է��ϼ���: "); // B�� �� �Է�
		numB = sc1.nextInt(); // B�� ����
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("C�� ���� �Է��ϼ���: "); // C�� �� �Է�
		numC = sc2.nextInt(); // C�� ����
		
		// A�� B���� �۰� A�� C ���� ũ�� A�� C���� �۰� A�� B ���� ũ��
		if ((numA < numB && numA > numC) || (numA < numC && numA > numB)) {
			System.out.println("A�� �߰��� �Դϴ� = " + numA); // A �� ���
			// B�� A���� �۰� B�� C ���� ũ�� B�� C���� �۰� B�� A ���� ũ��
		} if ((numB < numA && numB > numC) || (numB < numC && numB > numA)) {
			System.out.println("B�� �߰��� �Դϴ� = " + numB); // B �� ���
		} else {
			System.out.println("C�� �߰��� �Դϴ� = " + numC); // C �� ���
		}
	} // End main

} // End class
