/*문제 2
while문과 Scanner을 이용해서 키보드로부터 입력된 데이터로 예금, 출금, 조회, 종료
기능을 제공하는 코드를 작성해보세요.
 */

import java.util.Scanner; // 스캐너 모듈 호출

// 클래스 선언, 클래스 이름 test2
public class test2 {

	// 메소드 선언(public), 정적 메소드(static), 리턴값 없음(void), 메소드 이름(main)
	public static void main(String[] args) {
		
		boolean run = true; // boolean 타입 변수 run 선언 ture 값 저장
		int deposit = 0; // 예금 0저장
		int withdrow = 0; // 출금 0저장
		int balance = 0; // 잔고 0저장

		Scanner sc = new Scanner(System.in); // Scanner 사용을 위한 변수 sc 선언

		while(run) { // while문 시작
			System.out.println("--------------------------------"); // ---- 출력
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료"); // 예금, 출금, 잔고,종료 중 선택
			System.out.println("--------------------------------"); // ---- 출력
			System.out.print("선택> "); // 선택값 입력
			int choice = sc.nextInt(); // 입력받은 값 저장

			if(choice == 1) { // choice가 1과 같으면
				System.out.print("예금액>"); // 예금액 입력
				deposit = sc.nextInt(); // 입력받은 예금액 출력
				balance += deposit; // 입력된 예금액을 잔고에 더해줌
			} else if(choice == 2) { // choice가 2와 같으면
				System.out.print("출금액>"); // 출금액 입력
				withdrow = sc.nextInt(); // 입력받은 출금액 입력
				if(balance - withdrow < 0) { // 예금액 - 출금액이 음수일 경우
					int insuf = balance - withdrow; // int insuf 잔고 부족금액 변수
					System.out.printf("잔고 부족\n부족금액 : %d원\n", -insuf);
				} else{ // 예외 출금액을 잔고에서 빼줬을때
					balance -= withdrow; // 입력된 출금액을 잔고에서 빼준다.
				}
			} else if(choice == 3) { // choice가 3과 같으면
				System.out.println("잔고>" + balance); // 예금과 출금을 계산하고 난 잔고를 출력한다.
			} else{ // 예외 반복만 탈출
				break; // 반복문 탈출
			}
		}
		sc.close(); // 스캐너 종료
		System.out.printf("\n프로그램 종료"); // 프로그램 종료 문구 출력
	} // End main
} // End class
