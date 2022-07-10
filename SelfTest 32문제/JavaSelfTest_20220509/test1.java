/*문제 1
어떤 수 n이 입력되면 n의 각 자릿수의 합이 한 자리가 될 때까지
계산하여 출력하는 프로그램을 작성하세요.
 */

import java.util.Scanner; // 스캐너 모듈 호출

// 클래스 선언, 클래스 이름 test1
public class test1 {

	// 메소드 선언(public), 정적 메소드(static), 값을 리턴하지 않음(void), 메소드 이름(fum), 매개변수 정수형 num
	public static void fun(int num) {
		
		while(num >= 10) { // 반복문 시작 num은 10보다 크거나 같으면
			int sum = 0; // 정수형 변수 sum 선언 0저장
			int n = 1; // 정수형 변수 n선언 1저장
			while(num > n) { // 반복문 시작 num은 n보다 크면
				sum += num/n%10; // sum = sum + num/n%10
				System.out.printf("+ %d", num/n%10); // 식 출력
				n *= 10;
			}
			System.out.printf("= %d\n", sum); // 합계 출력
			num = sum; // num에 sum 변수 저장
		}

	}
	
	// 메소드 선언(public), 정적 메소드(static), 값을 리턴하지 않음(void), 메소드 이름(main)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Scanner 사용을 위한 변수 sc 선언
		System.out.println("Enter the number: "); // 숫자 입력
		int num = sc.nextInt(); // 입력받은 숫자를 저장
		fun(num);
	}

}
