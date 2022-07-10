/*문제 2
 랜덤 정수 10개를 출력하고 정수 10개의 평균까지 출력하세요.
 */

// 클래스 선언, 클래스 이름 test2
public class test2 { 

	// 메소드 선언(public), 정적 메소드(static), 값을 리턴하지 않음(void), 메소드 이름(main)
	public static void main(String[] args) {
		
		int num [] = new int [10]; // 정수형 배열 변수 num 선언 10행
	    double sum = 0; // 실수형 변수 sum 선언 0저장
	        
	    System.out.print("랜덤한 정수 : "); // 랜덤 정수 10행으로 10개 출력
	        
	    // for문 시작 정수형 i선언 0저장, i는 num 길이보다 작으면, num 증감값++
	    for(int i = 0; i < num.length; i++){
	    	int x = (int)(Math.random()*10 + 1); // 정수형 x 선언 랜덤 숫자 10개
	        sum += x; // sum = sum + x
	        System.out.print(x+ " "); // 랜덤 정수 10개 출력 
	    }
	        System.out.print("\n평균은? " + sum / 10); // 평균값 출력
	 
	} // End main
} // End class
