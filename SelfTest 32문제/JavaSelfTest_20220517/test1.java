/*문제 1
월, 일을 따로 입력받아 별자리를 출력하는 프로그램을 작성하여라.
 */

import java.util.Scanner; // 스캐너 모듈 호출

// 클래스 선언, 클래스 이름 test1
public class test1 {

	// 메소드 선언(public), 정적 메소드(static), 값을 리턴하지 않음(void), 메소드 이름(main)
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);  // Scanner 사용을 위한 변수 scan 선언
		
		int month = 0;  // 변수 month 선언 0저장
		int day = 0;  // 변수 day 선언 0저장
		
		System.out.print("월을 입력해 주세요: "); // 월 입력
		month = scan.nextInt(); // 입력받은 월 저장
		
		System.out.print("일을 입력해 주세요: "); // 일 저장
		day = scan.nextInt(); // 입력받은 일 저장
		
		switch(month) { //switch문 시작
			case 1: // case 1
				if (day >=20) { // day는 20보다 크거나 같으면
					System.out.println("물병자리"); // 물병자리 출력
				} else { 
					System.out.println("염소자리"); // 염소자리 출력
					} break; // switch 탈출
			case 2: // case 2
				if (day >=19) { // day는 19보다 크거나 같으면
					System.out.println("물고기자리"); // 물고기자리 출력
				} else { System.out.println("물병자리");  // 물병자리 출력
				
				} 
				break; // switch 탈출
			case 3: // case 3
				if (day >=21) { // day는 21보다 크거나 같으면
					System.out.println("양자리"); // 양자리 출력
				} else { System.out.println("물고기자리"); // 물고기자리 출력
				
				} break; // switch 탈출
			case 4: // case 4
				if (day >=20) { // day는 20보다 크거나 같으면
					System.out.println("황소자리"); // 황소자리 출력
				} else { System.out.println("양자리"); // 양자리 출력
				
				} break; // switch 탈출
			case 5: // case 5
				if (day >=21) { // day는 21보다 크거나 같으면
					System.out.println("쌍둥이자리"); // 쌍둥이자리 출력
				} else { System.out.println("황소자리"); // 황소자리 출력
				
				} break; // switch 탈출
			case 6: // case 6
				if (day >=22) { // day는 22보다 크거나 같으면
					System.out.println("게자리"); // 게자리 출력
				} else { 
					System.out.println("쌍둥이자리"); // 쌍둥이자리 출력
				} 
				
				break; // switch 탈출
			case 7: // case 7
				if (day >=23) { // day는 23보다 크거나 같으면
					System.out.println("사자자리");  // 사자자리 출력
				} else { System.out.println("게자리"); // 게자리 출력
				
				} break; // switch 탈출
			case 8: // case 8
				if (day >=23) { // day는 23보다 크거나 같으면
					System.out.println("처녀자리"); // 처녀자리 출력
				} else { System.out.println("사자자리"); // 사자자리 출력
				
				} 
				break; // switch 탈출
			case 9: // case 9
				if (day >=24) { // day는 24보다 크거나 같으면
					System.out.println("천칭자리"); // 천장자리 출력
				} else { 
					System.out.println("처녀자리"); // 처녀자리 출력
				} 
				break; // switch 탈출
			case 10: // case 10
				if (day >=23) { // day는 23보다 크거나 같으면
					System.out.println("전갈자리"); // 전갈자리 출력
				} else { 
					System.out.println("천칭자리"); // 천칭자리 출력
				} 
				break; // switch 탈출
			case 11: // case 11
				if (day >=23) { // day는 23보다 크거나 같으면
					System.out.println("사수자리"); // 사수자리 출력
				} else { 
					System.out.println("전갈자리"); // 전갈자리 출력
				} 
				break; // switch 탈출
			case 12: // case 12
				if (day >=25) { // day는 25보다 크거나 같으면
					System.out.println("염소자리");  // 염소자리 출력
				} else { 
					System.out.println("사수자리"); // 사수자리 출력
				} 
				break; // switch 탈출
		} // End switch문
	} // End main
} // End class


