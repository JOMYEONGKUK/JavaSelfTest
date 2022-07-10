/*문제5
사용자에게 현재 오 ㄴ도를 질문하고 온도가 25도 이상이면 반바지 추천 25도
미만이면 긴바지를 추천하는 프로그램을 작성해보자.
 */

import java.util.Scanner; // 스캐너 모듈 호출

//클래스 선언, 클래스 이름 test5
public class test5 {

	// 메소드 선언(public), 정적 메소드(static), 값을 리턴하지 않음(void), 메소드 이름(main)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner 사용을 위한 변수 sc 선언
		System.out.println("현재 온도를 입력해주세요: "); // 온도 입력
		int temperature = sc.nextInt(); // 온도 저장
		
		// 25도 이상이면
		if(temperature >= 25) {
			System.out.println("반바지를 입으세요."); // 반바지
		} else {
			System.out.println("긴바지를 입으세요."); // 긴바지
		} 

	} // End main

} // End class
