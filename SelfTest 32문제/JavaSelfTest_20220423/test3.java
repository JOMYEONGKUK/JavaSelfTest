/*문제 3
사칙연산 사용 10, 100, 1000을 만들어보자.
세 가지 변수 선언 재선언x
print안에 숫자 출력x
최소 두개 변수 사용
*/

// 클래스 선언, 클래스 이름 test3
public class test3 {

	// 메소드 선언(public), 정적 메소드(static), 값을 리턴하지 않음(void), 메소드 이름(main)
	public static void main(String[] args) {
		
		int a = 1; // 변수 a선언 1저장
		int b = 2; // 변수 b선언 2저장
		int c = 3; // 변수 c선언 3저장
		
		System.out.println((a+b) * c + a); // 3 x 3 + 1 값 출력
		System.out.println((a+ c*c) * (a+ c*c)); // 10 * 10 값 출력
		System.out.println(a*500+ b*100 + c*100); // 500 + 200 + 300 값 출력

	} // End main

} // End class
