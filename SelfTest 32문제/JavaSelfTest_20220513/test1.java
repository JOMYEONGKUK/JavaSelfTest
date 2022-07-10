/*문제 1
 10개의 정수를 입력받아 짝수의 합과 홀수의 합을
 각각 출력하는 프로그램을 만드시오.
 */

import java.util.Scanner; // 스캐너 모듈 호출

// 클래스 선언, 클래스 이름 test1
public class test1 {

	// 메소드 선언(public), 정적 메소드(static), 리턴값 없음(void), 메소드 이름(main)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner 사용을 위한 변수 sc 선언

		// 정수형 배열 변수 arr 선언 크기 10 저장
		int[] arr = new int[10];

		// for문 시작 정수형 변수 i선언 1저장, i는 10보다 작거나 같으면, i 증감값++
		for(int i = 1; i <= 10; i++) {
			System.out.printf("정수를 입력해주세요 %d 's num: ", i); // 정수 입력
			arr[i - 1] = sc.nextInt(); // 입력받은 정수 저장
			System.out.println(); // 한칸 줄바꿈
		} // End for문

		// 짝수와 홀수의 각 총합을 저장할 변수
		int even = 0;
		int odd = 0;

		// 짝수와 홀수로 나눠 저장할 배열(몇 개가 입력될지 모르므로 크기는 각 10개로 지정)
		int[] evenArr = new int[10];
		int[] oddArr = new int[10];

		// 배열에 저장된 값을 불러올 인덱스
		int arrIndex = 0; // 정수형 변수 arrIndex 선언 0저장 
		int evenIndex = 0; // 정수형 변수 evenIndex 선언 0저장
		int oddIndex = 0; // 정수형 변수 oddIndex 선언 0저장

		while(arrIndex < 10) { // 반복문 시작 arrIndex가 10보다 작으면

			// 저장된 값이 arr인덱스 값이 짝수이면
			if(arr[arrIndex] % 2 == 0) {
				evenArr[evenIndex] = arr[arrIndex]; // 짝수 배열에 저장
				even += arr[arrIndex]; // 짝수 총합에 누적
				arrIndex++; // arr인덱스 값 증감값++
				evenIndex++;  // even인덱스값 증감값++

			// 예외 저장된 값이 홀수일 때
			} else {
				oddArr[oddIndex] = arr[arrIndex]; // 홀수 배열에 저장
				odd += arr[arrIndex]; // 홀수 총합에 누적
				arrIndex++; // arr인덱스 값 증감값++
				oddIndex++; // even인덱스값 증감값++

			} // End else

		} // End while

		System.out.println("< 짝수 >"); // 짝수 제목 출력
		// for문 시작 정수형 i선언 0저장, i는 10보다 작으면, i 증감값++
		for(int i = 0; i < 10; i++) {
			if(evenArr[i] == 0) // 짝수 배열값이 0과 같으면
				break; // 멈춤
			System.out.print(evenArr[i] + " "); // 짝수 배열 형식으로 출력
		}
		System.out.println("\n 짝수의 총합: " + even);

		System.out.println(); // 한칸 줄바꿈

		System.out.println("< 홀수 >"); // 홀수 제목 출력
		// for문 시작 정수형 i선언 0저장, i는 10보다 작으면, i 증감값++
		for(int i = 0; i < 10; i++) {
			if(oddArr[i] == 0) // 홀수 배열값이 0과 같으면 
				break;// 멈춤
			System.out.print(oddArr[i] + " "); // 홀수 배열 형식으로 출력
		}
		System.out.println("\n 홀수의 총합: " + odd); // 홀수의 총합 출력

		sc.close(); // Scanner 종료

	} // End main

} // End class