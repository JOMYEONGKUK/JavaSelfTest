/*문제 1
키보드로 입력 받은 값들을 변수에 기록하고 저장된 변수 값을 화면에 출력하여 확인하세요.
이 때 성별이 'M'이면 남학생, 'M'이 아니면 여학생으로 출력 처리 하세요.
 */

import java.util.Scanner; // 스캐너 모듈 호출

//클래스 선언, 클래스 이름 test1
public class test1 {
	
	// 메소드 선언(public), 정적 메소드(static), 값을 리턴하지 않음(void), 메소드 이름(main)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner 사용을 위한 변수 scan 선언
		
		System.out.print("이름 : "); // 이름 입력
		String name = sc.nextLine(); // 이름 저장
		
		System.out.print("학년(숫자만) : "); // 학년 입력
		int grade = sc.nextInt(); // 학년 저장
		
		System.out.print("반(숫자만) : "); // 반 입력
		int classgrade = sc.nextInt(); // 반 저장
		
		System.out.print("번호(숫자만) : "); // 번호 입력
		int classNum = sc.nextInt(); // 번호 저장
		sc.nextLine();
		
		System.out.print("성별(M/F) : "); // 성별 입력
		char gender = sc.nextLine().charAt(0); // 성별 저장
		
		System.out.print("성적(소수점 아래 둘째 자리까지 : "); // 성적 입력
		double score = sc.nextDouble(); // 성적 저장
		
		String student = (gender == 'M') ? ("남학생") :("여학생"); // 남학생인지 여학생인지 구분
		
		System.out.println(grade + "학년 " + classgrade + "반 " + classNum + "번 " + 
		name + student + "의 성적은 " + score + "이다"); // 학년, 반, 번호, 성적 출력
		
		// 총 성적 출력
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다.", grade, classgrade, classNum, name, student, score);
		
	} // End main
} // End class