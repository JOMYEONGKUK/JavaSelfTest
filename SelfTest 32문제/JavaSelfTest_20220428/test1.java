/*문제1
나이를 입력받아 10세 이하는 1000원 65세이상은 0원 기본 입장료는 0원 프로그램을 만드시오.
 */

import java.util.Scanner; // 스캐너 모듈 호출

//클래스 선언, 클래스 이름 test1
public class test1 {

	// 메소드 선언(public), 정적 메소드(static), 값을 리턴하지 않음(void), 메소드 이름(main)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner 사용을 위한 변수 sc 선언
		System.out.println("나이를 입력해주세요: "); // 나이 입력
		int num = sc.nextInt(); // 나이 저장
		
		if(num <= 10) { // num은 10보다 작거나 같으면
			System.out.println("1000원"); // 1000원 출력 
		} else if(num >= 65) { // num은 65보다 크거나 같으면
			System.out.println("0원"); // 0원 출력
		} else {
			System.out.println("2000원"); // 2000원 출력
		}
	} // End main

} // End class
