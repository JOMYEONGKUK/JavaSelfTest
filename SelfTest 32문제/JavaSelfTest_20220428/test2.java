/*문제2
영어 수학 모두 80점 이상이면 합격
영어 수학이 모두 80점 미만이면 불합격
둘중 하나만 80점 이상이면 재시험 기회제공 출력하는 프로그램을 작성하시오.
 */

import java.util.Scanner; // 스캐너 모듈 호출

//클래스 선언, 클래스 이름 test2
public class test2 {
	
	// 메소드 선언(public), 정적 메소드(static), 값을 리턴하지 않음(void), 메소드 이름(main)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner 사용을 위한 변수 sc 선언
		System.out.println("영어점수를 입력해주세요: \n"); // 영어점수 입력
		int num1 = sc.nextInt(); // 영어점수 저장
		
		Scanner sc1 = new Scanner(System.in); // Scanner 사용을 위한 변수 sc1 선언
		System.out.println("수학점수를 입력해주세요: "); // 수학점수 입력
		int num2 = sc1.nextInt(); // 수학점수 저장
		
		if(num1 >= 80 && num2 >= 80) { // num1은 80보다 크거나 같고 num2는 80보다 크거나 같으면
			System.out.println("합격입니다."); // 합격
		} else if(num1 < 80 && num2 < 80) { // num1,num2 80보다 작으면
			System.out.println("불합격입니다."); // 불합격
		} else if(num1 >= 80 || num2 < 80) { // num1은 80보다 크거나 같고 num2는 80보다 작으면
			System.out.println("재시험 기회제공"); // 재시험
		}

	} // End main

} // End class
