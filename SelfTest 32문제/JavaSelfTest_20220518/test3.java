/*문제 3
모든 사람이 사탕을 골고루 나눠가지려고 한다. 인원 수와 사탕 개수를 키보드로 입력 받고 
1인당 동일하게 나눠가진 사탕 개수와 나눠주고 남은 사탕의 개수를 출력하세요.
 */

import java.util.Scanner; // 스캐너 모듈 호출

//클래스 선언, 클래스 이름 test3
public class test3 {

	// 메소드 선언(public), 정적 메소드(static), 값을 리턴하지 않음(void), 메소드 이름(main)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner 사용을 위한 변수 scan 선언
		
		System.out.print("인원 수 : "); // 인원 수 입력
		int people = sc.nextInt(); // 인원 수 저장
	
		System.out.print("사탕 개수 : "); // 사탕 개수 입력
		int candy = sc.nextInt(); // 사탕 개수 저장
		
		System.out.println("1인당 사탕 개수 : " + candy / people ); // 1인당 사탕 개수 출력
		System.out.println("남는 사탕 개수 : " + candy % people ); // 남는 사탕 개수 출력
	
	} // End main
} // End class