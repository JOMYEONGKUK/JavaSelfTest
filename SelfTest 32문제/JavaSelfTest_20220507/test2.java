/*문제2
차번호(Carnumber) 입력 시 각 요일별 끝자리에 따라 승용차 요일제가 있다. 요일을 출력하는 프로그램 작성하기
 */

import java.util.Scanner; // 스캐너 모듈 호출

//클래스 선언, 클래스 이름 test2
public class test2 {

	// 메소드 선언(public), 정적 메소드(static), 값을 리턴하지 않음(void), 메소드 이름(main)
	public static void main(String[] args) {
		
		System.out.println("차량번호를 입력하세요: "); // 차량번호 입력:
	    Scanner sc = new Scanner(System.in);  	// Scanner 사용을 위한 변수 sc 선언
	    int number = sc.nextInt(); // 차량번호 저장 
	    
	    // num % 10한 값이 1과 6과 같으면
	    if((number%10)==1 |(number%10)==6) {
	    	System.out.println("월요일");
	    	// num % 10한 값이 2와 7과 같으면
	    } else if((number%10)==2 |(number%10)==7) {
	        System.out.println("화요일");
	     // num % 10한 값이 3과 8과 같으면
	    } else if((number%10)==3 |(number%10)==8) {
	        System.out.println("수요일");
	     // num % 10한 값이 4와 9와 같으면
	    } else if((number%10)==4 |(number%10)==9) {
	        System.out.println("목요일");
	     // num % 10한 값이 5와 0과 같으면
	    } else if((number%10)==5 |(number%10)==0) {
	        System.out.println("금요일");
	        }
	    
	   } // End main
	 
} // End class




