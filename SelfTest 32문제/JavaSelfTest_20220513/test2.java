/*문제 2
String 2차원 배열을 이용한 단어맞추기 게임 - 영어단어의 뜻을 입력혀 정답이면 정답입니다.
오답이면 틀렸습니다. 정답은 ~입니다. 라고 출력하는 프로그램을 만드시오.
 */

import java.util.Scanner; // 스캐너 모듈 호출

// 클래스 선언, 클래스 이름 test2
public class test2 {

	// 메소드 선언(public), 정적 메소드(static), 리턴값 없음(void), 메소드 이름(main)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner 사용을 위한 변수 sc 선언
		
		// 문자열 타입 2차원 배열 a 선언 문자열 저장
		String[][] a = new String[][]{{"Chair", "의자"},{"Computer", "컴퓨터"},{"Integer", "정수"}};
		
		int i; // 정수형 변수 i선언
		
		// for문 시작 i는 0저장, i는 a길이보다 작으면, i 증감값++
		for(i=0; i<a.length; i++) {
			
			
			// 질문 출력
			System.out.printf("Q%d. %s의 뜻은? ", i+1, a[i][0]);
			
			// 저장된 2차원 배열 문자열이 참이면
			if(a[i][1].equals(sc.next())) {
				System.out.println("정답입니다.\n"); // 정답입니다. 출력
			} else {
				System.out.printf("틀렸습니다. \n정답은 %s입니다.\n\n", a[i][1]); // 틀렸습니다. 를 출력해주고 정답을 출력
			}
		} // End for문

	} // End main

} // End class
