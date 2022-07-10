/*문제 1
 1차원의 점들이 주어졌을 때, 그 중 가장 거리가 짧은 점(index)들을 출력하시오.
(단, 점들 사이의 거리는 모두 다르다.)
 */

// 클래스 선언, 클래스 이름 test1
public class test1 {
	
	// 메소드 선언(public), 정적 메소드(static), 값을 리턴하지 않음(void), 메소드 이름(main)
	public static void main(String[] args) {
		int[] point = {92,32,52,9,81,2,68}; // 정수형 배열 변수 point 선언 92,38,52,9,81,2,68 저장
		
		int min =Math.abs(point[0]-point[1]); // 정수형 변수 min 선언
		
		int a = 0; // 정수형 변수 a 선언 0저장
		int b = 0; // 정수형 변수 b 선언 0저장
		
		// for문 시작 정수형 변수 i선언 0저장 i는 point 길이보다 작으면, i 증감값++
		for(int i = 0;i<point.length;i++) {
			// 이중 for문시작 정수형 변수 j선언 0저장 i는 point 길이보다 작으면, j 증감값++
			for(int j = 0; j<point.length;j++) {
				if(i != j) { // i는 j와 다르면
					if(min>Math.abs(point[i]-point[j])) { // min은 Math.abs보다 크면
						min=Math.abs(point[i]-point[j]); // min 변수에 Math.abs 값 저장
						a=i; // a는 i값 저장
						b=j; // b는 j 값 저장
					}
				}
			}
			
		}System.out.print("result = ["+a+","+b+"]"); // 가장 거리가 짦은 점 출력
	
	} // End main
} // End class