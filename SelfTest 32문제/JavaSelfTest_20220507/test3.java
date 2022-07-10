/*문제3
초를 입력받아 시간 분 초를 출력하는 프로그램을 작성하시오.
 */

import java.util.Scanner; // 스캐너 모듈 호출

//클래스 선언, 클래스 이름 test3
public class test3 {

	// 메소드 선언(public), 정적 메소드(static), 값을 리턴하지 않음(void), 메소드 이름(main)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner 사용을 위한 변수 sc 선언 
		System.out.println("초를 입력해주세요: "); // 초 입력
		int time = sc.nextInt(); // 초 저장
		
		int hour = time / 3600; // 변수 hour 선언
		int minute = (time % 3600) / 60; // 변수 minute 선언
		int second = (time % 3600) % 60; // 변수 second 선언
		
		if(hour != 0) { // hour은 0과 다르면
			System.out.printf("결과 출력 : %d시간 ", hour);
		}
		if(minute != 0) { // minute는 0과 다르면
			System.out.printf("%d분 ", minute);
		}
		if(second != 0) { // second는 0과 다르면
			System.out.printf("%d초 ", second);
		}

	} // End main

} // End class
