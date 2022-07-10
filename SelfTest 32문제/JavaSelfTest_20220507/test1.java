/*문제1
 다음은 회문수를 구하는 프로그램이다. 회문수란, 숫자를 거꾸로 읽어도 앞으로 읽는 것과 같은 수를 말한다. 예를 들면
  '12321'이나 '13531'같은 수를 말한다. (1)에 알맞은 코드를 넣어서 프로그램을 완성하시오.
 */
 
import java.util.Scanner; // 스캐너 모듈 호출

//클래스 선언, 클래스 이름 test1
public class test1 {

	// 메소드 선언(public), 정적 메소드(static), 값을 리턴하지 않음(void), 메소드 이름(main)
	public static void main(String[] args) {
		
		// Scanner 사용을 위한 변수 sc 선언
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요: "); // 숫자 입력
		int number = sc.nextInt(); // 숫자 저장 
		
			int temp = number; // temp 선언
			
			int result = 0; // result 선언 0저장 
			
			while(temp != 0) { // 반복문 시작 temp는 0과 다르면
				result = result * 10 + temp % 10;
				temp /= 10;
			}
			if(number == result) { // number은 result와 같으면
				System.out.println(number + "는 회문수 입니다.");
			} else {
				System.out.println(number + "는 회문수가 아닙니다.");
			}

	} // End main

} // End class
