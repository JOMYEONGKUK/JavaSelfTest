/*문제1
while문을 활용하여 'q'가 입력될 때까지 입력한 문자를 계속 출력하는 프로그램을 작성해보자.
 */

import java.util.Scanner; // 스캐너 모듈 호출

//클래스 선언, 클래스 이름 test1
public class test1 {

	// 메소드 선언(public), 정적 메소드(static), 값을 리턴하지 않음(void), 메소드 이름(main)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner 사용을 위한 변수 sc 선언
		char ch; // char형 변수 ch 선언
		
		do { // do문 시작
			System.out.println("Enter the alphaber: ");
			ch = sc.next().charAt(0); // 입력받은 문자 저장
		} while(ch != 'q'); // ch는 q와 다르면
			System.out.println("Finish");
	} // End main

} // End class
