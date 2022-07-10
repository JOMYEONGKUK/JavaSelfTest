/*문제2
2자리의 정수(10~99)를 입력 받고 10의 자리와 1의자리가
같은지 판별하는 프로그램을 만드시오.
 */

import java.util.Scanner; // 스캐너 모듈 호출

//클래스 선언, 클래스 이름 test2
public class test2 {

	// 메소드 선언(public), 정적 메소드(static), 값을 리턴하지 않음(void), 메소드 이름(main)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner 사용을 위한 변수 sc 선언
		System.out.println("2자리수 정수를 입력해주세요(10~99): ");  // 2자리수 정수 입력
		int integer = sc.nextInt(); // 입력받은 정수 저장
		
		// integer이 10으로 나눴을때 integer과 같고 10으로 나눠지면
		if(integer / 10 == integer % 10) {
			System.out.println("Yes 10의 자리와 1의 자리가 같습니다."); // 참이면 출력
		} else {
			System.out.println("No! 10의 자리와 1의 자리가 다릅니다."); // 거짓이면 출력
		}

	} // End main

} // End class
