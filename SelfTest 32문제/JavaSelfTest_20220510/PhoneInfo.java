/*���� 1
 ��ȭ��ȣ�θ� �����ϴ� ���α׷��� ����ÿ�.
 - ��ȭ��ȣ �������α׷� �������� (1���� ��ȭ��ȣ��)
 - ���� : �̸�, ��ȭ��ȣ, �������
 - ��� : 1���� ��ȭ������ ���
 */

package kosta.phone; // ��Ű�� ����, ��Ű�� �̸� kosta.phone

// Ŭ���� ����, Ŭ���� �̸� PhoneInfo
public class PhoneInfo {

	// �ʵ�
	String name; // �̸�
	String phoneNo; // ��ȭ��ȣ
	String birth; // �������
	
	// �⺻ ������ ����
	public PhoneInfo() {}
	
	// �޼ҵ� ����, �޼ҵ� �̸� PhoneInfo �Ű�����(���ڿ� name, phoneNo, birth)
	public PhoneInfo(String name, String phoneNo, String birth) {
		this.name = name; // this �����ڿ� �޼ҵ��� �Ű� ���� �̸��� �ʵ�� ������ ��� ���
		this.phoneNo = phoneNo; // this �����ڿ� �޼ҵ��� �Ű� ���� �̸��� �ʵ�� ������ ��� ���
		this.birth = birth; // this �����ڿ� �޼ҵ��� �Ű� ���� �̸��� �ʵ�� ������ ��� ���
	} // End PhoneInfo
	
	// 4. ��ȭ������ ����� �޼��带 �����Ѵ�.
	public void show() { // ����� ���ϰ��� �ʿ����� �ʱ� ������, void�� ����Ѵ�. -> void�� ����� �Է¸Ű�����(�Ķ����)�� �������� ����.
		System.out.println("�̸� : "+name); // �̸� ���
		System.out.println("��ȭ��ȣ : "+phoneNo); // ��ȭ��ȣ ���
		System.out.println("������� : "+birth); // ������� ���
		
	} // End show
	
} // End class
