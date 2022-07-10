/*문제1
4행 4열짜리 정수형 배열 생성 0행 0열 2행 2열까지는 1~10까지의 정수 값 저장 후 출력하세요.
 */

import java.util.Scanner; // 스캐너 모듈 호출

//클래스 선언, 클래스 이름 test1
public class test1 {

	// 메소드 선언(public), 정적 메소드(static), 값을 리턴하지 않음(void), 메소드 이름(main)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner 사용을 위한 변수 sc 선언
		
		// 정수형 2차원 배열 arr 선언 4행 4열 
		int[][] arr = new int[4][4];
		
		final int RowFinal = arr.length - 1;
		final int ColFinal = arr[0].length - 1;
		
		// row 선언 0저장 row는 arr 길이보다 작고 row 증감값++
		for(int row = 0; row < arr.length; row++) {
			// col 선언 0저장 col은 arr[i]길이보다 작고 col 증감값++
			for(int col = 0; col < arr[row].length; col++){
				// row는 RowFianl과 다르고 col은 ColFinal과 다르면
				if(row != RowFinal && col != ColFinal) {
					arr[row][col] = (int)(Math.random() * 10 + 1);
					
					arr[row][ColFinal] += arr[row][col];
					arr[RowFinal][col] += arr[row][col];
					arr[RowFinal][ColFinal] += arr[row][col];
				}
				System.out.printf("%4d ", arr[row][col]);
			}
			System.out.println(); // 한칸 줄바꿈
		}

	} // End main

} // End class
