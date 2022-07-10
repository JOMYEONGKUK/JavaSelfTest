/*문제 2
입력받은 영문자의 아스키 코드값을 출력
*/

import java.util.Scanner; // 스캐너 모듈 호출

//클래스 선언, 클래스 이름 test2
public class test2 { 

	// 메소드 선언(public), 정적 메소드(static), 값을 리턴하지 않음(void), 메소드 이름(main)
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // Scanner 사용을 위한 변수 sc선언
		System.out.println("영문자를 입력해주세요: "); // 영문자 입력
		String alpa = sc.nextLine(); // 입력받은 영문자 저장
		
		// i선언 0저장 i는 alpa 길이보다 작으면 i 증감값++
		for(int i=0; i < alpa.length(); i++) {
			char askii = alpa.charAt((int)i);
			System.out.println(askii + " = " + (int)askii); // 영문자를 아스키코드로 변환해서 출력
		} // End for문

	} // End main

} // End class
