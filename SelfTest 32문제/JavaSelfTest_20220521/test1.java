/*문제 1
이름, 주민번호 6자리(앞자리), 전화번호를 입력 받아 출력하는 프로그램을 만드시오.
 */

import java.util.Scanner; // 스캐너 모듈 호출

//클래스 선언, 클래스 이름 test1
public class test1 {

	// 메소드 선언(public), 정적 메소드(static), 값을 리턴하지 않음(void), 메소드 이름(main)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner 사용을 위한 sc 변수 선언
		System.out.println("[필수 정보 입력]"); // 필수 정보 입력 출력 
		System.out.print("1. 이름 : "); // 이름 입력
		String strName = sc.nextLine(); // 입력된 이름 저장
		
		System.out.print("2. 주민번호 6자리(앞자리) : "); // 주민번호 앞 6자리 입력
		String strSecurityNumber = sc.nextLine(); // 주민번호 6자리 저장
		
		System.out.print("3. 전화번호 : "); // 전화번호 입력
		String strPhoneNumber = sc.nextLine(); // 전화번호 저장
		
		System.out.println("[입력한 내용]"); // 입력한 내용 출력
		System.out.println("이름 : " + strName); // 이름 출력
		System.out.println("주민번호 6자리 : " + strSecurityNumber); // 주민번호 6자리 출력
		System.out.println("PH : " + strPhoneNumber); // 전화번호 출력

	} // End main

} // End class