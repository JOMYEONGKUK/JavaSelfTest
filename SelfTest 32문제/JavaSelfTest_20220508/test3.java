/*����3
������ �ð�� �Ϸ� ���� �� ���� �������� ǥ�õ˴ϴ�.
�Ϸ絿�� 3�� ǥ�õǴ� �ð��� �������� ���Ѵ� ���α׷��� �ۼ��ϼ���.
 */

//Ŭ���� ����, Ŭ���� �̸� test3
public class test3 {

	// �޼ҵ� ����(public), ���� �޼ҵ�(static), ���� �������� ����(void), �޼ҵ� �̸�(main)
	public static void main(String[] args) {
		
		int count = 0; // count ���� 0����
		
		// i���� 0���� i�� 23���� �۰ų� ���� i ������++
		for(int i=0; i<=23; i++) {
			for(int j=0; j<=59; j++) {
				int num1 = i%10; // num1 ����
				int num2 = j/10; // num2 ����
				int num3 = j%10; // num3 ����
				
				if(num1 == 3 || num2 == 3 || num3 == 3) {
					count++;
				}
			}
		}
		System.out.println(count);
		
	} // End main

} // End class
