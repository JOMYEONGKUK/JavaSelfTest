/*문제 3
2001년부터 2012년 사이에서 윤년을 구하시오.
*/

// 클래스 선언, 클래스 이름 test3
public class test3 {

	// 메소드 선언(public), 정적 메소드(static), 값을 리턴하지 않음(void), 메소드 이름(main)
	public static void main(String[] args) {
		
		// 정수형 변수 year 선언 2001 저장 year은 2012보다 작고 year 증감값++
		for(int year = 2001; year <= 2012; year++) {
			// year은 4로 나누어지고 year은 100과 안나눠지고 year은 400가 나눠지는거
			if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ) {
				
				// 윤년을 출력
				System.out.println(year);
			} // End if
		} // End for

	} // End main

} // End class
