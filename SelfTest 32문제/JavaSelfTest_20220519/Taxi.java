package cooperation; // 패키지 선언, 패키지 이름 cooperation

//클래스 선언, 클래스 이름 Taxi
public class Taxi {

	int taxiNumber;			// 택시 번호
	int passengerCount;		// 택시 승객 수
	int money;				// 택시 수입
	
	// 매개변수로 택시 변수를 받는 생성자
	public Taxi(int taxiNumber) {
		this.taxiNumber = taxiNumber;
	}
	
	// 택시에 승객이 탔을 때 메소드 및 함수 정의 매개변수 선언
	public void take(int money) {
		this.money += money;		// 택시 요금(매개변수 money)만큼 택시 수입 증가
		passengerCount++;			// 승객 수 증가
	}
	
	// 택시 현재 정보 출력
	public void showInfo() {
		System.out.println(taxiNumber+"의 승객은"+passengerCount+"명이고, 수입은 "+money+"원이다.");
	}
	
} // End class
