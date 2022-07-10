/*문제 3
중첩 for문을 이용하여 방정식 4x + 5y = 60의 모든 해를 구해서 (x, y) 형태로 출력하시오. 
단, x와 y는 10이하의 자연수입니다.
 */

// 클래스 선언, 클래스 이름 test3
public class test3 {

	// 메소드 선언(public), 정적 메소드(static), 리턴값 없음(void), 메소드 이름(main)
	public static void main(String[] args) {
		// for문 시작 정수형 변수 i선언 1저장, i는 10보다 작거나 같으면, i 증감값++
		for(int i = 1; i <= 10; i++) {
			// 이중 for문 시작 정수형 변수 j선언 1저장, j는 10보다 작거나 같으면, j 증감값++
			for(int j = 1; j <= 10; j++) {
				int cal = 4 * i + 5 * j; // 정수형 변수 cal 선언 4 * i + 5 * j 한 값 저장
				if(cal == 60) { // cal은 60과 같으면
					System.out.printf("(%d, %d)\n", i, j); // x, y값 출력
				
				} // End if문
			} // End 이중 for문
		} // End 첫번째 for문
	} // End main
} // End class
