/*문제 2
1. Scanner를 이용하여 금액을 입력 받으세요.
2. 음료수를 선택하면 금액에서 차감하세요. (반복문 switch)
3. 금액이 부족하다면 "금액이 부족합니다"를 출력하세요.
 */

import java.util.Scanner; // 스캐너 모듈 호출

// 클래스 선언, 클래스 이름 test2
public class test2 {

	// 메소드 선언(public), 정적 메소드(static), 값을 리턴하지 않음(void), 메소드 이름(main)
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in); // Scanner 사용을 위한 변수 scan 선언
		System.out.println("금액을 투입해 주세요: "); // 금액 투입
		int money = scan.nextInt(); // 투입한 금액 저장
		
		while(true) { // 무한반복 시작
			System.out.println("남은금액 : " + money + "원"); // 남은금액 출력
			System.out.println("[1]데미소다 : 400원, [2]밀키스 : 500원, [3]코카콜라 : 600원, [4] 잔돈받기"); // 메뉴 선택하는 문구 출력
			System.out.print("음료수 선택: "); // 음료수 선택
			
			int select = scan.nextInt(); // 선택된 음료수 저장
			
			
			switch(select) { // switch문 시작
				case 1 : if(money >= 400) { // case 1 , money가 400 이상이면
					System.out.println("데미소다를 받았습니다."); // 데미소다
					money -= 400; // money = money - 400
				} else {
					System.out.println("금액이 부족합니다. 돈을 넣어 주세요!"); // 금액이 부족하면 출력
				}
				break; // 반복문 및 switch문 탈출
				
				case 2 : if(money >= 500) { // case 2 , money가 500 이상이면
					System.out.println("밀키스를 받았습니다."); // 밀키스
					money -= 500; // money = money - 500
				} else {
					System.out.println("금액이 부족합니다. 돈을 넣어 주세요!"); // 금액이 부족하면 출력
				}
				break; // 반복문 및 switch문 탈출
				
				case 3 : if(money >= 600) { // case 3 , money가 600 이상이면
					System.out.println("코카콜라는 받았습니다."); // 코카콜라
					money -= 600; // money = money - 600
				} else {
					System.out.println("금액이 부족합니다. 돈을 넣어 주세요!"); // 금액이 부족하면 출력
				}
				break; // 반복문 및 switch문 탈출
				
				case 4 : // case 4
					System.out.println("남은 근액 "+money+" 를 반환합니다."); // 반환할 남은금액 출력
					break; // 반복문 및 switch문 탈출
				
				default : // 예외
					System.out.println("잘못 입력 했습니다."); // 잘못 입력했으면 출력
					System.out.println("메뉴를 정확히 입력하세요"); // 잘못 입력했으면 출력
					break; // 반복문 및 switch문 탈출
					
			} // End switch문
			System.out.println();
		} // End while(true)
		

	} // End main

} // End class
