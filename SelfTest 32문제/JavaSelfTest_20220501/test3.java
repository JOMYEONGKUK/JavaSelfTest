/*문제3
두 개의 주사위를 던졌을 때 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하시오.
 */

//클래스 선언, 클래스 이름 test3
public class test3 {

	// 메소드 선언(public), 정적 메소드(static), 값을 리턴하지 않음(void), 메소드 이름(main)
	public static void main(String[] args) {
		
		int sum = 6; // sum 선언 6저장
		
		// i선언 1저장 i는 6보다 작거나 같고 i 증감값++
		for(int i = 1; i<=6; i++) {
			for(int j = 6; j>0; j--) { // j선언 1저장 j는 0보다 크고 j 감소값--
				if(i + j == 6) { // i+j 한 값이 6과 같으면
					System.out.println(i + "+" + j + "=" +  (i + j)); // 식 출력
				} // End if문
			} // End 이중 for문
		} // End 첫번째 for문

	} // End main

} // End class
