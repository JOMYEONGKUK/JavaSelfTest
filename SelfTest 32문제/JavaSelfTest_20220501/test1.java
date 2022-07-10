/*문제1
주민등록번호 뒷 자리 7자리 중 첫째는 성별을 나타내느데 1,3은 남자 2,4는 여자를 의미한다.
5~8까지는 외국인 출력 형식에 맞지 않으면 예외처리하여라.
 */

import java.util.Scanner; // 스캐너 모듈 호출

//클래스 선언, 클래스 이름 test1
public class test1 {

	// 메소드 선언(public), 정적 메소드(static), 값을 리턴하지 않음(void), 메소드 이름(main)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner 사용을 위한 변수 sc 선언
		System.out.println("주민등록번호를 입력해주세요: "); // 주민번호 입력
		String jumin = sc.next(); // 주민번호 저장
		
		char indexing = jumin.charAt(7); // 배열 변수 선언
		
		if(indexing == '1' || indexing == '3') { // 1과 3과 같으면
			System.out.println("남자입니다."); // 남자
		} if(indexing == '2' || indexing == '4') { // 2와 4와 같으면
			System.out.println("여자입니다."); // 여자
		} if(indexing == '5' || indexing == '6' || indexing == '7' || indexing == '8') { // 5678 과 같으면
			System.out.println("외국인입니다."); // 외국인
		} else {
			System.out.println("주민번호를 다시 입력해주세요."); // 주민번호 다시 입력 
		}

	} // End main

} // End class
