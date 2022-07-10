/*문제 2
하나의 숫자를 입력받아 2와 3의 배수가 아니면 계속 while문을 돌고
2와 3의 배수이면 프로그램 종료하기 while문 사용
 */

import java.util.Scanner; // 스캐너 모듈 호출

// 클래스 선언, 클래스 이름 test2
public class test2 {

	// 메소드 선언(public), 정적 메소드(static), 리턴값 없음(void), 메소드 이름(main)
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); // Scanner 사용을 위한 변수 scanner 선언
	    System.out.print("하나의 정수를 입력하세요: "); // 하나의 정수 입력
	    int num = scanner.nextInt(); // 입력된 정수 저장
	            
	    while(true) { // while true 무한반복 시작
	    	if(num%2 == 0 && num%3 == 0) { // num을 2로 나눠지고 &&(and) num이 3으로 나눠지면
	    		System.out.println(num +"은" + "2와 3의 배수입니다."); // 조건이 참이면 출력
	            System.out.println("프로그램 종료!"); // 조건이 참이면 프로그램 종료! 출력
	            break; // 반복문 탈출
	     }
	            
	     System.out.println(num +"은" + "2와 3의 배수가 아닙니다."); // 조건이 참이 아니면 출력
	     System.out.print("하나의 정수를 입력하세요: "); // 2와 3의 배수를 입력하지 않았을때 출력 
	     num = scanner.nextInt(); //하나의 정수 입력
	            }
	            
	     scanner.close(); // scanner 종료
	        
	  } // End main
	 
} // End class
