/*문제 3
0보다 크거나 같고, 99보다 작거나 같은 정수가 주어질 때 다음과 같은 연산이 가능하다. 10보다 작다면 앞에 0을 붙여 두 자리 수로 만들고,
각 자리의 숫자를 더한다. 그 다음, 주어진 수의 가장 오른쪽 자리 수와 앞에서 구한 합의 오른쪽 자리 수를 이어 붙이면 새로운 수를 만들 수 있다.
예) 26부터 시작한다. 2+6 = 8이다. 새로운 수는 68이다.
6+8 = 14이다. 새로운 수는 84이다. 8+4 = 12이다.
새로운 수는 42이다. 4+2 = 6이다. 새로운 수는 26이다.
위의 예는 4번만에 원래 수로 돌아올 수 있다.
따라서 26의 사이클의 길이는 4이다. N이 주어졌을 때,
N의 사이클의 길이를 구하는 프로그램을 작성하시오.
 */

import java.util.Scanner; // 스캐너 모듈 호출

// 클래스 선언, 클래스 이름 test3
public class test3 {

	// 메소드 선언(public), 정적 메소드(static), 값을 리턴하지 않음(void), 메소드 이름(main)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner 사용을 위한 sc 변수 선언
		
		int N; // 변수 N 선언
		int tenth=0, units=0, sum=0; // 변수 tenth 십의자리, units 일의자리, sum 더한값
		int count=0; // count 선언 0저장
		
		System.out.println("정수를 입력해주세요: "); // 정수 입력
		N = sc.nextInt(); // 입력받은 정수 저장
		
		tenth = N / 10; // 십의자리 숫자 분리
		units = N % 10; // 일의자리 숫자 분리
		
		do { // do문 시작
			sum = tenth + units; // 십의자리와 일의자리 더하기
			tenth = units; // 일의자리를 십의자리로
			units = sum % 10; // '더한값의 일의자리'를 일의자리로
			count++; // count 증감값++
		}while(N!=(tenth*10 + units)); // 조건이 맞을시 탈출
		
		System.out.println(count); // count 출력
	} // End main

} // End class
