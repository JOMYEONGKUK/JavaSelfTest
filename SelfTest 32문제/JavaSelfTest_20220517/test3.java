/*문제 3
1번은 강아지, 2번은 고양이, 3번은 병아리로 정하고 번호를 입력하면 번호에
해당하는 동물을 영어로 출력하는 프로그램을 switch문을 사용해서 만드시오.
 */

import java.util.Scanner; // 스캐너 모듈 호출

// 클래스 선언, 클래스 이름 test3
public class test3 {

	// 메소드 선언(public), 정적 메소드(static), 값을 리턴하지 않음(void), 메소드 이름(main)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner 사용을 위한 변수 sc 선언
		System.out.println("번호를 입력하세요: "); // 번호 입력
		int a = sc.nextInt(); // 입력된 번호 저장
		
		String b = ""; // 변수 b선언 "" 저장
		
		switch(a) { // switch문 시작
			case 1 : // case 1
				b = "dog"; // 변수 b에 dog 저장
				break; // switch문 탈출
			case 2 : // case 2
				b = "cat"; // 변수 b에 cat 저장
				break; // switch문 탈출
			case 3 : // case 3
				b = "chick"; // 변수 b에 chick 저장
			default : // 예외
				b = "번호가 잘못되었습니다."; // 번호가 잘못되었습니다. 저장
		
		} // End switch
		
		System.out.println(b); // b 출력

	} // End main

} // End class
