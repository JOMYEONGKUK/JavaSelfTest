/*문제1
문자 한개를 입력받고 소문자일 경우 대문자 대문자일 경우 소문자로 출력
알파벳이 아닌 언어 입력시 잘못된 입력 출력
 */

import java.util.Scanner; // 스캐너 모듈 호출

//클래스 선언, 클래스 이름 test1
public class test1 {

	// 메소드 선언(public), 정적 메소드(static), 값을 리턴하지 않음(void), 메소드 이름(main)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner 사용을 위한 변수 sc 선언
		String inputString = " "; // inputString 선언
		
		System.out.println("언어를 입력해주세요: "); // 언어 입력
		inputString = sc.next(); // 언어 저장
		
		char[] change = inputString.toCharArray(); // char 배열 change 선언
		
		// i선언 0저장 i는 change 길이보다 작고 i 증감값++
		for(int i=0; i<change.length; i++) {
			
			if(change[i] >= 'A' && change[i] <= 'Z') { // + 32해주고 소문자 변환
			   change[i] = (char) (change[i] + 32);
			} else if(change[i] >= 'a' && change[i] <= 'z') { // -32해주고 대문자 변환
				change[i] = (char) (change[i] - 32);
			} else {
				System.out.println("잘못된 입력"); // 잘못된 입력 출력 
				break; // 멈춤
			}
		}
		System.out.println(change); // 변환된 값 출력
	} // End main

} // End class
