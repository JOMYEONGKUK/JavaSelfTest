/*문제 2
정수 한 개를 입력받아 그 수가 3의 배수인지 판단해보자.
*/

import java.util.Scanner; // 스캐너 모듈 호출

// 클래스 선언, 클래스 이름 test2
public class test2 {

	// 메소드 선언(public), 정적 메소드(static), 값을 리턴하지 않음(void), 메소드 이름(main)
	public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in); // Scanner 사용을 위한 변수 num 선언
		System.out.println("정수 입력: "); // 정수 입력
		int nums = num.nextInt(); // 입력된 정수 저장
		
		String msg = "3의 배수가 아닙니다."; // 문자열 선언 
		if(nums % 3 == 0) { // nums는 3으로 나눠지면
			msg = "3의 배수 입니다."; // 참이면 출력
		}
		
		System.out.println("입력하신 정수는 " + msg);
		
	} // End main

} // End class
