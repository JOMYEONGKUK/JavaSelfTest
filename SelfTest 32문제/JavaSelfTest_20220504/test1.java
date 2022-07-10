/*문제1
3행 3열짜리 문자열 배열 선언 및 할당
인덱스 0행 0열부터 2행 2열까지 차례대로 접근하여 (0,0) 형식으로 저장 후 출력하세요.
 */

//클래스 선언, 클래스 이름 test1
public class test1 {

	// 메소드 선언(public), 정적 메소드(static), 값을 리턴하지 않음(void), 메소드 이름(main)
	public static void main(String[] args) {
		
		// 문자열 2차원 배열 arr 선언 3행 3열
		String[][] arr = new String[3][3];
		
		// row 선언 0저장 row는 arr 길이보다 작고 row 증감값++
		for(int row = 0; row < arr.length; row++) {
			// col 선언 0저장 col은 arr 길이보다 작고 col 증감값++
			for(int col = 0; col < arr.length; col++) {
				System.out.println("(" + row + ", " + col + ")"); // 배열 출력
			System.out.println(); // 한칸씩 줄바꿈
			
			} // End 이중 for문
				
		} // End for문 

	} // End main

} // End class
