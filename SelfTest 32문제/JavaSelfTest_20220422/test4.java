/*문제 4
다음과 같은 화면을 출력하는 프로그램을 작성하세요.
단, 프로그램은 세 개의 출력문으로 구성되며 두 출력문의 코드는 다르게 합니다.
result = 33Ad1
		 33Ad1
		 33Ad1
*/

// 클래스 선언, 클래스 이름 test4
public class test4 {

	// 메소드 선언(public), 정적 메소드(static), 값을 리턴하지 않음(void), 메소드 이름(main)
	public static void main(String[] args) {
		
		System.out.println("33Ad1"); // 문자열
		System.out.println("33"+"Ad1"); // 문자열 더한 값
		System.out.println("3" + "3" + "Ad" + '1'); // 문자열 문자형 더한 값

	} // End main

} // End class
