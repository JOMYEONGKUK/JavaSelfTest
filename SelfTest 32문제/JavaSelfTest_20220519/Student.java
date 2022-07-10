/*���� 1
�л��� �б��� ���� ���� �����ϴ� ���� ������ ��ü ���� ���α׷����� ���� �� �ִ�.
�� ���������� �л��� ����, ����ö, �ýø� Ÿ�� ���� ���� ��ü ���� ���α׷������� �ۼ��Ͻÿ�.
 */

package cooperation; // ��Ű�� ����, ��Ű�� �̸� cooperation

// Ŭ���� ����, Ŭ���� �̸� Student
public class Student {
	
	public String studentName; // �л� �̸�
	public int money; 		   // �л��� ������ �ִ� ��
	
	// �Ű������� �л��̸�, ���� ���� �޴� ������
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
		
	// ������ Ÿ�� �޼ҵ� �Լ� ����
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000; // ���� ��� 1000���� ����
	}
	
	// ����ö�� Ÿ�� �޼ҵ� �Լ� ����
	public void takeSubway(Subway subway) {
		subway.take(1500);
		this.money -= 1500; // ����ö ��� 1500���� ����
	}
	
	// �ýø� Ÿ�� �޼ҵ� �Լ� ����
	public void takeTaxi(Taxi taxi) {
		taxi.take(10000);
		this.money -= 10000; // �ý� ��� 10000�� ����
	}
	
	// �л��� ���� ������ ����ϴ� �޼ҵ� �� �Լ� ����
	public void showInfo() {
		System.out.println(studentName + "���� ���� ����"+money+"�Դϴ�.");
		
	}
	
} // End class
