package cooperation; // 패키지 선언, 패키지 이름 cooperation

// 클래스 선언, 클래스 이름 Subway
public class Subway {

	String lineNumber;			// 지하철 노선
	int passengerCount;			// 승객 수
	int money;					// 지하철 수입
	
	// 지하철 노선을 받는 메소드 및 함수 정의 매개변수 선언
	public Subway(String lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	// 승객이 지하철에 탈 때 메소드 및 함수 정의 매개변수 선언
	public void take(int money) {
		this.money = money;		// 지하철 요금 (매개변수 money)만큼 지하철 수입이 증가
		passengerCount++;		// 승객 수 증가
	}
	
	// 지하철에 현재 정보를 출력해주는 메소드 및 함수 정의
	public void showInfo() {
		System.out.println(lineNumber+"의 승객은 "+passengerCount+"명이고, 수입은 "+money+"입니다.");
	}
	
} // End class
