/*����2
while���� Ȱ���Ͽ� 'q'�� �Էµ� ������ �Է��� ���ڸ� ��� ����ϴ� ���α׷��� �ۼ��غ���.
 */

import java.util.Scanner; // ��ĳ�� ��� ȣ��

//Ŭ���� ����, Ŭ���� �̸� test2
public class test2 {

	// �޼ҵ� ����(public), ���� �޼ҵ�(static), ���� �������� ����(void), �޼ҵ� �̸�(main)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);// Scanner ����� ���� ���� sc ����
		System.out.println("Enter the number: "); // �Է�
		int num = sc.nextInt(); // �Է°� ����
		String isPrime = "Prime number";
		
		// i���� 2���� i�� num���� �۰� i ������++
		for(int i=2; i<num; i++) {
			if(num % i==0) {
				isPrime = "not prime number";
			}
		}
		System.out.printf("%d is %s", num, isPrime);
	} // End main

} // End class
