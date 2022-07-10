package cooperation; // ��Ű�� ����, ��Ű�� �̸� cooperation

// Ŭ���� ����, Ŭ���� �̸� Subway
public class Subway {

	String lineNumber;			// ����ö �뼱
	int passengerCount;			// �°� ��
	int money;					// ����ö ����
	
	// ����ö �뼱�� �޴� �޼ҵ� �� �Լ� ���� �Ű����� ����
	public Subway(String lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	// �°��� ����ö�� Ż �� �޼ҵ� �� �Լ� ���� �Ű����� ����
	public void take(int money) {
		this.money = money;		// ����ö ��� (�Ű����� money)��ŭ ����ö ������ ����
		passengerCount++;		// �°� �� ����
	}
	
	// ����ö�� ���� ������ ������ִ� �޼ҵ� �� �Լ� ����
	public void showInfo() {
		System.out.println(lineNumber+"�� �°��� "+passengerCount+"���̰�, ������ "+money+"�Դϴ�.");
	}
	
} // End class
