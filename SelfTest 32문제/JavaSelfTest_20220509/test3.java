/*문제 3
기본 프로그램 : 어떤 수(n)가 입력되면, 이 수를 두 소수의 곱으로 나타낼 수 있으면
두 소수를 오름차순으로 출력하고, 그렇지 않으면 "Wrong number"를 출력한다.
*/

import java.util.Scanner; // 스캐너 모듈 호출

// 클래스 선언, 클래스 이름 test3
public class test3 {

	// 메소드 선언(public), 정적 메소드(static), 값을 리턴하지 않음(void), 메소드 이름(fum), 매개변수 정수형 num
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // Scanner 사용을 위한 변수 sc 선언
		System.out.println("Enter the number: "); // 정수형 숫자 입력
		int num = sc.nextInt(); // 입력받은 숫자 저장
		boolean isPos = false; // boolean 변수 isPos 선언 false 값 저장
		int i = 1; // 정수형 i선언 1저장
		int j = 2; // 정수형 j선언 2저장
		
		while(!isPos & i < num) { // 반복문 시작 !isPos & i는 num보다 작으면
			i++; // i증감값 ++ 
			boolean Pr_i = true; // boolean 변수 Pr_i 선언 true 값 저장
			for(int n=2; n<i; n++) { // for문 시작 정수형 변수 n선언 2저장 n은 i보다 작으면 n 증감값++
				if(i % n == 0) { // i는 n으로 나누었을때 0과 같으면
					Pr_i = false; // Pr_i 값 false 저장
				}
			}
			for(j = i; j<num; j++) {  // for문 시작 정수형 변수 j선언 i저장 j는 num보다 작으면 j 증감값+
				boolean Pr_j = true; // boolean 변수 Pr_j 선언 true 값 저장
				for(int n=2; n<j; n++) { // for문 시작 정수형 변수 n선언 2저장 n은j보다 작으면 n 증감값++ 
					if(j % n == 0) { // j는 n으로 나누었을때 0과 같으면
						Pr_j = false; // Pr_j 값 false 저장
					}
				}
				if(Pr_i & Pr_i & num == i*j) { // Pr_i & Pr_i & num 은 i*j 한 값과 같으면
					isPos = true; // isPos 값 true 값 저장
					break; // 멈춤
				}
			}
		}
		if(isPos) { 
			System.out.printf("%d = %d x %d", num, j, i); // 곱셈식 값 출력
		}
		else {
			System.out.println("Wrong number"); // 곱셈이 성립이 안되면 출력
		}
	} // End main

} // End class
