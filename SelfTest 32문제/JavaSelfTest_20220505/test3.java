/*문제3
사용자에게 행의 크기를 입력 받고 그 수만큼의 반복을 통해 열의 크기도 받아
문자형 가변 배열을 선언 및 할당하세요.
그리고 각 인덱스에 ‘a’부터 총 인덱스의 개수만큼 하나씩 늘려 저장하고 출력하세요.
 */

import java.util.Scanner; // 스캐너 모듈 호출

//클래스 선언, 클래스 이름 test3
public class test3 {

	// 메소드 선언(public), 정적 메소드(static), 값을 리턴하지 않음(void), 메소드 이름(main)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Scanner 사용을 위한 변수 sc 선언
		 
		int rowNum; // rowNum 선언
		int colNum; // colNum 선언
		char[][] arr; // 2차원 배열 선언
		char ch = 'a'; // 문자형 선언
		
		System.out.print("행 크기 : "); // 행 크기 입력 
		rowNum = sc.nextInt(); // 행 크기 저장
		
		arr = new char[rowNum][];
		
		// row 선언 0저장 row는 arr 길이보다 작고 row 증감값++
		for (int row = 0; row < arr.length; row++) {
			System.out.print(row + "열의 크기 : "); // 열의 크기 입력
			colNum = sc.nextInt(); // 열의 크기 저장
			
			arr[row] = new char[colNum];
			
			// col 선언 0저장 col은 arr[i]길이보다 작고 col 증감값++
			for (int col = 0; col < arr[row].length; col++)
				arr[row][col] = ch++;
		}
		
		// row 선언 0저장 row는 arr 길이보다 작고 row 증감값++
		for (int row = 0; row < arr.length; row++) {
			// col 선언 0저장 col은 arr[i]길이보다 작고 col 증감값++
			for (int col = 0; col < arr[row].length; col++)
				System.out.print(arr[row][col] + " ");
			
			System.out.println(); // 한칸 줄바꿈
		}
		
		
	} // End main
} // End class
