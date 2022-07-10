/*문제2
1~10 사이의 정수를 입력하고 출력 후 다시 정수를 받게 하세요.
크기가 정해진 이차원 배열 안에는 영어 대문자가 랜덤으로 들어가게 한 뒤 출력
 */

import java.util.Scanner;// 스캐너 모듈 호출

//클래스 선언, 클래스 이름 test2
public class test2 {

	// 메소드 선언(public), 정적 메소드(static), 값을 리턴하지 않음(void), 메소드 이름(main)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Scanner 사용을 위한 변수 sc 선언
		
		int rowNum; // rowNum 선언
		int colNum; // colNum 선언
		int[][] arr; // 2차원 배열 선언
		
		while (true) { // 무한반복 시작
			System.out.print("행 크기 : "); // 행 크기 입력
			rowNum = sc.nextInt(); // 행 크기 저장
			
			if (rowNum < 1 || rowNum > 10) // romNum이 1보다 작고 10보다 크면
				System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
			else {
				while (true) { // 무한반복 시작
					System.out.print("열 크기 : "); // 열 크기 입력
					colNum = sc.nextInt(); // 열 크기 저장
					
					if (colNum < 0 || colNum > 10) // colNumdl 0보다 작고 colNum이 10보다 크면 
						System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
					else {
						arr = new int[rowNum][colNum];
						
						// row 선언 0저장 row는 arr 길이보다 작고 row 증감값++
						for (int row = 0; row < arr.length; row++) {
							// col 선언 0저장 col은 arr[i]길이보다 작고 col 증감값++
							for (int col = 0; col < arr[row].length; col++) {
								arr[row][col] = (int)(Math.random() * 26 + 65);
								
								System.out.print((char)arr[row][col] + " ");
							}
							System.out.println();  // 행 열마다 한칸씩 줄바꿈
						}
						
						break; // 첫번째 반복문 탈출
					}
				}
				
				break; // 두번째 반복문 탈출
			}
		}
		
	} // End main
} // End class