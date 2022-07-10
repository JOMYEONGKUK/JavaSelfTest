/*문제3
사용자로부터 입력받은 값에 20을 더한 값출력
20을 더한 계산값이 255를 초과하면 255를 출력
 */

import java.util.Scanner; // 스캐너 모듈 호출

//클래스 선언, 클래스 이름 test3
public class test3 {

	// 메소드 선언(public), 정적 메소드(static), 값을 리턴하지 않음(void), 메소드 이름(main)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner 사용을 위한 변수 sc 선언
		System.out.println("정수를 입력해주세요: "); // 정수 입력
		int num = sc.nextInt(); // 정수 저장
		
		// num+20 한값이 255보다 작거나 같으면
		if(num+20 <= 255) {
			System.out.println(num + 20); //num + 20 한 값 출력
		} else {
			System.out.println(255); // 255 출력
		}

	} // End main

} // End class
