/*���� 2
 ���� ���� 10���� ����ϰ� ���� 10���� ��ձ��� ����ϼ���.
 */

// Ŭ���� ����, Ŭ���� �̸� test2
public class test2 { 

	// �޼ҵ� ����(public), ���� �޼ҵ�(static), ���� �������� ����(void), �޼ҵ� �̸�(main)
	public static void main(String[] args) {
		
		int num [] = new int [10]; // ������ �迭 ���� num ���� 10��
	    double sum = 0; // �Ǽ��� ���� sum ���� 0����
	        
	    System.out.print("������ ���� : "); // ���� ���� 10������ 10�� ���
	        
	    // for�� ���� ������ i���� 0����, i�� num ���̺��� ������, num ������++
	    for(int i = 0; i < num.length; i++){
	    	int x = (int)(Math.random()*10 + 1); // ������ x ���� ���� ���� 10��
	        sum += x; // sum = sum + x
	        System.out.print(x+ " "); // ���� ���� 10�� ��� 
	    }
	        System.out.print("\n�����? " + sum / 10); // ��հ� ���
	 
	} // End main
} // End class
