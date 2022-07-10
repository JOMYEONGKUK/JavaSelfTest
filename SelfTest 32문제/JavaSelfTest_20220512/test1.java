/*문제 1
월급을 적고 10년동안 월급을 모두 저금할 경우 얼마나 모을 수있는지 출력하세요. 
 */

import java.util.Scanner; // 스캐너 모듈 호출

// 클래스 선언, 클래스 이름 test1
public class test1 {

	// 메소드 선언(public), 정적 메소드(static), 값을 리턴하지 않음(void), 메소드 이름(main)
	public static void main(String[] args) {
		
		int salary; // 정수형 변수 salary 선언
	    int YEAR = 10; // 정수형 변수 YEAR 선언 10저장
	       
	    Scanner input = new Scanner(System.in); // Scanner 사용을 위한 변수 sc 선언
	    System.out.print("월급을 입력하세요: "); // 월급 입력:
	    salary = input.nextInt()*YEAR*12; // 입력받은 월급 저장
	    
	    System.out.println(YEAR+"년 동안의 저축액 : "+salary); // 10년 동안의 저축액 출력
	 
	} // End main
} // End class
