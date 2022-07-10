/*문제 1
- if문 예시 놀이기구
- Scanner를 통해 키를 입력받음
- 키가 110cm 이상일 시 라바 트위스터를 탑승 가능합니다.
- 있을시 같이 탑승가능, 없을시 다음에 보호자랑 같이오세요. 문구 출력
 */

import java.util.Scanner; // 스캐너 모듈 호출

// 클래스 선언, 클래스 이름 test1
public class test1 {

	// 메소드 선언(public), 정적 메소드(static), 리턴값 없음(void), 메소드 이름(main)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner 사용을 위한 변수 sc 선언
		System.out.println("당신의 키를 입력해주세요: "); // 키 입력
		int cm = sc.nextInt(); // 입력받은 키 저장
		
		if(cm>=110) { // cm는 110보다 크거나 같으면
			System.out.println("키카 110cm 이상입니다. 탑승해주세요."); // 조건이 참이면 출력
		} else { // 예외 보호자가 곁에 있거나 없으면
			System.out.println("보호자가 곁에 있으면:1/없으면:0 입력"); // 보호자 곁에 있는지 없는지 여부 입력
			int parents = sc.nextInt(); // 보호자 여부 저장
			
			if(parents == 1) { // parents는 1과 같으면
				System.out.println("보호자와 같이 동반탑승해주세요."); // 조건이 1과 같으면 출력
			} else if(parents == 0) { // parents는 0과 같으면
				System.out.println("다음에 보호자랑 같이 와주세요."); // parents는 0과 같으면 출력
			} else { // 예외
				System.out.println("숫자를 잘못 입력하셨습니다."); // 숫자를 잘못입력했을때 출력
			}
		}	
 
	} // End main

} // End class
