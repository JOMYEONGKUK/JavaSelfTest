/*문제3
사용자에게 입력 받아 배열의 인덱스 수만큼 별을 출력해보세요.
 */

import java.util.Scanner; // 스캐너 모듈 호출

//클래스 선언, 클래스 이름 test3
public class test3 {

	// 메소드 선언(public), 정적 메소드(static), 값을 리턴하지 않음(void), 메소드 이름(main)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner 사용을 위한 변수 sc 선언
		int[] arr = new int[5]; // 배열 변수 arr 선언
		
		// i선언 0저장, i는 arr길이보다 작고 i 증감값++
		for(int i=0; i<arr.length; i++) {
			System.out.println(i+"번째 별의 수: "); // 별의수 입력
			arr[i] = sc.nextInt(); // 별의수 저장
		}
		// i선언 0저장, i는 arr길이보다 작고 i 증감값++
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]+" : "); // arr 출력
			// j선언 0저장, j는 arr길이보다 작고 j 증감값++
			for(int j=0; j<arr.length; j++) {
				System.out.println("*"); // 별
			} System.out.println(); // 한칸 줄바꿈
		}
	} // End main

} // End class
