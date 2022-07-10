/*문제 3
if else 문을 이용 해서 컴퓨터와 가위 바위 보 를 하는 프로그램을 만드시오.
 */

import java.util.Scanner; // 스캐너 모듈 호출

// 클래스 선언, 클래스 이름 test3
public class test3 {

	// 메소드 선언(public), 정적 메소드(static), 값을 리턴하지 않음(void), 메소드 이름(main)
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in); // Scanner 사용을 위한 변수 sc 선언
	    String str[] = {"가위", "바위", "보"}; // 문자열 배열 변수 str 선언 가위 바위 보 저장
	    System.out.println("컴퓨터와 가위 바위 보 게임을 합니다."); // 게임시작 문구 출력
	        
	    while(true){ // while true 무한반복 시작 
	    	int n = (int)(Math.random()*3); // 정수형 변수 n선언 랜덤
	        System.out.print("가위 바위 보: "); // 가위바위보 입력
	        String pstr = in.next(); // 입력받은 가위바위보 저장
	        
	        if(pstr.equals("그만")){ // pstr이 참이면 그만
	        	System.out.print("게임을 종료합니다."); // 게임 종료 출력
	            break; // 반복문 탈출
	        }
	        if(str[n].equals(pstr)){ // str n이 pstr과 같으면
	        	System.out.println("컴퓨터 = " + str[n] + ", 사용자 = " + pstr + ", 비겼습니다."); // 비겼을때 문구 출력
	        }
	        else {
	        	if(str[n].equals("바위")){ // str n 랜덤값이 바위 면
	        		if(pstr.equals("보")){ // ptst 값이 보 이면
	        			System.out.println("컴퓨터 = " + str[n] + ", 사용자 = " + pstr + ", 이겼습니다."); // 승리 문구 출력
	                    }
	                    else{
	                        System.out.println("컴퓨터 = " + str[n] + ", 사용자 = " + pstr + ", 졌습니다."); // 패배 문구 출력
	                    }
	                }
	                else if(str[n].equals("가위")){ // str n 랜덤값이 가위 면
	                    if(pstr.equals("바위")){ // ptst 값이 바위 이면
	                        System.out.println("컴퓨터 = " + str[n] + ", 사용자 = " + pstr + ", 이겼습니다.");  // 승리 문구 출력
	                    } 
	                    else{
	                        System.out.println("컴퓨터 = " + str[n] + ", 사용자 = " + pstr + ", 졌습니다."); // 패배 문구 출력
	                    }
	                }
	                else if(str[n].equals("보")){ // str n 랜덤값이 보 이면
	                    if(pstr.equals("가위")){ // ptst 값이 가위 이면
	                        System.out.println("컴퓨터 = " + str[n] + ", 사용자 = " + pstr + ", 이겼습니다."); // 승리 문구 출력
	                    }
	                    else{
	                        System.out.println("컴퓨터 = " + str[n] + ", 사용자 = " + pstr + ", 졌습니다."); // 패배 문구 출력
	                    }
	                }
	            }

	       }
	        
	  } // End main
} // End class
