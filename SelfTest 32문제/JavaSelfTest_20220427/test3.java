/*문제3
원화를 입력받아 달러로 바꾸어 출력하시오.
 */

import java.util.Scanner; // 스캐너 모듈 호출

//클래스 선언, 클래스 이름 test3
public class test3 {

	// 메소드 선언(public), 정적 메소드(static), 값을 리턴하지 않음(void), 메소드 이름(main)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner 사용을 위한 변수 sc 선언
		System.out.print("원화를 입력해주세요. 단위 원): "); // 원화 입력
		
		int won = sc.nextInt(); // 원화 저장
		System.out.println(won + "원은 $" + won / 1100.0 + "입니다."); // 원화 출력

	} // End main

} // End class
