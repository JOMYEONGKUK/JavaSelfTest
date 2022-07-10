/*문제 1
이름, 나이, 키, 자기소개를 입력받아 화면에 출력하는 프로그램을 작성하시오.
*/

import java.util.Scanner; // 스캐너 모듈 호출

// 클래스 선언, 클래스 이름 test1
public class test1 {

	// 메소드 선언(public), 정적 메소드(static), 값을 리턴하지 않음(void), 메소드 이름(main)
	public static void main(String[] args) {
		
		String name; // 이름
		int age; // 나이
		double height; // 키
		String intro; // 자기소개
		String buffer; 
		
		Scanner sc = new Scanner(System.in); // Scanner 사용을 위한 변수 sc 선언
		System.out.println("이름을 입력해주세요: "); // 이름 입력
		name = sc.next(); // 이름 저장
		System.out.println("나이를 입력해주세요: "); // 나이 입력
		age = sc.nextInt(); // 나이 저장
		System.out.println("키를 입력해주세요: "); // 키 입력
		height = sc.nextDouble(); // 키 저장
		System.out.println("자기소개를 입력해주세요: "); // 자기소개 입력
		buffer = sc.nextLine();
		intro = sc.nextLine(); // 자기소개 저장
		
		// 이름, 나이, 키 출력
		System.out.println("이름은 "+name+" 나이는"+age+ " 키는 "+height+ " 입니다.");
		System.out.println(intro); // 자기소개 출력
	} // End main

} // End class
