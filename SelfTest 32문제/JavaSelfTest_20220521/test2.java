/*���� 2
�ټ� ���� �ڿ����� �ִ�. �� ���� ��� ��κ��� ����� ���� �� �� ��� �� ���� ������ ���� ���� ���� �ڿ����̴�.
���� �ٸ� �ټ� ���� �ڿ����� �־��� ��, ��� ��κ��� ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
�Է� : ù° �ٿ� �ټ� ���� �ڿ����� �־�����. 100���� �۰ų� ���� �ڿ����̰�, ���� �ٸ� ���̴�.
��� : ù° �ٿ� ��� ��κ��� ����� ����Ѵ�.
 */

import java.util.Scanner; // ��ĳ�� ��� ȣ��

//Ŭ���� ����, Ŭ���� �̸� test2
public class test2 {

	// �޼ҵ� ����(public), ���� �޼ҵ�(static), ���� �������� ����(void), �޼ҵ� �̸�(main)
	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in); // Scanner ����� ���� sc ���� ����
        int SIZE = 5; // SIZE ���� 5���� �ڿ���
        
        int[] arr = new int[SIZE]; // �迭 ���� arr����
        int min = 100; // min ���� 100 ����

        // i���� 0����, i�� SIZE���� ������, i ������++
        for(int i = 0; i < SIZE; i++) {
            arr[i] = sc.nextInt(); // �迭 ������ for���� ����

            if (min > arr[i]) { // min�� arr[i]���� ������
                min = arr[i]; // min ������ arr[i] ����
            } // End if
        } // End for

        int cnt = 0; // cnt ���� 0����
        
        while(true) {  // ���ѹݺ� ���� ���� �� �ִ� ���� ū ���� ���������� 100 * 99 * 98 = 970,200
        	 // i���� 0����, i�� SIZE���� ������, i ������++
            for(int i = 0; i < SIZE; i++) {
            	// min�� arr[i]�� �������� 0�� ������ cnt ������++
                if(min % arr[i] == 0) cnt++;
            } // End for

            // ��� �� ���� �ڿ����� ���������� ��� �ݺ��� Ż��
            if(cnt >= 3) break;

            cnt = 0; // cnt ������ 0 ����
            min++; // min ������ ++
        
        } // End while(true)

        System.out.println(min); // min ��� 
    
	} // class main

} // class