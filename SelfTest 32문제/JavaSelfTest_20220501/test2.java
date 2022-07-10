/*문제2
휴대폰번호 앞자리에 따라 통신사를 출력하는 프로그램을 작성하시오.
 */

import java.util.Scanner;// 스캐너 모듈 호출

//클래스 선언, 클래스 이름 test2
public class test2 {

	// 메소드 선언(public), 정적 메소드(static), 값을 리턴하지 않음(void), 메소드 이름(main)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner 사용을 위한 변수 sc 선언
		
		System.out.println("휴대폰번호를 입력해주세요: "); // 휴대폰 번호 입력
		String num = sc.next(); // 휴대폰 번호 저장
		
		char phonnumber = num.charAt(2); // 배열 변수 선언
		
		if(phonnumber == '1') { // 1과 같으면
			System.out.println("SKT 사용자입니다.");  // SKT
		} if(phonnumber == '6') { // 6과 같으면
			System.out.println("KT 사용자입니다."); // KT
		} if(phonnumber == '9') { // 9와 같으면
			System.out.println("LGU 사용자입니다."); // LGU
		} else {
			System.out.println("알수없음"); // 알수없음
		}

	} // End main

} // End class
