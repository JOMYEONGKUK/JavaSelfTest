/*문제 2
점수를 입력 받아 "수우미양가"를 평가하는 프로그램
 */

import java.util.Scanner; // 스캐너 모듈 호출

//클래스 선언, 클래스 이름 test2
public class test2 {

	// 메소드 선언(public), 정적 메소드(static), 값을 리턴하지 않음(void), 메소드 이름(main)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  // Scanner 사용을 위한 sc 변수 선언
		System.out.print("점수를 입력하세요: "); // 점수 입력
		int score = sc.nextInt(); // 입력받은 점수 저장
		
		String grade = "가"; // grade 선언 "가" 저장
		
		// score가 0보다 크거나 같고 &&(and) score가 100보다 작거나 같으면
		if(score>=0 && score<=100) { 
			switch(score/10) { // switch문 시작 score를 10으로 나누면
				case 10 : // case 10 저장
				case 9 : // case 9 저장
				
				grade = "수"; // grade 수 값 저장
				break; // switch문 멈춤
				
				case 8 : // case 8 저장
				grade = "우"; // grade 우 값 저장
				break; // switch문 멈춤
				
				case 7 : // case 7 저장
				grade = "미"; // grade 미 값 저장
				break; // switch문 멈춤
				
				case 6 : // case 6 저장
				grade = "양"; // grade 양 값 저장
				} 
		} else {  // 예외 점수값을 0미만 100초과 값을 입력했을 때
			grade = "점수값이 잘못되었습니다."; }  // 점수값이 잘못되었습니다. 출력
		System.out.print(grade); // grade 출력
	
	} // End main 
} // End class