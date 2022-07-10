/*문제2
사용자로부터 세 개의 숫자 입력 가장 큰 숫자 출력
입력값이 셋다 같을 경우 숫자를 다시 입력하세요 출력값을 나오게 하라.
 */

import java.util.Scanner; // 스캐너 모듈 호출

//클래스 선언, 클래스 이름 test2
public class test2 {

	// 메소드 선언(public), 정적 메소드(static), 값을 리턴하지 않음(void), 메소드 이름(main)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner 사용을 위한 변수 sc 선언
		System.out.println("첫번째 숫자 입력: "); // 첫번째 숫자 입력
		int num1 = sc.nextInt(); // 첫번째 숫자 저장
		
		Scanner sc1 = new Scanner(System.in); // Scanner 사용을 위한 변수 sc2 선언
		System.out.println("두번째 숫자를 입력: "); // 두번째 숫자 입력
		int num2 = sc1.nextInt(); // 두번째 숫자 저장
		
		Scanner sc2 = new Scanner(System.in); // Scanner 사용을 위한 변수 sc2 선언
		System.out.println("세번째 숫자를 입력: "); // 세번째 숫자 입력
		int num3 = sc2.nextInt(); // 세번째 숫자 저장
		
		if(num1 > num2 && num1 > num3) { // num1이 num2 num3 보다 크면
			System.out.println("가장 큰 숫자는 첫번째 숫자인" +num1+" 입니다.");
		} else if(num2 > num1 && num2 > num3) { // num2가 num1 num2 보다 크면
			System.out.println("가장 큰 숫자는 첫번째 숫자인" +num2+" 입니다.");
		} else if(num3 > num1 && num3 > num2) { // num3가 num1 num2 보다 크면
			System.out.println("가장 큰 숫자는 첫번째 숫자인" +num3+" 입니다.");
		} else {
			System.out.println("숫자를 다시 입력해주세요."); // 숫자를 다시 입력해주세요. 출력
		}
	} // End main
	

} // End class
