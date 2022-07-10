/*문제 1
일한 시간을 입력받아 총 임금을 출력하는 프로그램을 작성하시오.
*/

import java.util.Scanner; // 스캐너 모듈 호출

// 클래스 선언, 클래스 이름 test1
public class test1 {

	// 메소드 선언(public), 정적 메소드(static), 값을 리턴하지 않음(void), 메소드 이름(main)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner 사용을 위한 sc 변수 선언
		
		//일한 시간을 입력받아 총 임금을 계산하는 시급계산기
		//시급은 5000원이며 8시간보다 초과 근무한 시간에 대해 1.5배 지급예정
		
		System.out.print("일한시간을 입력하세요:"); //일한 시간 입력
		int work_hour = sc.nextInt(); // 일한 시간 저장
		int work_a = 5000 * 8; // work_a 선언 5000 * 8 한 값 저장
		int usu_pay = 5000 * work_hour; // usu_pay 선언 5000 * work_hour 한 값 저장
		double over_pay = (work_hour - 8) * (5000 * 1.5d); // double 변수 over_pay 선언 work_hour - 8 * 5000 * 15.d 한 값 저장 
		
		
		// work_hour이 8보다 작거나 같으면
		if(work_hour <= 8) {
			System.out.println("총 임금은 " + usu_pay + "원 입니다." ); // 총 임금 출력
		}else { // 예외 초과임금 계산
			System.out.println("총 임금은 " + (int)(work_a +over_pay) +"원 입니다."); // 초과임금 계산
			
			
		} // End else
		
		
	} // End main

} // End class
