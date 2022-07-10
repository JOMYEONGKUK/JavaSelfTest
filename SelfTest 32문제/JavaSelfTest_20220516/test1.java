/*문제 1
BMI 계산 식을 만드시오 (단 몸무게와 키를 입력 받으세요) 
30이상 비만
25~30 과체중
20~25 보통
20 미만 저체중
BMI 계산 공식 
 */

import java.util.Scanner; // 스캐너 모듈 호출

// 클래스 선언, 클래스 이름 test1
public class test1 {

	// 메소드 선언(public), 정적 메소드(static), 리턴값 없음(void), 메소드 이름(main)
	public static void main(String[] args) {
		 Scanner bmiIn = new Scanner(System.in); // Scanner 사용을 위한 변수 bmiIn  선언

         System.out.println("당신의 몸무게를 입력하세요 : "); // 몸무게 입력

         float bmi1= bmiIn.nextFloat(); // 입력받은 몸무게 저장

         System.out.println("당신의 키를 미터로 입력하세요 "); // 키 입력

         float bmi2= bmiIn.nextFloat(); // 입력받은 키 저장

         float bmi = bmi1 / (bmi2*bmi2); // bmi는 bmil / bumi2*bui2

         System.out.println(bmi); // bmi 출력
         

         if(30 <= bmi) { // 30은 bmi보다 작거나 같으면
        	 System.out.println("비만입니다."); // 비만 출력
         } else if (25 <= bmi && bmi < 30) { // 25는 bmi보다 작거나 같고, bmi는 30보다 작으면
        	 System.out.println("과체중입니다."); // 과체중 출력

         } else if(20 <= bmi && bmi < 25 ){ // 20은 bmi보다 작거나 같고, bmi는 25보다 작으면
        	 System.out.println("정상입니다."); // 정상 출력

         } else { // 예외
        	 System.out.println("저체중. "); // 저체중 출력

         }
	} // End main
} // End class
