package cooperation; // ��Ű�� ����, ��Ű�� �̸� cooperation

//Ŭ���� ����, Ŭ���� �̸� Taxi
public class Taxi {

	int taxiNumber;			// �ý� ��ȣ
	int passengerCount;		// �ý� �°� ��
	int money;				// �ý� ����
	
	// �Ű������� �ý� ������ �޴� ������
	public Taxi(int taxiNumber) {
		this.taxiNumber = taxiNumber;
	}
	
	// �ýÿ� �°��� ���� �� �޼ҵ� �� �Լ� ���� �Ű����� ����
	public void take(int money) {
		this.money += money;		// �ý� ���(�Ű����� money)��ŭ �ý� ���� ����
		passengerCount++;			// �°� �� ����
	}
	
	// �ý� ���� ���� ���
	public void showInfo() {
		System.out.println(taxiNumber+"�� �°���"+passengerCount+"���̰�, ������ "+money+"���̴�.");
	}
	
} // End class
