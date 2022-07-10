/*문제 3
2020년이라는 가정하에 년과 요일을 입력하면 요일이 나오는 기능을 구현해보시오.
 */

package cooperation; // 패키지 선언, 패키지 이름 cooperation

import java.util.Scanner; // 스캐너 모듈 호출

//클래스 선언, 클래스 이름 test3
public class test3 {

	// 메소드 선언(public), 정적 메소드(static), 값을 리턴하지 않음(void), 메소드 이름(main)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner 사용을 위한 변수 Scanner 선언
		
		int m, d, days = 0, t; // m:월, d:일, days = 0 : 합산날짜수, t:7로 나눈 나머지
		// 월과 일을 입력받습니다.
		System.out.printf("월 입력 : "); // 월 입력
		m = sc.nextInt(); // 월 저장
		System.out.printf("일 입력 : "); // 일 입력
		d = sc.nextInt(); // 일 저장

		System.out.println("입력한 날짜 : " + m + "월 " + d + "일"); // 입력한 날짜, 요일 출력
		
		// 입력된 월의 전달까지의 날짜를 합산
		if (m == 1) // m이 1과 같으면
			days = 0;
		else if (m == 2) // m이 2와 같으면
			days = 31;
		else if (m == 3) // m이 3과 같으면
			days = 31 + 29;
		else if (m == 4) // m이 4와 같으면
			days = 31 + 29 + 31;
		else if (m == 5) // m이 5와 같으면
			days = 31 + 29 + 31 + 30;
		else if (m == 6) // m이 6과 같으면
			days = 31 + 29 + 31 + 30 + 31;
		else if (m == 7) // m이 7과 같으면
			days = 31 + 29 + 31 + 30 + 31 + 30;
		else if (m == 8) // m이 8과 같으면
			days = 31 + 29 + 31 + 30 + 31 + 30 + 31;
		else if (m == 9) // m이 9와 같으면
			days = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31;
		else if (m == 10) // m이 10과 같으면
			days = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
		else if (m == 11) // m이 11과 같으면
			days = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
		else if (m == 12) // m이 12와 같으면
			days = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;

		// 입력된 일을 합산
		days = days + d;
		
		// 합산된 총날짜를 7로 나눈 나머지를 계산
		t = days % 7;
		
		// 요일을 출력합니다
		if (t == 1) // t가 1과 같으면
			System.out.println("수요일입니다."); // 수요일입니다 출력
		else if (t == 2) // t가 2와 같으면
			System.out.println("목요일입니다."); // 목요일입니다 출력
		else if (t == 3) // t가 3과 같으면
			System.out.println("금요일입니다."); // 금요일입니다. 출력
		else if (t == 4) // t가 4와 같으면
			System.out.println("토일입니다."); // 토일입니다. 출력
		else if (t == 5) // t가 5와 같으면
			System.out.println("일요일입니다."); // 일요일입니다. 출력
		else if (t == 6) // t가 6과 같으면
			System.out.println("월요일입니다."); // 월요일입니다. 출력
		else if (t == 0) // t가 0과 같으면
			System.out.println("화요일입니다."); // 화요일입니다. 출력
	
	} // End main
} // End class
