/*문제4
사용자로부터 입력받은 값에 20을 뺀 값출력 범위는 0~255이다.
0보다 작으면 255 출력 255보다 큰값이 되도 255출력
 */

import java.util.Scanner; // 스캐너 모듈 호출

//클래스 선언, 클래스 이름 test4
public class test4 {

	// 메소드 선언(public), 정적 메소드(static), 값을 리턴하지 않음(void), 메소드 이름(main)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner 사용을 위한 변수 sc 선언
		System.out.println("정수를 입력해주세요: "); // 정수 입력 
		int num = sc.nextInt(); // 정수 저장
		
		int result = num - 20; // result 선언 num - 20 값 저장
		
		if(result > 255) { // result는 255보다 크면
			System.out.println(255); // 255 출력
		} else if(result < 0) { // result는 0보다 작으면
			System.out.println(0); // 0출력
		} else {
			System.out.println(result); // result 출력
		}

	}  // End main

} // End class
