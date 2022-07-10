/*문제2
사용자로부터 정수를 받아서 이 정수가 2와 3으로 나누어 떨어질 수 있는지 출력하라.
 */

import java.util.Scanner; // 스캐너 모듈 호출

//클래스 선언, 클래스 이름 test2
public class test2 {

	// 메소드 선언(public), 정적 메소드(static), 값을 리턴하지 않음(void), 메소드 이름(main)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner 사용을 위한 변수 sc 선언
		System.out.println("정수를 입력해주세요: "); // 정수 입력
		int num = sc.nextInt();  // 정수 저장
		
		// num은 2와 3으로 나누어지면
		if(num % 2 == 0 && num % 3 == 0) {
			System.out.println("2와 3으로 나누어 떨어짐"); // 참이면 출력
		} else {
			System.out.println("2와 3으로 나누어 떨어지지 않습니다."); // 거짓이면 출력
		}

	} // End main

} // End class
