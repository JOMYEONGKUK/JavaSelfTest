/*���� 3
����Ʈ�̵�����簳�߿��� �ν��� Java ���蹮���� ä���ϰ� �ִ�.
�������� 'o'�Ǵ� 'x'�� ǥ�ð� �Ǿ� �ִµ� ������ �ű�� ����� Ư���ϴ�.
'o'�� ������ �����Ǵ� ������� ä���Ǵµ� �������� �ڽ��� ������ ���ӵ� 'o'�� ���� ��ŭ�� ������ ä���� �˴ϴ�.
���� ��� 'oooxoo'��� ǥ�ð� �ִٸ� ������� 1+2+3+0+1+2=9 �� ������ ���˴ϴ�. �л��� Ǭ ��������
����, ���� ���ΰ� ǥ�õǾ� ���� �� ������ ���ϴ� ���α׷��� �ۼ��ϼ���.
 */

import java.util.Scanner; // ��ĳ�� ��� ȣ��

// Ŭ���� ����, Ŭ���� �̸� test3
public class test3 {

	// �޼ҵ� ����(public), ���� �޼ҵ�(static), ���ϰ� ����(void), �޼ҵ� �̸�(main)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner ����� ���� ���� sc ����
		
		System.out.println("===ä���ϱ�==="); // ä���ϱ� ���
		String ans = sc.next(); // �Է¹��� ox ����
		
		String[] arr = ans.split(""); // ���ڿ� �迭 ���� arr ����
		
		int score = 0; // ������ ���� score ����, 0����
		int sum = 0; // ������ ���� sum ����, 0����
		
		// for�� ���� ������ ���� i���� 0����, i�� arr���̺��� ������, i ������++
		for(int i=0; i<arr.length; i++) {
			if(arr[i].equals("o")) { // arr �迭�� o�� ������
				score++; // score ������++
			} else { // ����
				score = 0; // socre 0����
			}sum+=score; // sum = sum + score
			
			
		}
		System.out.println(sum); // sum �� ���

	} // End main

} // End class
