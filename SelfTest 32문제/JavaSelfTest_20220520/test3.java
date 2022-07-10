/*문제 3
다중 if문을 사용하여 음식 주문 프로그램을 작성하시오.
 */

import java.io.IOException; // IOException 모듈 호출

//클래스 선언, 클래스 이름 test3
public class test3 {

	// 메소드 선언(public), 정적 메소드(static), 값을 리턴하지 않음(void), 메소드 이름(main)
	public static void main(String[] args) throws IOException {
		
		System.out.println("먹고 싶은 메뉴를 고르세요."); // 먹고 싶은 메뉴를 고르세요. 출력 
		System.out.println("1.짜장, 2.짬뽕, 3.탕수육, 4.팔보채"); // 메뉴 4가지 출력
		System.out.print("메뉴: "); // 메뉴 입력
		
		int menu=System.in.read()-48; // 입력된 메뉴 저장
		
		if(menu == 1){ // menu는 1과 같으면
			System.out.println("짜장면을 주문하셨습니다."); // 짜장면
		}else if(menu == 2){ // menu는 1과 같으면
			System.out.println("짬뽐을 주문하셨습니다."); // 짬뽕
		}else if(menu == 3){ // menu는 1과 같으면
			System.out.println("탕수육을 주문하셨습니다."); // 탕수육
		}else if(menu == 4){ // menu는 1과 같으면
			System.out.println("팔보채를 주문하셨습니다."); // 팔보채
		}else{ // 잘못 주문 시켰을때 예외
			System.out.println("잘못 주문시켰습니다"); // 잘못 주문 시켰을때 출력
		}
	} // End main
} // End class
