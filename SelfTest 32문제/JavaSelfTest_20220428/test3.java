/*문제3
나이에 따라 교통요금 출력
8세 미만은 450원
8세이상 19세 이하는 720원
20세 이상은 1250원
 */

import java.util.Scanner; // 스캐너 모듈 호출

//클래스 선언, 클래스 이름 test3
public class test3 {

	// 메소드 선언(public), 정적 메소드(static), 값을 리턴하지 않음(void), 메소드 이름(main)
	public static void main(String[] args) {
		
		Scanner age = new Scanner(System.in); // Scanner 사용을 위한 변수 age 선언
		System.out.println("나이를 입력해주세요: "); // 나이 입력
		int age1 = age.nextInt(); // 나이 저장
		
		if(age1 <= 8 && age1 >= 0) { // age1은 8보다 작거나같고 age1은 0보다 크거나 같으면
			System.out.println("450원"); // 450원 출력
		} else if(age1 >= 8 && age1 <= 19) { // age1은 8보다 크거나 같고 age1은 19보다 작거나 같으면
			System.out.println("720원"); // 720원 출력
		} else if(age1 < 0) { // age1은 0보다 작으면
			System.out.println("정수형으로 입력해주세요."); // 경고 출력
		} else {
			System.out.println("2000원"); // 2000원 출력
		}

	} // End main

} // End class
