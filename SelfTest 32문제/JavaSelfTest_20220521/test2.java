/*문제 2
다섯 개의 자연수가 있다. 이 수의 적어도 대부분의 배수는 위의 수 중 적어도 세 개로 나누어 지는 가장 작은 자연수이다.
서로 다른 다섯 개의 자연수가 주어질 때, 적어도 대부분의 배수를 출력하는 프로그램을 작성하시오.
입력 : 첫째 줄에 다섯 개의 자연수가 주어진다. 100보다 작거나 같은 자연수이고, 서로 다른 수이다.
출력 : 첫째 줄에 적어도 대부분의 배수를 출력한다.
 */

import java.util.Scanner; // 스캐너 모듈 호출

//클래스 선언, 클래스 이름 test2
public class test2 {

	// 메소드 선언(public), 정적 메소드(static), 값을 리턴하지 않음(void), 메소드 이름(main)
	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in); // Scanner 사용을 위한 sc 변수 선언
        int SIZE = 5; // SIZE 선언 5개의 자연수
        
        int[] arr = new int[SIZE]; // 배열 변수 arr선언
        int min = 100; // min 선언 100 저장

        // i선언 0저장, i는 SIZE보다 작으면, i 증감값++
        for(int i = 0; i < SIZE; i++) {
            arr[i] = sc.nextInt(); // 배열 변수에 for문값 저장

            if (min > arr[i]) { // min이 arr[i]보다 작으면
                min = arr[i]; // min 변수에 arr[i] 저장
            } // End if
        } // End for

        int cnt = 0; // cnt 선언 0저장
        
        while(true) {  // 무한반복 시작 나올 수 있는 가장 큰 값은 실질적으로 100 * 99 * 98 = 970,200
        	 // i선언 0저장, i는 SIZE보다 작으면, i 증감값++
            for(int i = 0; i < SIZE; i++) {
            	// min을 arr[i]로 나눴을때 0과 같은거 cnt 증감값++
                if(min % arr[i] == 0) cnt++;
            } // End for

            // 적어도 세 개의 자연수로 나누어지는 경우 반복문 탈출
            if(cnt >= 3) break;

            cnt = 0; // cnt 변수에 0 저장
            min++; // min 증감값 ++
        
        } // End while(true)

        System.out.println(min); // min 출력 
    
	} // class main

} // class