/*문제 3
세 개의 문자열을 선언하고 세명 의 이름 앞글자를 따서 화면에 출력
*/

// 클래스 선언, 클래스 이름 test3
public class test3 {

	// 메소드 선언(public), 정적 메소드(static), 값을 리턴하지 않음(void), 메소드 이름(main)
	public static void main(String[] args) {
		
		String str1 = "Julio"; // str1 선언
		String str2 = "Abraham"; // str2 선언
		String str3 = "DoDo"; // str3 선언
		
		// 앞글자만 출력
		System.out.printf("%c%c%c",str1.charAt(0),str2.charAt(0),str3.charAt(0));

	} // End main

} // End class
