/*문제2
4행 4열짜리 정수형 배열 선언 할당하고
1 ~ 16까지 값을 차례대로 저장
저장된 값들을 차례대로 출력하세요.
 */

//클래스 선언, 클래스 이름 test2
public class test2 {

	// 메소드 선언(public), 정적 메소드(static), 값을 리턴하지 않음(void), 메소드 이름(main)
	public static void main(String[] args) {
		
		// 문자열 2차원 배열 선언 4행 4열
		int[][] arr = new int[4][4];
		
		int num = 1; // num 선언 1저장 
		
		// row 선언 0저장 row는 arr 길이보다 작고 row 증감값++
		for(int row = 0; row<arr.length; row++) {
			// col 선언 0저장 col은 arr 길이보다 작고 col 증감값++
			for(int col=0; col<arr.length; col++) {
				arr[row][col] = num++;
				System.out.printf("%2d", arr[row][col]); // 1부터 16까지 출력
			}
			System.out.println(); // 4행마다 한칸씩 줄바꿈 
		}

	} // End main

} // End class
