/*���� 3
if else ���� �̿� �ؼ� ��ǻ�Ϳ� ���� ���� �� �� �ϴ� ���α׷��� ����ÿ�.
 */

import java.util.Scanner; // ��ĳ�� ��� ȣ��

// Ŭ���� ����, Ŭ���� �̸� test3
public class test3 {

	// �޼ҵ� ����(public), ���� �޼ҵ�(static), ���� �������� ����(void), �޼ҵ� �̸�(main)
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in); // Scanner ����� ���� ���� sc ����
	    String str[] = {"����", "����", "��"}; // ���ڿ� �迭 ���� str ���� ���� ���� �� ����
	    System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�."); // ���ӽ��� ���� ���
	        
	    while(true){ // while true ���ѹݺ� ���� 
	    	int n = (int)(Math.random()*3); // ������ ���� n���� ����
	        System.out.print("���� ���� ��: "); // ���������� �Է�
	        String pstr = in.next(); // �Է¹��� ���������� ����
	        
	        if(pstr.equals("�׸�")){ // pstr�� ���̸� �׸�
	        	System.out.print("������ �����մϴ�."); // ���� ���� ���
	            break; // �ݺ��� Ż��
	        }
	        if(str[n].equals(pstr)){ // str n�� pstr�� ������
	        	System.out.println("��ǻ�� = " + str[n] + ", ����� = " + pstr + ", �����ϴ�."); // ������� ���� ���
	        }
	        else {
	        	if(str[n].equals("����")){ // str n �������� ���� ��
	        		if(pstr.equals("��")){ // ptst ���� �� �̸�
	        			System.out.println("��ǻ�� = " + str[n] + ", ����� = " + pstr + ", �̰���ϴ�."); // �¸� ���� ���
	                    }
	                    else{
	                        System.out.println("��ǻ�� = " + str[n] + ", ����� = " + pstr + ", �����ϴ�."); // �й� ���� ���
	                    }
	                }
	                else if(str[n].equals("����")){ // str n �������� ���� ��
	                    if(pstr.equals("����")){ // ptst ���� ���� �̸�
	                        System.out.println("��ǻ�� = " + str[n] + ", ����� = " + pstr + ", �̰���ϴ�.");  // �¸� ���� ���
	                    } 
	                    else{
	                        System.out.println("��ǻ�� = " + str[n] + ", ����� = " + pstr + ", �����ϴ�."); // �й� ���� ���
	                    }
	                }
	                else if(str[n].equals("��")){ // str n �������� �� �̸�
	                    if(pstr.equals("����")){ // ptst ���� ���� �̸�
	                        System.out.println("��ǻ�� = " + str[n] + ", ����� = " + pstr + ", �̰���ϴ�."); // �¸� ���� ���
	                    }
	                    else{
	                        System.out.println("��ǻ�� = " + str[n] + ", ����� = " + pstr + ", �����ϴ�."); // �й� ���� ���
	                    }
	                }
	            }

	       }
	        
	  } // End main
} // End class
