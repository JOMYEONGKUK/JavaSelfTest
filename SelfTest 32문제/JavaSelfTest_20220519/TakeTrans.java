package cooperation; // 패키지 선언, 패키지 이름 cooperation

//클래스 선언, 클래스 이름 TakeTrans
public class TakeTrans {

	public static void main(String[] args) {
		
	// 학생 세 명 생성
        Student studentJames = new Student("James", 5000);
        Student studentTomas = new Student("Tomas",10000);
        Student studentEdward = new Student("Edward",20000);
		
	Bus bus100 = new Bus(100);    // 노선 번호가 100인 버스 생성
        studentJames.takeBus(bus100); // James가 100번 버스를 탐
        studentJames.showInfo();      // James의 정보 출력
        bus100.showInfo();            // bus의 정보 출력
        
        Subway subwayGreen = new Subway("2호선");  // 노선 번호가 2호선인 지하철 생성
        studentTomas.takeSubway(subwayGreen);     // Tomas가 2호선을 탐
        studentTomas.showInfo();                  // Tomas의 정보 출력
        subwayGreen.showInfo();                   // subway의 정보 출력
        
        Taxi taxi4534 = new Taxi(4534);           // 택시 번호가 4534인 택시 생성
        studentEdward.takeTaxi(taxi4534);         // Edward가 4534번 택시를 탐
        studentEdward.showInfo();                 // Edward의 정보 출력
        taxi4534.showInfo();                      // taxi의 정보 출력
    
	} // End main
} // End class
