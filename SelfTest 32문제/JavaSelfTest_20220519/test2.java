/*���� 2
Ű���� �Է����� Ž���� �� �ִ� �ڵ��� �Ұ� ���α׷��� ����ϴ�.
�Ʒ��� ���� �޴��� ��µ˴ϴ�.
"I","i","C","c","E","e"�� �Է��ϸ� �ش�Ǵ� �޴��� �̵��մϴ�.
 */

package cooperation; // ��Ű�� ����, ��Ű�� �̸� cooperation

import java.util.Scanner; // ��ĳ�� ��� ȣ��

// Ŭ���� ����, Ŭ���� �̸� test2
public class test2 {

	// �޼ҵ� ����(public), ���� �޼ҵ�(static), ���� �������� ����(void), �޼ҵ� �̸�(main)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner ����� ���� ���� sc ����
		
		boolean inMainMenu = true; // boolean inMainMenu ���� true
		while(inMainMenu) { // �ݺ��� ����
			System.out.println("(I)ntro (C)ourses (E)xit"); // I, C, E�߿� ����
			
			switch(sc.next()) { // switch������ �Է°� ���ڿ���
				case "I": // I ����
				case "i": // i ����
					System.out.println("�ȳ��ϼ���! �츮�� �ڵ����Դϴ�. \n" + "�Բ� �����սô�!");
					break; // �ݺ��� ����
				case "C": // C ����
				case "c": // c ����
					
					boolean inCourseMenu = true; // boolean inCoursMenu ���� true
					while(inCourseMenu) { // �ݺ��� ����
						// ���� �Ұ� P J i B �߿� �����ϴ� â ���
						System.out.println("�ڵ��� ������ �Ұ��մϴ�. \n" + "(P)ython (J)ava (i)OS (B)ack");
						
						switch(sc.next()) { // switch�� ���� �Է°� ���ڿ���
							case "P": // P ����
							case "p": // p ����
								// Python ��� ���� ���� �� ���� ���
								System.out.println("Python �� ���� ��ǻ�� ���̾��� ���ʸ� ���ϴ�.\n" + "����: ������\n" + "��õ ��������: ����\n");
								break; // ����
							case "J": // J ����
							case "j": // j ����
								// Java ��� ���� ���� �� ���� ���
								System.out.println("Java�� ���� ������ ��ü������ ���α׷����� ���ϴ�.\n" + "����: ���\n" + "��õ ��������: ����\n");
								break; // ����
							case "I": // I ����
							case "i": // i ����
								// Swift ��� ���� ���� �� ���� ���
								System.out.println("�ֽ� Swift �� ���� iOS ������ ������ �� �ֽ��ϴ�.\n" + "����: ����\n" + "��õ ��������: Python, Java\n");
								break; // ����
							case "B": // B ����
							case "b": // b ����
								inCourseMenu = false; // inCourseMenu�� false ����
								break; // ����
							default: // ����
								System.out.println("�ٽ� �Է��� �ּ���."); // �ٽ� �Է����ּ���. ���
								break; // ����
						}// End �ι�° switch��
					} // End �ι�° while��
					break; // ����
				case "E": // E ����
				case "e": // e ����
					System.out.println("�ȳ��� ������."); // �ȳ��� ������. ���
					inMainMenu = false; // inMainMenu�� false ����
					break; // ����
				default: // ����
					System.out.println("�ٽ� �Է��� �ּ���."); // �ٽ� �Է��� �ּ���. ���
					break; // ����
					
			} // End ù��° switch��
		} // End ù��° while��

	} // End main

} // End class
