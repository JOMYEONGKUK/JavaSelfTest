/*문제3
디지털 시계는 하루 동안 시 분의 형식으로 표시됩니다.
하루동안 3이 표시되는 시간이 몇초인지 구한느 프로그램을 작성하세요.
 */

//클래스 선언, 클래스 이름 test3
public class test3 {

	// 메소드 선언(public), 정적 메소드(static), 값을 리턴하지 않음(void), 메소드 이름(main)
	public static void main(String[] args) {
		
		int count = 0; // count 선언 0저장
		
		// i선언 0저장 i는 23보다 작거나 같고 i 증감값++
		for(int i=0; i<=23; i++) {
			for(int j=0; j<=59; j++) {
				int num1 = i%10; // num1 선언
				int num2 = j/10; // num2 선언
				int num3 = j%10; // num3 선언
				
				if(num1 == 3 || num2 == 3 || num3 == 3) {
					count++;
				}
			}
		}
		System.out.println(count);
		
	} // End main

} // End class
