/*문제1
 시험 점수를 입력받아 90~100점은 A, 80~89점은 B, 70~79점은 C, 60~69점은 D, 나머지는 F를 출력하는
 프로그램을 작성하시오.
 */

import java.util.Scanner; // 스캐너 모듈 호출

//클래스 선언, 클래스 이름 test1
public class test1 {

	// 메소드 선언(public), 정적 메소드(static), 값을 리턴하지 않음(void), 메소드 이름(main)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner 사용을 위한 변수 sc 선언
		int score = sc.nextInt(); // 점수 저장
		sc.close(); // 스캐너 종료
		
		if(score <= 100 && score >= 90) { // score는 100보다 작거나 같고 90보다 크거나 같으면
			System.out.println("A"); // A 출력
		} else if(score <= 89 && score >= 80) { // score는 89보다 작거나 같고 80보다 크거나 같으면
			System.out.println("B"); // B 출력
		} else if(score <= 79 && score >= 70) { // score는 79보다 작거나 같고 70보다 크거나 같으면
			System.out.println("C"); // C 출력
		} else if(score <= 69 && score >= 60) { // score는 69보다 작거나 같고 60보다 크거나 같으면
			System.out.println("D"); // D 출력
		} else {
			System.out.println("F"); // F 출력
		} 
	} // End main

} // End class
