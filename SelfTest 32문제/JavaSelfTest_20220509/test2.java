/*문제 2
문자열을 입력 받아서 각 문자의 아스키코드값을 더하여 출력하는 프로그램을 작성하세요.
*/

import java.util.Scanner; // 스캐너 모듈 호출

// 클래스 선언, 클래스 이름 test2
public class test2 {

	// 메소드 선언(public), 정적 메소드(static), 값을 리턴하지 않음(void), 메소드 이름(fum), 매개변수 정수형 num
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner 사용을 위한 변수 sc 선언
		System.out.println("Enter: "); // 문자열 입력
		String str = sc.nextLine(); // 입력받은 문자열 저장
		
		int sum = 0; // 정수령 변수 sum 선언 0저장
		
		// for문 시작 정수형 i선언 0저장, i는 str 길이보다 작으면, i 증감값++
		for(int i=0; i<str.length(); i++) {
			sum += (int)str.charAt(i); // sum += 문자열 아스키코드값
		}
		System.out.println(sum); // sum 출력
	} // End main

} // End class
