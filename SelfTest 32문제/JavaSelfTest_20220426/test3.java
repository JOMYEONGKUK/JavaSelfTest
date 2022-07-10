/*문제 3
하나의 정수를 입력 받고, 정수를 나눌 수를 입력받은 다음
몫과 나머지를 화면에 출력하세요.
*/

import java.util.Scanner; // 스캐너 모듈 호출

//클래스 선언, 클래스 이름 test3
public class test3 {

	// 메소드 선언(public), 정적 메소드(static), 값을 리턴하지 않음(void), 메소드 이름(main)
	public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in); // Scanner 사용을 위한 변수 num 선언
		
		System.out.println("정수를 입력해주세요: "); // 정수 입력
		int num1 = num.nextInt(); // 정수 저장
		System.out.println("나눌 수를 입력해주세요: "); // 나눌수 입력
		int num2 = num.nextInt(); // 나눌수 저장
		
		System.out.printf("몫 : %d\n", num1/num2); // 몫 출력
		System.out.printf("나머지 : %d\n", num1%num2); // 나머지 출력

	} // End main

} // End class
