/*문제1
현재 몸무게와 목표 몸무게를 입력 받고 주차별 감량 몸무게를 입력받아 목표 달성시 축하메세지를 띄우는 프로그램을 구현하시오.
 */

import java.util.Scanner; // 스캐너 모듈 호출

//클래스 선언, 클래스 이름 test1
public class test1 {

	// 메소드 선언(public), 정적 메소드(static), 값을 리턴하지 않음(void), 메소드 이름(main)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner 사용을 위한 변수 sc 선언
		System.out.println("현재 몸무게: "); // 현재 몸무게 입력
		int now = sc.nextInt(); // 현재 몸무게 저장
		
		System.out.println("목표 몸무게: "); // 목표 몸무게 입력
		int future = sc.nextInt(); // 목표 몸무게 저장
		
		int i = 1; // i선언 1저장
		int j = 0; // j선언 0저장
		
		while(true) { // 무한반복 시작
			System.out.println(i+"주차 감량 몸무게: "); // 주차 감량 몸무게 입력
			j = sc.nextInt(); // 감량 몸무게 저장
			now -= j;
			if(future >= now) ///future가 now보다 크거나 같으면
				break; // 반복문 탈출
			i++; // i 증감값++
		}
		System.out.println(now+"kg 달성! 축하합니다."); // 목표 몸무게 달성 시 출력
	} // End main

} // End class
