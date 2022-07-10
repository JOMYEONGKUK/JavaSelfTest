/*문제 3
스마트미디어인재개발원의 인쌤이 Java 시험문제를 채점하고 있다.
문제마다 'o'또는 'x'로 표시가 되어 있는데 점수를 매기는 방식이 특이하다.
'o'는 점수가 누적되는 방식으로 채점되는데 이전부터 자신을 포함한 연속된 'o'의 개수 만큼의 점수로 채점이 됩니다.
예를 들어 'oooxoo'라는 표시가 있다면 순서대로 1+2+3+0+1+2=9 로 총점이 계산됩니다. 학생이 푼 시험지에
정답, 오답 여부가 표시되어 있을 때 총점을 구하는 프로그램을 작성하세요.
 */

import java.util.Scanner; // 스캐너 모듈 호출

// 클래스 선언, 클래스 이름 test3
public class test3 {

	// 메소드 선언(public), 정적 메소드(static), 리턴값 없음(void), 메소드 이름(main)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner 사용을 위한 변수 sc 선언
		
		System.out.println("===채점하기==="); // 채점하기 출력
		String ans = sc.next(); // 입력받은 ox 저장
		
		String[] arr = ans.split(""); // 문자열 배열 변수 arr 선언
		
		int score = 0; // 정수형 변수 score 선언, 0저장
		int sum = 0; // 정수형 변수 sum 선언, 0저장
		
		// for문 시작 정수형 변수 i선언 0저장, i는 arr길이보다 작으면, i 증감값++
		for(int i=0; i<arr.length; i++) {
			if(arr[i].equals("o")) { // arr 배열이 o과 같으면
				score++; // score 증감값++
			} else { // 예외
				score = 0; // socre 0저장
			}sum+=score; // sum = sum + score
			
			
		}
		System.out.println(sum); // sum 값 출력

	} // End main

} // End class
