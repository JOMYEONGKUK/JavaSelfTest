/*����1
 ������ ȸ������ ���ϴ� ���α׷��̴�. ȸ������, ���ڸ� �Ųٷ� �о ������ �д� �Ͱ� ���� ���� ���Ѵ�. ���� ���
  '12321'�̳� '13531'���� ���� ���Ѵ�. (1)�� �˸��� �ڵ带 �־ ���α׷��� �ϼ��Ͻÿ�.
 */
 
import java.util.Scanner; // ��ĳ�� ��� ȣ��

//Ŭ���� ����, Ŭ���� �̸� test1
public class test1 {

	// �޼ҵ� ����(public), ���� �޼ҵ�(static), ���� �������� ����(void), �޼ҵ� �̸�(main)
	public static void main(String[] args) {
		
		// Scanner ����� ���� ���� sc ����
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���: "); // ���� �Է�
		int number = sc.nextInt(); // ���� ���� 
		
			int temp = number; // temp ����
			
			int result = 0; // result ���� 0���� 
			
			while(temp != 0) { // �ݺ��� ���� temp�� 0�� �ٸ���
				result = result * 10 + temp % 10;
				temp /= 10;
			}
			if(number == result) { // number�� result�� ������
				System.out.println(number + "�� ȸ���� �Դϴ�.");
			} else {
				System.out.println(number + "�� ȸ������ �ƴմϴ�.");
			}

	} // End main

} // End class
