/*문제 3
 정수를 무한적으로 입력 받다가 8의 배수가 5개 입력되면 반복문을
 종료하는 프로그램을 만드시오.
 */

import java.util.Scanner; // 스캐너 모듈 호출

// 클래스 선언, 클래스 이름 test3
public class test3 {

	// 메소드 선언(public), 정적 메소드(static), 리턴값 없음(void), 메소드 이름(main)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner 사용을 위한 변수 sc 선언
		int count = 0; // 정수형 변수 count 선언 0저장
		
		for(;;) { // for문 시작
			System.out.println("정수입력1 > "); // 정수입력
			int b = sc.nextInt(); // 입력된 정수 저장
			
			if(b % 8 == 0) { // b는 8로 나눠지면
				count++; // count 증감값++
			}
			
			if(count == 5) break; // count는 5와 같으면 멈춤
		}
		System.out.println("반복종료11!"); // 반복문 종료11 출력
		
		System.out.println("=========================");

		Scanner input2 = new Scanner(System.in); // 두번째 Scanner 사용을 위한 변수 input2 선언
		
		int count2 = 0; // 정수형 변수 count2 선언 0저장
		
		while(count2 != 5) { // while문 시작 count2가 5와 다르면 
			System.out.println("정수입력2 > "); // 두번째 입력
			int c = input2.nextInt(); // 입력된 두번째 정수 저장
			if (c % 8 == 0) { // c는 8로 나눠지면
				count2++; // c 증감값++
			} // End if
		} // End while
		System.out.println("반복종료22!"); // 반복종료22 출력

	}  // End main

} // End class
