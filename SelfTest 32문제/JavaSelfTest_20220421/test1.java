/*문제 1
0 ~ 10까지 더한 값을 출력하세요.
*/

// 클래스 선언, 클래스 이름 test1
public class test1 {
	
	// 메소드 선언(public), 정적 메소드(static), 값을 리턴하지 않음(void), 메소드 이름(main)
	public static void main(String[] args) {
		
		int sum = 0; // 정수형 변수 sum 선언 0저장
		for(int i=0; i<11; i++)  { // 정수형 변수 i가 0인데 i는 11보다 작은거
			sum += i; // 왼쪽 변수 sum에서 오른쪽 값을 더하고 결과값
		}
		System.out.println("더한 총 결과값:"+sum); // 콘솔에 출력되는 실행문
	} // End main

} // End class
