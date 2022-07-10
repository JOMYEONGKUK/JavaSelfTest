/*문제2
정수로 된 돈의 액수를 입력받아 5만원 1만 5천원 1천원 500원 100원 50원 1원 으로
각 몇개씩 변환 되는지를 출력하라.
 */

import java.util.Scanner; // 스캐너 모듈 호출

//클래스 선언, 클래스 이름 test2
public class test2 {

	// 메소드 선언(public), 정적 메소드(static), 값을 리턴하지 않음(void), 메소드 이름(main)
	public static void main(String[] args) {
		
		// 변수 11개 선언
		int num, res, res2, res3, res4, res5, res6, res7, res8, res9, totalNum;
		
		Scanner sc = new Scanner(System.in); // Scanner 사용을 위한 변수 sc 선언
		System.out.println("바꾸고 싶은 액수를 입력하세요: "); // 액수 입력
		num = sc.nextInt(); // 액수 저장
		totalNum = num;
		
		res = totalNum / 50000; // totalNum 나눈값 저장
		totalNum = totalNum - (res * 50000);
		System.out.println("5만원 갯수 = " + res);
		
		res2 = totalNum / 10000; // totalNum 나눈값 저장
		totalNum = totalNum - (res * 10000); 
		System.out.println("1만원 갯수 = " + res2);
		
		res3 = totalNum / 5000; // totalNum 나눈값 저장
		totalNum = totalNum - (res * 5000); 
		System.out.println("5천원 갯수 = " + res3);
		
		res4 = totalNum / 1000; // totalNum 나눈값 저장
		totalNum = totalNum - (res * 1000); 
		System.out.println("1천원 갯수 = " + res4);
		
		res5 = totalNum / 500;  // totalNum 나눈값 저장
		totalNum = totalNum - (res * 500);
		System.out.println("500원 갯수 = " + res5);
		
		res6 = totalNum / 100;  // totalNum 나눈값 저장
		totalNum = totalNum - (res * 100);//
		System.out.println("100원 갯수 = " + res6);
		
		res7 = totalNum / 50; // totalNum 나눈값 저장
		totalNum = totalNum - (res * 50);  
		System.out.println("50원 갯수 = " + res7);
		
		res8 = totalNum / 10; // totalNum 나눈값 저장
		totalNum = totalNum - (res * 10); 
		System.out.println("10원 갯수 = " + res8);
		
		res9 = totalNum / 1; // totalNum 나눈값 저장
		totalNum = totalNum - (res * 1);
		System.out.println("1원 갯수 = " + res9);

	}

}
