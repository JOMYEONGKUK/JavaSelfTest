/*문제 1
 do-while와 Scanner을 사용해서 계산기를 만드시오.
 */

import java.util.Scanner; // 스캐너 모듈 호출

// 클래스 선언, 클래스 이름 test1
public class test1 {

	// 메소드 선언(public), 정적 메소드(static), 리턴값 없음(void), 메소드 이름(main)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner 사용을 위한 변수 sc 선언
		
		do{ // do문 시작
		    System.out.println("첫번째 숫자를 입력하세요"); // 첫번째 숫자 입력
		    int firNum = sc.nextInt(); // 입력한 첫번째 숫자 저장
		    System.out.println("사칙연산을 입력하세요"); // 사칙연산 입력
			String buho = sc.next(); // 입력한 사칙연산 저장
		    System.out.println("두번째 숫자를 입력하세요"); // 두번째 숫자 입력
		    int secNum = sc.nextInt(); // 입력한 두번째 숫자 저장
		    
		    if("+".equals(buho)){ // 입력된 숫자가 +가 맞다면
		    	System.out.println(firNum+secNum); // 계산식 출력
		    }
		    else if("-".equals(buho)){ // 입력된 숫자가 -가 맞다면
		    	System.out.println(firNum-secNum); // 계산식 출력
		    }
		    else if("*".equals(buho)){ // 입력된 숫자가 *가 맞다면
		    	System.out.println(firNum*secNum); // 계산식 출력
		    }
		    else if("/".equals(buho)){ // 입력된 숫자가 /가 맞다면
		    	System.out.println((int)((float)firNum/secNum*100+0.5)/100f);
		    }else{ // 예외 사칙연산이 성립이 안될때
		    	System.out.println("사칙연산 아님. 종료."); // 사칙 연산이 아닐시 출력
		        break; // 반복문 탈출
		    }
		}while(true); // whie true 무한 반복문

	} // End main

} // End class
