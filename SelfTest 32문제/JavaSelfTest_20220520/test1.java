/*문제 1
영문 대문자를 입력받아 'A'이면 "훌륭합니다.", 'B'이면 "좋습니다.", 'C'이면 "보통입니다.", 'D'이면 "노력하세요.", 
그이외문자는 "잘못입력하셨습니다."라고 출력하는 프로그램을 작성하시오.
 */

import java.util.Scanner; // 스캐너 모듈 호출

// 클래스 선언, 클래스 이름 test1
public class test1 {

	// 메소드 선언(public), 정적 메소드(static), 값을 리턴하지 않음(void), 메소드 이름(main)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner 사용을 위한 sc 변수 선언
		
		System.out.println("영어 대문자를 입력해주세요: "); // 영어 대문자 입력
		String d = sc.next(); // 입력받은 영어 대문자 저장
		String c = ""; // 변수 c선언 공백 저장
		
		
		char b = d.charAt(0); // 문자형 b 선언
		int a = d.length(); // 장스향 a선언 d 길이만큼 저장
		
		
		if(a==1) { // a는 1과 같으면
			switch(b) { // switch문 시작
				case 'A' : // case A 저장
					c = "훌륭합니다."; // c값에 훌륭합니다. 저장
					break; // switch문 멈춤
				case 'B' : // case B 저장
					c = "좋습니다."; // c값에 좋습니다. 저장
					break; // switch문 멈춤
				case 'C' : // case C 저장
					c = "보통입니다."; // c값에 보통입니다. 저장
					break; // switch문 멈춤
				case 'D' : // case D 저장
					c = "노력하세요."; // c값에 노력하세요. 저장
					break; // switch문 멈춤
				default :
					c = "잘못입력하셨습니다."; // c값에 훌륭합니다. 저장
			} // End switch
		} // End if
		else { // 예외 한글자를 넘겼을때
			c = "한글자만 입력하세요."; // c값에 한글자만 입력하세요 출력
		} // End else
		System.out.println(c); // c 값 출력
	} // End main

} // End class
