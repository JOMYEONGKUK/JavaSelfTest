/*����1
���� �����Կ� ��ǥ �����Ը� �Է� �ް� ������ ���� �����Ը� �Է¹޾� ��ǥ �޼��� ���ϸ޼����� ���� ���α׷��� �����Ͻÿ�.
 */

import java.util.Scanner; // ��ĳ�� ��� ȣ��

//Ŭ���� ����, Ŭ���� �̸� test1
public class test1 {

	// �޼ҵ� ����(public), ���� �޼ҵ�(static), ���� �������� ����(void), �޼ҵ� �̸�(main)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner ����� ���� ���� sc ����
		System.out.println("���� ������: "); // ���� ������ �Է�
		int now = sc.nextInt(); // ���� ������ ����
		
		System.out.println("��ǥ ������: "); // ��ǥ ������ �Է�
		int future = sc.nextInt(); // ��ǥ ������ ����
		
		int i = 1; // i���� 1����
		int j = 0; // j���� 0����
		
		while(true) { // ���ѹݺ� ����
			System.out.println(i+"���� ���� ������: "); // ���� ���� ������ �Է�
			j = sc.nextInt(); // ���� ������ ����
			now -= j;
			if(future >= now) ///future�� now���� ũ�ų� ������
				break; // �ݺ��� Ż��
			i++; // i ������++
		}
		System.out.println(now+"kg �޼�! �����մϴ�."); // ��ǥ ������ �޼� �� ���
	} // End main

} // End class
