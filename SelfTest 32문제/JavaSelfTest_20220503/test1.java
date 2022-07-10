/*문제1
N과 X를 입력받고
N개의 정수를 입력 받고
N개의 숫자 중 X보다 작은 수만 출력 
 */

import java.util.Scanner;  // 스캐너 모듈 호출

//클래스 선언, 클래스 이름 test1
public class test1 {

	// 메소드 선언(public), 정적 메소드(static), 값을 리턴하지 않음(void), 메소드 이름(main)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner 사용을 위한 변수 sc 선언
		int[] arr = new int [10]; // 배열 변수 arr 선언
		
		System.out.print("N 입력 : "); // N 입력
		int N = sc.nextInt(); // N 저장
		
		System.out.print("x 입력 : "); // x 입력
		int x = sc.nextInt(); // x 저장
		
		// i선언 0저장 i는 10보다 작고 i 증감값++
		for(int i=0; i<10; i++) {
			System.out.println((i+1) + "번째 점수 입력 : "); // 번째 점수 입력
			arr[i] = sc.nextInt(); // 번째 점수 입력 저장
		}
		System.out.println("결과: "); // 결과 출력
		for(int i=0; i<10; i++) { // i선언 0저장 i는 10보다 작고 i 증감값++
			if(arr[i] < x) { // arr[i]는 x보다 작으면
				System.out.println(arr[i] + ""); // arr[i] 출력
			}
		}
	} // End main

} // End class
