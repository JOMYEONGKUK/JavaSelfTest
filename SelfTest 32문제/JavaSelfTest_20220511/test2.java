/*���� 2
�Ʒ��� ���� �л����� ���� ������ ���ڿ��� ����Ǿ� ���� ��, �� ���� �� �л� ���� ����Ͻÿ�.
String score = "A,A,B,C,D,A,C,D,D,D,F
 */

// Ŭ���� ����, Ŭ���� �̸� test2
public class test2 {

	// �޼ҵ� ����(public), ���� �޼ҵ�(static), ���� �������� ����(void), �޼ҵ� �̸�(main)
	public static void main(String[] args) {
		
		// ���ڿ� ���� score ����, A,A,C,D,A,C,D,D,D,F �� ����
		String score = "A,A,B,C,D,A,C,D,D,D,F";
		int a = 0; // ������ ���� a ���� 0����
		int b = 0; // ������ ���� b ���� 0����
		int c = 0; // ������ ���� c ���� 0����
		int d = 0; // ������ ���� d ���� 0����
		int f = 0; // ������ ���� f ���� 0����
		
		String[] score2 = score.split(",");
		
		// for�� ���� ������ i���� 0����, i�� score2 ���̺��� ������, i ������++
		for (int i = 0; i < score2.length; i++) {
			if (score2[i].equals("A")) { // score2[i]���� A��
				a++; // a ������++
			} else if (score2[i].equals("B")) { // score2[i]���� B��
				b++; // b ������++ 
			} else if (score2[i].equals("C")) { // score2[i]���� C��
				c++; // c ������++
			} else if (score2[i].equals("D")) { // score2[i]���� D��
				d++; // d ������++
			} else { // ����
				f++; // f ������++
			}

		}
		System.out.println("A : " + a + "��"); // A �л� �� ���
		System.out.println("B : " + b + "��"); // B �л� �� ���
		System.out.println("C : " + c + "��"); // C �л� �� ���
		System.out.println("D : " + d + "��"); // D �л� �� ���
		System.out.println("F : " + f + "��"); // F �л� �� ���
	} // End main
} // End class