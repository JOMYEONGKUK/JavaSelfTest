/*문제 2
수를 입력받아 3의 배수만 "오예" 5의 배수면 "뭐야" 3과 5의 동시 배수면"앗싸"를 출력하시오 
 */

import java.util.Scanner; // 스캐너 모듈 호출

// 클래스 선언, 클래스 이름 test2
public class test2 {

	// 메소드 선언(public), 정적 메소드(static), 리턴값 없음(void), 메소드 이름(main)
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // Scanner 사용을 위한 변수 sc 선언
		System.out.println("수를 입력하세요: "); // 수 입력
		int num = sc.nextInt(); // 입력받은 수 저장
		
		// num은 3으로 나눠지고 num은 5로 나눠지면
		if(num % 3 == 0 && num % 5 == 0) {
			System.out.println("앗싸"); // 앗싸 출력 
		} else if(num % 3 == 0) { // num은 3으로 나눠지면
			System.out.println("오예"); // 오예 출력
		} else if(num % 5 == 0) { // num은 5로 나눠지면
			System.out.println("뭐야"); // 뭐야 출력
		}
	} // End main

} // End class
