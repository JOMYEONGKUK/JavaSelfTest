/*����2
8ĭ ũ���� �迭�� �����ϰ� ���� ���� �ʱ�ȭ �� �� ���� ū���� ���� ���� ���� ����Ͻÿ�.
 */

import java.util.Arrays; // ��� ��� ȣ��
import java.util.Random; // ���� ��� ȣ��

//Ŭ���� ����, Ŭ���� �̸� test2
public class test2 {

	// �޼ҵ� ����(public), ���� �޼ҵ�(static), ���� �������� ����(void), �޼ҵ� �̸�(main)
	public static void main(String[] args) {
		
		// 1���� �迭 ���� 
		int[] arr = new int[8];
		Random random = new Random(); // ����
		
		int max = 0; // max ���� 0����
		int min = 0; // min ���� 0����
		
		// i���� 0���� i�� arr���̺��� �۰� i ������++
		for(int i=0; i<arr.length; i++) {
			arr[i] = random.nextInt(100);
		}
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr);
		System.out.println("���� ū ��: "+arr[7]); // ���� ū �� ���
		System.out.println("���� ���� ��: "+arr[0]); // ���� ���� �� ���

	} // End main

} // End class
