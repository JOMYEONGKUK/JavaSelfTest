/*문제 2
for문을 이용해서 12의 약수를 구하시오.
*/

// 클래스 선언, 클래스 이름 test2
public class test2 {

	// 메소드 선언(public), 정적 메소드(static), 값을 리턴하지 않음(void), 메소드 이름(main)
	public static void main(String[] args) {
		
		int sum=0; // 정수형 변수 sum 선언 0저장
		for(int i=0; i<11; i++) { // 정수형 변수 i가 0인데 i는 11보다 작은거
			if(i % 2!=0) { // i는 2로 안나눠지면
				System.out.println(i+""); // 홀수 출력
				sum += i; // 왼쪽 변수 sum에서 오른쪽 값을 더하고 결과값
			}
		}
		System.out.println(); // 밑으로 한칸 줄바꿈
		System.out.println("1~10의 홀수의 합:" +sum); // 1부터 10까지 홀수의 합 출력
	} // End main

} // End class
