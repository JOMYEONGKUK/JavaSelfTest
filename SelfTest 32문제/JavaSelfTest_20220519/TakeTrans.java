package cooperation; // ��Ű�� ����, ��Ű�� �̸� cooperation

//Ŭ���� ����, Ŭ���� �̸� TakeTrans
public class TakeTrans {

	public static void main(String[] args) {
		
		// �л� �� �� ����
        Student studentJames = new Student("James", 5000);
        Student studentTomas = new Student("Tomas",10000);
        Student studentEdward = new Student("Edward",20000);
		
		Bus bus100 = new Bus(100);    // �뼱 ��ȣ�� 100�� ���� ����
        studentJames.takeBus(bus100); // James�� 100�� ������ Ž
        studentJames.showInfo();      // James�� ���� ���
        bus100.showInfo();            // bus�� ���� ���
        
        Subway subwayGreen = new Subway("2ȣ��");  // �뼱 ��ȣ�� 2ȣ���� ����ö ����
        studentTomas.takeSubway(subwayGreen);     // Tomas�� 2ȣ���� Ž
        studentTomas.showInfo();                  // Tomas�� ���� ���
        subwayGreen.showInfo();                   // subway�� ���� ���
        
        Taxi taxi4534 = new Taxi(4534);           // �ý� ��ȣ�� 4534�� �ý� ����
        studentEdward.takeTaxi(taxi4534);         // Edward�� 4534�� �ýø� Ž
        studentEdward.showInfo();                 // Edward�� ���� ���
        taxi4534.showInfo();                      // taxi�� ���� ���
    
	} // End main
} // End class
