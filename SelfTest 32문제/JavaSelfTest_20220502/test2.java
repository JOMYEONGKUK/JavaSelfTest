/*����2
������ �� ���� �׼��� �Է¹޾� 5���� 1�� 5õ�� 1õ�� 500�� 100�� 50�� 1�� ����
�� ��� ��ȯ �Ǵ����� ����϶�.
 */

import java.util.Scanner; // ��ĳ�� ��� ȣ��

//Ŭ���� ����, Ŭ���� �̸� test2
public class test2 {

	// �޼ҵ� ����(public), ���� �޼ҵ�(static), ���� �������� ����(void), �޼ҵ� �̸�(main)
	public static void main(String[] args) {
		
		// ���� 11�� ����
		int num, res, res2, res3, res4, res5, res6, res7, res8, res9, totalNum;
		
		Scanner sc = new Scanner(System.in); // Scanner ����� ���� ���� sc ����
		System.out.println("�ٲٰ� ���� �׼��� �Է��ϼ���: "); // �׼� �Է�
		num = sc.nextInt(); // �׼� ����
		totalNum = num;
		
		res = totalNum / 50000; // totalNum ������ ����
		totalNum = totalNum - (res * 50000);
		System.out.println("5���� ���� = " + res);
		
		res2 = totalNum / 10000; // totalNum ������ ����
		totalNum = totalNum - (res * 10000); 
		System.out.println("1���� ���� = " + res2);
		
		res3 = totalNum / 5000; // totalNum ������ ����
		totalNum = totalNum - (res * 5000); 
		System.out.println("5õ�� ���� = " + res3);
		
		res4 = totalNum / 1000; // totalNum ������ ����
		totalNum = totalNum - (res * 1000); 
		System.out.println("1õ�� ���� = " + res4);
		
		res5 = totalNum / 500;  // totalNum ������ ����
		totalNum = totalNum - (res * 500);
		System.out.println("500�� ���� = " + res5);
		
		res6 = totalNum / 100;  // totalNum ������ ����
		totalNum = totalNum - (res * 100);//
		System.out.println("100�� ���� = " + res6);
		
		res7 = totalNum / 50; // totalNum ������ ����
		totalNum = totalNum - (res * 50);  
		System.out.println("50�� ���� = " + res7);
		
		res8 = totalNum / 10; // totalNum ������ ����
		totalNum = totalNum - (res * 10); 
		System.out.println("10�� ���� = " + res8);
		
		res9 = totalNum / 1; // totalNum ������ ����
		totalNum = totalNum - (res * 1);
		System.out.println("1�� ���� = " + res9);

	}

}
