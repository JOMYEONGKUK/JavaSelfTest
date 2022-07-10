package cooperation; // ��Ű�� ����, ��Ű�� �̸� cooperation

// Ŭ���� ����, Ŭ���� �̸� Bus
public class Bus {

	int busNumber;				// ���� ��ȣ
	int passengerCount;			// �°� ��
	int money;					// ���� ����
	
	// �Ű������� ���� ��ȣ�� �޴� ������
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	// �°��� ���� Ż �� �޼ҵ� �� �Լ� ����
	public void take(int money) {
		this.money += money;		// ���� ��� (�Ű����� money)��ŭ ���� ������ ����
		passengerCount++;			// �°� �� ������++
	}
	
	// ������ ���� ���� ����ϴ� �޼ҵ� �� �Լ� ����
	public void showInfo() {
		System.out.println("���� "+busNumber+"���� �°��� "+passengerCount+"���̰�, ������"+ money+"�Դϴ�.");
	}
	
} // End class
