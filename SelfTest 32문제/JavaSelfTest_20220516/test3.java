/*문제 3
switch문으로 12월~ 2월은 겨울 출력, 3월~5월은 봄, 6월~8월은 여름, 9월 ~11월은 가을을 출력하세요.
 */

import java.util.Scanner; // 스캐너 모듈 호출

// 클래스 선언, 클래스 이름 test3
public class test3 {

	// 메소드 선언(public), 정적 메소드(static), 리턴값 없음(void), 메소드 이름(main)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Scanner 사용을 위한 변수 sc 선언
		System.out.println("현재 월수를 입력 :"); // 월 입력
		int 계절 = sc.nextInt(); // 입력받은 월 저장
		
		switch(계절){ // 스위치 시작
		case 12 :  // 12 저장
		case 1 :  // 1 저장
		case 2 : // 2 저장
			System.out.println("겨울입니다."); // 겨울입니다. 출력
			break; // 스위치 멈춤
		case 3 : // 3 저장
		case 4 : // 4 저장
		case 5 : // 5 저장
			System.out.println("봄"); // 봄 출력
			break; // 스위치 멈춤
		case 6 : // 6 저장
		case 7 : // 7 저장
		case 8 : // 8 저장
			System.out.println("여름"); // 여름 출력
		break; // 스위치 멈춤
		case 9 : // 9 저장
		case 10 : // 10 저장
		case 11 : // 11 저장
			System.out.println("가을"); // 가을 출력
			break; // 스위치 멈춤
		} // End switch 
	} // End main
} // End class

