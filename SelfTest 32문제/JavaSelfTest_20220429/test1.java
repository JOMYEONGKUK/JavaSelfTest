/*문제1
아이디와 패스워드 입력 받아
모두 일치하면 로그인 하셨습니다.
모두 불일치하면 아이디와 비밀번호 확인 출력
 */

import java.util.Scanner; // 스캐너 모듈 호출

//클래스 선언, 클래스 이름 test1
public class test1 {

	// 메소드 선언(public), 정적 메소드(static), 값을 리턴하지 않음(void), 메소드 이름(main)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner 사용을 위한 변수 sc 선언
		System.out.println("아이디를 입력해주세요: "); // 아이디 입력
		String id = sc.next(); // 아이디 저장
		
		Scanner sc1 = new Scanner(System.in); // // Scanner 사용을 위한 변수 sc1 선언
		System.out.println("비밀번호를 입력해주세요: "); // 비밀번호 입력
		int password = sc1.nextInt(); // 비밀번호 저장
		
		String id2 = "java"; // 아이디
		int password2 = 1234; // 비밀번호
		
		// 입력값과 아이디와 비번이 같으면
		if(id == id2 || password == password2) {
			System.out.println("로그인 하셨습니다."); // 로그인
		} else {
			System.out.println("아이디와 비밀번호를 확인해주세요."); // 아이디 비밀번호 확인
		}
	} // End main

} // Enc class
