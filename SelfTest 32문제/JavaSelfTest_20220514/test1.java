/*���� 1
 do-while�� Scanner�� ����ؼ� ���⸦ ����ÿ�.
 */

import java.util.Scanner; // ��ĳ�� ��� ȣ��

// Ŭ���� ����, Ŭ���� �̸� test1
public class test1 {

	// �޼ҵ� ����(public), ���� �޼ҵ�(static), ���ϰ� ����(void), �޼ҵ� �̸�(main)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner ����� ���� ���� sc ����
		
		do{ // do�� ����
		    System.out.println("ù��° ���ڸ� �Է��ϼ���"); // ù��° ���� �Է�
		    int firNum = sc.nextInt(); // �Է��� ù��° ���� ����
		    System.out.println("��Ģ������ �Է��ϼ���"); // ��Ģ���� �Է�
			String buho = sc.next(); // �Է��� ��Ģ���� ����
		    System.out.println("�ι�° ���ڸ� �Է��ϼ���"); // �ι�° ���� �Է�
		    int secNum = sc.nextInt(); // �Է��� �ι�° ���� ����
		    
		    if("+".equals(buho)){ // �Էµ� ���ڰ� +�� �´ٸ�
		    	System.out.println(firNum+secNum); // ���� ���
		    }
		    else if("-".equals(buho)){ // �Էµ� ���ڰ� -�� �´ٸ�
		    	System.out.println(firNum-secNum); // ���� ���
		    }
		    else if("*".equals(buho)){ // �Էµ� ���ڰ� *�� �´ٸ�
		    	System.out.println(firNum*secNum); // ���� ���
		    }
		    else if("/".equals(buho)){ // �Էµ� ���ڰ� /�� �´ٸ�
		    	System.out.println((int)((float)firNum/secNum*100+0.5)/100f);
		    }else{ // ���� ��Ģ������ ������ �ȵɶ�
		    	System.out.println("��Ģ���� �ƴ�. ����."); // ��Ģ ������ �ƴҽ� ���
		        break; // �ݺ��� Ż��
		    }
		}while(true); // whie true ���� �ݺ���

	} // End main

} // End class
