/*문제1
1부터 100까지의 숫자를 입력 사용자가 입력 컴퓨터 발생시킨 값이 일치하면 멈추는 프로그램을 작성하시오.
 */

import java.util.Random; // 랜덤 모듈 호출
import java.util.Scanner; // 스캐너 모듈 호출

//클래스 선언, 클래스 이름 test1
public class test1 {

	// 메소드 선언(public), 정적 메소드(static), 값을 리턴하지 않음(void), 메소드 이름(main)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner 사용을 위한 변수 sc 선언
		
		int randomNum = 0; // randomNum 선언 0저장
		
		int userNum = 0; // userNum 선언 0저장
		
		int count = 0; // count 선언 0저장
		
		Random ran = new Random();
		randomNum = ran.nextInt(100) + 1;
		
		while(true) { // while true 무한반복 시작
			System.out.println("1부터 100까지 숫자를 입력하세요."); // 숫자 입력
			userNum = sc.nextInt(); // 숫자 저장
			count++; // count 증감값 ++
			if(randomNum > userNum) // ran이 user보다 크면
				System.out.println("1과 100사이의 값 중 입력한 값보다 큰 값을 입력하세요."); // 참이면 출력  
			else if(randomNum < userNum) // user이 ran보다 크면 
				System.out.println("1과 100사이의 값 중 입력한 값보다 작은 값을 입력하세요."); // 참이면 출력 
			else {
				System.out.println("사용자가 입력한 값과 컴퓨터가 발생시킨 임의의 값이 일치합니다."); // 일치하면 출력
				System.out.printf("총 실행 횟수는 %d번 입니다.", count);
				break; // 반복문 탈출
			}
		} // End while true	

	} // End main

} // End class
