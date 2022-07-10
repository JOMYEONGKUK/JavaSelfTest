/*문제 3
코리아 초등학교 1학년부터 4학년까지 4학년은 70점 이상 합격 그외는 60점 이상 합격
이를 판단하는 프로그램 작성
정수가 0미만 100 초과이면 경고문구를 출력하라.
*/

import java.util.Scanner; // 스캐너 모듈 호출 

// 클래스 선언, 클래스 이름 test3
public class test3 {

	// 메소드 선언(public), 정적 메소드(static), 값을 리턴하지 않음(void), 메소드 이름(main)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner 사용을 위한 변수 sc 선언
		System.out.println("학년과 점수를 입력해주세요: "); // 학년 점수 ㅇ비력
		int grade = sc.nextInt(); // grade 선언
		int score = sc.nextInt(); // score 선언
		
		String msg = "잘못 입력하셨습니다."; // 경고 문구 선언
		if(0 <= score && score <= 100) { // score는 0보다 크거나 같고 100보다 작거나 같으면 
			if(60 <= score) { // score는 60보다 크거나 같으면
				if(grade != 4) { // grade는 4와 다르면
					msg = "합격";  // 합격 출력
				} else if(score >= 70) { // score는 70보다 크거나 같으면
					msg = "합격"; // 합격 출력
				} else { // 예외
					msg = "불합격"; // 뿔합격 출력
				}
			} else { // 예외
				msg = "불합격"; // 불합격 출력
			}
		}
		System.out.println(msg);  // msg 출력 
	} // End main

} // End class
