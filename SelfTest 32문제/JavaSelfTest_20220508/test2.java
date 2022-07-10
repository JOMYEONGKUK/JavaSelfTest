/*문제2
while문을 활용하여 'q'가 입력될 때까지 입력한 문자를 계속 출력하는 프로그램을 작성해보자.
 */

import java.util.Scanner; // 스캐너 모듈 호출

//클래스 선언, 클래스 이름 test2
public class test2 {

	// 메소드 선언(public), 정적 메소드(static), 값을 리턴하지 않음(void), 메소드 이름(main)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);// Scanner 사용을 위한 변수 sc 선언
		System.out.println("Enter the number: "); // 입력
		int num = sc.nextInt(); // 입력값 저장
		String isPrime = "Prime number";
		
		// i선언 2저장 i는 num보다 작고 i 증감값++
		for(int i=2; i<num; i++) {
			if(num % i==0) {
				isPrime = "not prime number";
			}
		}
		System.out.printf("%d is %s", num, isPrime);
	} // End main

} // End class
