/*���� 1
BMI ��� ���� ����ÿ� (�� �����Կ� Ű�� �Է� ��������) 
30�̻� ��
25~30 ��ü��
20~25 ����
20 �̸� ��ü��
BMI ��� ���� 
 */

import java.util.Scanner; // ��ĳ�� ��� ȣ��

// Ŭ���� ����, Ŭ���� �̸� test1
public class test1 {

	// �޼ҵ� ����(public), ���� �޼ҵ�(static), ���ϰ� ����(void), �޼ҵ� �̸�(main)
	public static void main(String[] args) {
		 Scanner bmiIn = new Scanner(System.in); // Scanner ����� ���� ���� bmiIn  ����

         System.out.println("����� �����Ը� �Է��ϼ��� : "); // ������ �Է�

         float bmi1= bmiIn.nextFloat(); // �Է¹��� ������ ����

         System.out.println("����� Ű�� ���ͷ� �Է��ϼ��� "); // Ű �Է�

         float bmi2= bmiIn.nextFloat(); // �Է¹��� Ű ����

         float bmi = bmi1 / (bmi2*bmi2); // bmi�� bmil / bumi2*bui2

         System.out.println(bmi); // bmi ���
         

         if(30 <= bmi) { // 30�� bmi���� �۰ų� ������
        	 System.out.println("���Դϴ�."); // �� ���
         } else if (25 <= bmi && bmi < 30) { // 25�� bmi���� �۰ų� ����, bmi�� 30���� ������
        	 System.out.println("��ü���Դϴ�."); // ��ü�� ���

         } else if(20 <= bmi && bmi < 25 ){ // 20�� bmi���� �۰ų� ����, bmi�� 25���� ������
        	 System.out.println("�����Դϴ�."); // ���� ���

         } else { // ����
        	 System.out.println("��ü��. "); // ��ü�� ���

         }
	} // End main
} // End class
