/*문제 3
그림과 같이 대시('-') 문자로 구성된 형태의 숫자를 주어진 숫자와 같이 출력하고 싶을 때 사용되게 되는 대시의 개수를 출력하는 프로그램을 작성하시오.
 */

import java.util.Scanner; // 스캐너 모듈 호출

//클래스 선언, 클래스 이름 test3
public class test3 {

	// 메소드 선언(public), 정적 메소드(static), 값을 리턴하지 않음(void), 메소드 이름(main)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Scanner 사용을 위한 변수 sc 선언
		System.out.print("첫자리 0을 제외한 숫자를 입력해주세요: "); // 숫자 입력
		int num = sc.nextInt(); //입력받은 숫자 저장
		System.out.print("대시('-')의 총합: "); // 대시('-')의 총합 출력
		System.out.println(Number(num)); // num 값 출력
		

		}
	
		// 메소드 선언(public), 정적 메소드(static), 메소드 이름(Number)
		public static int Number(int num) {
			int result = 0; // 정수형 변수 result 선언 0저장
			int[] arr = {6,2,5,5,4,5,6,4,7,6}; // 정수형 배열 변수 arr 선언 6,2,5,5,4,5,6,4,7,6 값 저장
			while(num>0) { // 반목문 시작 num은 0보다 크면
				int num2 = num%10; // 정수형 변수 num2 선언, num%10 한 값 저장
				num/=10; // num = num / 10
				result+=arr[num2]; 
		}	return result; // result 리턴
	}
}
