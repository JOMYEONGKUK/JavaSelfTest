/*문제 1
이중 for문을 이용해서 1부터 20사이의 2,3,4,5 배수 출력
*/

// 클래스 선언, 클래스 이름 test1
public class test1 {

	// 메소드 선언(public), 정적 메소드(static), 값을 리턴하지 않음(void), 메소드 이름(main)
	public static void main(String[] args) {
		
		// num 선언 2저장 num은 5보다 작거나 같고 num 증감값++
		for(int num = 2; num <= 5; num++) {
			System.out.printf("%d의 배수 :", num);  // 2345 배수 출력 
			// i 선언 1저장 i는 20보다 작거나 같고 i 증감값++
			for(int i = 1; i <= 20; i++) {
				if(i % num != 0) { // i는 num과 안나눠지면
					continue; // 건너뜀
				}
				System.out.printf("%4d", i); // 4자리 공간 확보하고 출력
			}
			System.out.println(); // 배수마다 밑으로 한칸씩 내려서 출력
		} // End for문	

	} // End main

} // End class
