/*���� 3
�׸��� ���� ���('-') ���ڷ� ������ ������ ���ڸ� �־��� ���ڿ� ���� ����ϰ� ���� �� ���ǰ� �Ǵ� ����� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */

import java.util.Scanner; // ��ĳ�� ��� ȣ��

//Ŭ���� ����, Ŭ���� �̸� test3
public class test3 {

	// �޼ҵ� ����(public), ���� �޼ҵ�(static), ���� �������� ����(void), �޼ҵ� �̸�(main)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Scanner ����� ���� ���� sc ����
		System.out.print("ù�ڸ� 0�� ������ ���ڸ� �Է����ּ���: "); // ���� �Է�
		int num = sc.nextInt(); //�Է¹��� ���� ����
		System.out.print("���('-')�� ����: "); // ���('-')�� ���� ���
		System.out.println(Number(num)); // num �� ���
		

		}
	
		// �޼ҵ� ����(public), ���� �޼ҵ�(static), �޼ҵ� �̸�(Number)
		public static int Number(int num) {
			int result = 0; // ������ ���� result ���� 0����
			int[] arr = {6,2,5,5,4,5,6,4,7,6}; // ������ �迭 ���� arr ���� 6,2,5,5,4,5,6,4,7,6 �� ����
			while(num>0) { // �ݸ� ���� num�� 0���� ũ��
				int num2 = num%10; // ������ ���� num2 ����, num%10 �� �� ����
				num/=10; // num = num / 10
				result+=arr[num2]; 
		}	return result; // result ����
	}
}
