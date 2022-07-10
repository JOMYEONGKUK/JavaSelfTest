/*문제 2
3명의 사람의 이름을 입력 받아서 배열에 저장한뒤 입력 받은 값을 출력하세요.
*/

import java.util.Scanner; // 스캐너 모듈 호출

// 클래스 선언, 클래스 이름 test2
public class test2 {

	// 메소드 선언(public), 정적 메소드(static), 값을 리턴하지 않음(void), 메소드 이름(main)
	public static void main(String[] args) {
                   
		String[] names = new String[3]; // 문자열 배열 names 선언 3열 저장
        int size = names.length; // size 선언 names 길이 저장

        Scanner put = new Scanner(System.in); // Scanner 사용을 위한 put 변수 선언

        // i선언 0저장, i는 size보다 작으면, i 증감값++
        for(int i=0; i<size; i++){
        	System.out.print("이름을 입력하세요. "); // 이름 입력
        	names[i] = put.next(); // 입력받은 이름 저장
       
        } // End 첫번째 for문
        
        // i선언 0저장, i는 size보다 작으면, i 증감값++
        for(int i=0; i<size; i++){
        	System.out.println("이름: " +names[i]); // 입력받은 이름 배열형식으로 출력

     } // End 두번째 for문

   } // End main

} // End class
