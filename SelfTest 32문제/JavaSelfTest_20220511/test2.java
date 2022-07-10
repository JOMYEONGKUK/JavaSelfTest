/*문제 2
아래와 같이 학생들의 성적 정보가 문자열로 선언되어 있을 때, 각 성적 별 학생 수를 출력하시오.
String score = "A,A,B,C,D,A,C,D,D,D,F
 */

// 클래스 선언, 클래스 이름 test2
public class test2 {

	// 메소드 선언(public), 정적 메소드(static), 값을 리턴하지 않음(void), 메소드 이름(main)
	public static void main(String[] args) {
		
		// 문자열 변수 score 선언, A,A,C,D,A,C,D,D,D,F 값 저장
		String score = "A,A,B,C,D,A,C,D,D,D,F";
		int a = 0; // 정수형 변수 a 선언 0저장
		int b = 0; // 정수형 변수 b 선언 0저장
		int c = 0; // 정수형 변수 c 선언 0저장
		int d = 0; // 정수형 변수 d 선언 0저장
		int f = 0; // 정수형 변수 f 선언 0저장
		
		String[] score2 = score.split(",");
		
		// for문 시작 정수형 i선언 0저장, i는 score2 길이보다 작으면, i 증감값++
		for (int i = 0; i < score2.length; i++) {
			if (score2[i].equals("A")) { // score2[i]값이 A면
				a++; // a 증감값++
			} else if (score2[i].equals("B")) { // score2[i]값이 B면
				b++; // b 증감값++ 
			} else if (score2[i].equals("C")) { // score2[i]값이 C면
				c++; // c 증감값++
			} else if (score2[i].equals("D")) { // score2[i]값이 D면
				d++; // d 증감값++
			} else { // 예외
				f++; // f 증감값++
			}

		}
		System.out.println("A : " + a + "명"); // A 학생 수 출력
		System.out.println("B : " + b + "명"); // B 학생 수 출력
		System.out.println("C : " + c + "명"); // C 학생 수 출력
		System.out.println("D : " + d + "명"); // D 학생 수 출력
		System.out.println("F : " + f + "명"); // F 학생 수 출력
	} // End main
} // End class