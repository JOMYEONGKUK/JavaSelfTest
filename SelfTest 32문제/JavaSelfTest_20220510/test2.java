/*문제 2
 숫자를 입력 받아 3의 배수인 숫자를 출력하는 프로그램을 작성하세요.
  */

package kosta.phone; // 패키지 선언, 패키지 이름 kosta.phone

import java.util.Scanner; // 스캐너 모듈 호출

//클래스 선언, 클래스 이름 test2
public class test2 {

	// 메소드 선언(public), 정적 메소드(static), 값을 리턴하지 않음(void), 메소드 이름(main)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner 사용을 위한 변수 sc 선언
		int[] arr = new int[10]; // 정수형 배열 변수 arr 선언 10열
		
		// for문 시작 정수형 i선언 0저장 i는 10보다 작으면, i 증감값++
		for(int i = 0; i<10; i++) {
			System.out.println((i+1)+"번째 정수 입력 : "); // 정수 입력
			arr[i] = sc.nextInt(); // 입력받은 정수값 배열값으로 저장
		}
		System.out.println("3의 배수 : "); // 3의 배수 출력
		
		// for문 시작 정수형 변수 i선언 0저장 i는 10보다 작은거, i 증감값++
		for(int i = 0; i<10; i++) {
			if(arr[i] % 3 == 0) { // arr[i]는 3과 나누었을때 0과 같으면
				System.out.println(arr[i]); // 배열값 출력
			} // End if
		} // End 두번째 for문

	} // End main

} // End class
