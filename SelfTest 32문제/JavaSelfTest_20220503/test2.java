/*문제2
단 수와 곱해지길 원하는 수를 입력하여 구구단 형식으로 출력하시오. 
 */

import java.util.Scanner;// 스캐너 모듈 호출

//클래스 선언, 클래스 이름 test2
public class test2 {

	// 메소드 선언(public), 정적 메소드(static), 값을 리턴하지 않음(void), 메소드 이름(main)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner 사용을 위한 변수 sc 선언
		System.out.println("단수 입력: ");  // 단수 입력 
		int num1 = sc.nextInt(); // 단수 저장
		
		System.out.println("어느 수까지 출력: "); // 어느 수까지 출력
		int num2 = sc.nextInt(); // 어느 수까지 출력 저장
		
		System.out.println(num1+"단"); // 단 출력
		
		// i선언 0저장 i는 num2보다 작고 i 증감값++
		for(int i=0; i<num2; i++) {
			System.out.println(num1+"*"+(i+1)+"="+(num1*(i+1))); // 곱셈 출력
		}
	} // End main

} // End class
