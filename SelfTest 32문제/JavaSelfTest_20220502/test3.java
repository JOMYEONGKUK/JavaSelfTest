/*문제3
정수 3개를 입력 받고 중간 크기의 수를 출력하라.
 */

import java.util.Scanner; // 스캐너 모듈 호출

//클래스 선언, 클래스 이름 test3
public class test3 {

	// 메소드 선언(public), 정적 메소드(static), 값을 리턴하지 않음(void), 메소드 이름(main)
	public static void main(String[] args) {
		
		// 정수형 변수 세개 선언
		int numA, numB, numC;
		
		Scanner sc = new Scanner(System.in); // Scanner 사용을 위한 변수 sc 선언
		System.out.println("A의 값을 입력하세요: "); // A의 값 입력 
		numA = sc.nextInt(); // A값 저장
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("B의 값을 입력하세요: "); // B의 값 입력
		numB = sc1.nextInt(); // B값 저장
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("C의 값을 입력하세요: "); // C의 값 입력
		numC = sc2.nextInt(); // C값 저장
		
		// A는 B보다 작고 A는 C 보다 크면 A는 C보다 작고 A는 B 보다 크면
		if ((numA < numB && numA > numC) || (numA < numC && numA > numB)) {
			System.out.println("A가 중간값 입니다 = " + numA); // A 값 출력
			// B는 A보다 작고 B는 C 보다 크면 B는 C보다 작고 B는 A 보다 크면
		} if ((numB < numA && numB > numC) || (numB < numC && numB > numA)) {
			System.out.println("B가 중간값 입니다 = " + numB); // B 값 출력
		} else {
			System.out.println("C가 중간값 입니다 = " + numC); // C 값 출력
		}
	} // End main

} // End class
