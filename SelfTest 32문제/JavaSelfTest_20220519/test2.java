/*문제 2
키보드 입력으로 탐색할 수 있는 코드잇 소개 프로그램을 만듭니다.
아래와 같은 메뉴가 출력됩니다.
"I","i","C","c","E","e"를 입력하면 해당되는 메뉴로 이동합니다.
 */

package cooperation; // 패키지 선언, 패키지 이름 cooperation

import java.util.Scanner; // 스캐너 모듈 호출

// 클래스 선언, 클래스 이름 test2
public class test2 {

	// 메소드 선언(public), 정적 메소드(static), 값을 리턴하지 않음(void), 메소드 이름(main)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner 사용을 위한 변수 sc 선언
		
		boolean inMainMenu = true; // boolean inMainMenu 선언 true
		while(inMainMenu) { // 반복문 시작
			System.out.println("(I)ntro (C)ourses (E)xit"); // I, C, E중에 선택
			
			switch(sc.next()) { // switch문시작 입력값 문자열만
				case "I": // I 저장
				case "i": // i 저장
					System.out.println("안녕하세요! 우리는 코드잇입니다. \n" + "함께 공부합시다!");
					break; // 반복문 멈춤
				case "C": // C 저장
				case "c": // c 저장
					
					boolean inCourseMenu = true; // boolean inCoursMenu 선언 true
					while(inCourseMenu) { // 반복문 시작
						// 수업 소개 P J i B 중에 선택하는 창 출력
						System.out.println("코드잇 수업을 소개합니다. \n" + "(P)ython (J)ava (i)OS (B)ack");
						
						switch(sc.next()) { // switch문 시작 입력값 문자열만
							case "P": // P 저장
							case "p": // p 저장
								// Python 언어 관련 문구 및 강사 출력
								System.out.println("Python 언어를 통해 컴퓨터 사이언스의 기초를 배웁니다.\n" + "강사: 강영훈\n" + "추천 선수과목: 없음\n");
								break; // 멈춤
							case "J": // J 저장
							case "j": // j 저장
								// Java 언어 관련 문구 및 강사 출력
								System.out.println("Java의 기초 문법과 객체지향적 프로그래밍을 배웁니다.\n" + "강사: 김신\n" + "추천 선수과목: 없음\n");
								break; // 멈춤
							case "I": // I 저장
							case "i": // i 저장
								// Swift 언어 관련 문구 및 강사 출력
								System.out.println("최신 Swift 언어를 통해 iOS 개발을 시작할 수 있습니다.\n" + "강사: 성태\n" + "추천 선수과목: Python, Java\n");
								break; // 멈춤
							case "B": // B 저장
							case "b": // b 저장
								inCourseMenu = false; // inCourseMenu값 false 저장
								break; // 멈춤
							default: // 예외
								System.out.println("다시 입력해 주세요."); // 다시 입력해주세요. 출력
								break; // 멈춤
						}// End 두번째 switch문
					} // End 두번째 while문
					break; // 멈춤
				case "E": // E 저장
				case "e": // e 저장
					System.out.println("안녕히 가세요."); // 안녕히 가세요. 출력
					inMainMenu = false; // inMainMenu값 false 저장
					break; // 멈춤
				default: // 예외
					System.out.println("다시 입력해 주세요."); // 다시 입력해 주세요. 출력
					break; // 멈춤
					
			} // End 첫번째 switch문
		} // End 첫번째 while문

	} // End main

} // End class
