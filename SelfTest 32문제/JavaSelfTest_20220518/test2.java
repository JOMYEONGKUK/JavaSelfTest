/*문제 2
A, B, C 사원의 연봉을 입력 받고 각 사원의 연봉과 인센티브를 포함한 연봉을 계산하여 출력하고 
인센티브 포함 급여가 3000만원 이상이면 "3000 이상", 미만이면 "3000 미만"을 출력하세요.
(A 사원의 인센티브는 0.4, B 사원의 인센티브는 없으며, C 사원의 인센티브는 0.15)
 */

import java.util.Scanner; // 스캐너 모듈 호출

//클래스 선언, 클래스 이름 test2
public class test2 {

	// 메소드 선언(public), 정적 메소드(static), 값을 리턴하지 않음(void), 메소드 이름(main)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner 사용을 위한 변수 scan 선언
		   
		System.out.print("A사원의 연봉 : "); // A사원 연봉 입력
		int a = sc.nextInt(); // A사원 연봉 저장
		System.out.print("B사원의 연봉 : "); // B사원 연봉 입력
		int b = sc.nextInt(); // B사원 연봉 저장
		System.out.print("C사원의 연봉 : "); // C사원 연봉 입력
		int c = sc.nextInt(); // C사원 연봉 저장
		   
		double alncen = a * 1.4; // a + a * 0.4 --> a + 0.4a --> a(1+0.4) --> a * 1.4
		double blncen = b; // double 타입 blncen 선언 b 저장
		double clncen = c * 1.15; // b + b * 0.15 --> b(1 + 0.15) --> b * 1.15; 
		   
		System.out.println(); // 한칸 줄바꿈
		  
		System.out.println("A사원의 인센티브포함 연봉 : " + alncen); // 연봉 출력
		System.out.println(alncen >= 3000 ? "3000이상" : "3000미만"); // 3000이상인지 3000미만인지 출력
		  
		System.out.println("B사원의 인센티브포함 연봉 : " + blncen); // 연봉 출력 
		System.out.println(blncen >= 3000 ? "3000이상" : "3000미만"); // 3000이상인지 3000미만인지 출력
		  
		System.out.println("C사원의 인센티브포함 연봉 : " + clncen); // 연봉 출력
		System.out.println(clncen >= 3000 ? "3000이상" : "3000이상"); // 3000이상인지 3000미만인지 출력
		  
	
	} // End main
} // End class
