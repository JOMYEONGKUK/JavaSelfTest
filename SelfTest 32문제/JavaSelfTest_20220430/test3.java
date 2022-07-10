/*문제3
369 게임을 작성해보자. 1~99까지 정수를 입력받고
369 중 하나가 있는 경우는 박수짝 두개 있는 경우는 박수짝짝을 출력하라.
 */

import java.util.Scanner; // 스캐너 모듈 호출

//클래스 선언, 클래스 이름 test3
public class test3 {

	// 메소드 선언(public), 정적 메소드(static), 값을 리턴하지 않음(void), 메소드 이름(main)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner 사용을 위한 변수 sc 선언
		System.out.println("1~99사이의 정수를 입력해주세요: "); // 정수 입력 
		
		int n = sc.nextInt(); // 정수 저장
		int a = n / 10; // a 선언 n / 10 저장
		int b = n % 10; // b 선언 n % 10 저장
		
		// a는 0보다 크고 b는 0보다 크고 a, b는 3으로 나눠지면
		if(a > 0 && b > 0 && a % 3 == 0 && b % 3 == 0) {
			System.out.println("박수짝짝"); // 박수짝짝 출력
		} else if(a > 0 && a % 3  == 0) { // a는 0보다 크고 a는 3으로 나눠지면
			System.out.println("박수짝"); // 박수짝 출력
		} else if(b > 0 && b % 3 == 0) { // b는 0보다 크고 b는 3으로 나눠지면/
			System.out.println("박수짝"); // 박수짝 출력
		}

	} // End main

} // End class
