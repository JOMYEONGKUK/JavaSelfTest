package kosta.phone; // ��Ű�� ����, ��Ű�� �̸� kosta.phone

import java.util.Scanner; // ��ĳ�� ��� ȣ��

// Ŭ���� ����, Ŭ���� �̸� Manager
public class Manager {

	Scanner sc = new Scanner(System.in); // Scanner ����� ���� ��ĳ�� ���� sc ����
	PhoneInfo[] arr = new PhoneInfo[10]; // Phoneinfo Ŭ������ ���� 10���� ��ü�� ����
	int count = 0; // ������ ���� count ���� 0����
	
	// �޼ҵ� ����, �޼ҵ� �̸� addPhone
	public void addPhone() {
		System.out.println("�̸�: "); // �̸� �Է�
		String name = sc.next(); // �Է¹��� �̸� ����
		System.out.println("��ȭ��ȣ: "); // ��ȭ��ȣ �Է�
		String phoneNo = sc.nextLine(); // �Է¹��� ��ȭ��ȣ ����
		System.out.println("�������: "); // ������� �Է�
		String birth = sc.nextLine(); // �Է¹��� ������� ����
		
		arr[this.count++] = new PhoneInfo(name, phoneNo, birth); // ��ȭ��ȣ�� �߰��� ������ ������ ��ü�� �����͸� �߰���
		System.out.println("��ȭ��ȣ�� ��ϵǾ����ϴ�."); // ��ȭ��ȣ ��� ���
	}
	
	// �޼ҵ� ����, �޼ҵ� �̸� ListPhone
	public void listPhone() {
		// for�� ���� ������ i���� 0����, i�� count���� ������, i ������++
		for(int i = 0; i< this.count; i++) {
			arr[i].show(); // PhoneInfo Ŭ������ ���� show() �޼��带 ȣ��
		}
	}
	
	// �޼ҵ� ����, �޼ҵ� �̸� searchPhone
	public void searchPhone() {
		System.out.println("�̸� : "); // �̸� �Է�
		String name = sc.nextLine(); // �Է¹��� �̸��� ����
		int idx = -1; // ���ڿ��� ��ġ�� �˱� ���ؼ� ���� �����Դϴ�.
		
		// for�� ���� ������ i���� 0����, i�� count���� ������ i ������++
		for(int i = 0; i < count; i++) {
			PhoneInfo info = arr[i];
			if(name.equals(info.name)) { // i���� �迭�� ��ġ�� �˷���
				info.show();
				idx = i; // ���ڿ��� ���翩�θ� Ȯ���մϴ�.
				break; // ����
			}
		}
		
		if(idx == -1) { // idx�� -1�� ������
			System.out.println("�ش��ϴ� ������ ã�� �� �����ϴ�."); // ������ ã�� �� �����ϴ�. ���
		} // End if
		
	} // End searchPhone
	
} // End class
