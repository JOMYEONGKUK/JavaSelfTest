/*문제3
현재 교통카드에 잔액이 10000원이고 사용 금액만큼 차감하여 잔액이 부족할 때 "잔액이 부족해 교통카드를 사용할 수 없습니다" 메시지를 출력한 후 종료하는 프로그램 작성
 * 교통카드 사용은 키보드 입력을 이용하고 입력된 문자열의 숫자 변환은 Integer.parseInt("금액"); 메서드를 사용한다. 
 */

import java.util.Scanner; // 스캐너 모듈 호출

//클래스 선언, 클래스 이름 test3
public class test3 {

	// 메소드 선언(public), 정적 메소드(static), 값을 리턴하지 않음(void), 메소드 이름(main)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner 사용을 위한 변수 sc 선언
		
		// 교통카드 10000원 저장
		int busCard = 10000, useMoney;
		
		while(true)  { // 무한 반복 시작 
			System.out.println("잔액 : "+busCard); // 잔액 출력
			useMoney = Integer.parseInt(sc.next());
			if(busCard - useMoney < 0) {
				System.out.println("잔액이 부족해 교통 카드를 사용할 수 없습니다."); // 잔액 부족하면 출력
				break; // 반복문 탈출 
			}
			busCard -= useMoney;
		}

	}  // End main

} // End class
