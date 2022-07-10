/*문제2
8칸 크기의 배열을 선언하고 랜덤 수로 초기화 한 후 가장 큰수와 작은 수를 각각 출력하시오.
 */

import java.util.Arrays; // 어레이 모듈 호출
import java.util.Random; // 랜덤 모듈 호출

//클래스 선언, 클래스 이름 test2
public class test2 {

	// 메소드 선언(public), 정적 메소드(static), 값을 리턴하지 않음(void), 메소드 이름(main)
	public static void main(String[] args) {
		
		// 1차원 배열 선언 
		int[] arr = new int[8];
		Random random = new Random(); // 랜덤
		
		int max = 0; // max 선언 0저장
		int min = 0; // min 선언 0저장
		
		// i선언 0저장 i는 arr길이보다 작고 i 증감값++
		for(int i=0; i<arr.length; i++) {
			arr[i] = random.nextInt(100);
		}
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr);
		System.out.println("가장 큰 값: "+arr[7]); // 가장 큰 값 출력
		System.out.println("가장 작은 값: "+arr[0]); // 가장 작은 값 출력

	} // End main

} // End class
