package kosta.phone; // 패키지 선언, 패키지 이름 kosta.phone

import java.util.Scanner; // 스캐너 모듈 호출

// 클래스 선언, 클래스 이름 Manager
public class Manager {

	Scanner sc = new Scanner(System.in); // Scanner 사용을 위한 스캐너 변수 sc 선언
	PhoneInfo[] arr = new PhoneInfo[10]; // Phoneinfo 클래스에 대한 10개의 객체를 만듬
	int count = 0; // 정수형 변수 count 선언 0저장
	
	// 메소드 선언, 메소드 이름 addPhone
	public void addPhone() {
		System.out.println("이름: "); // 이름 입력
		String name = sc.next(); // 입력받은 이름 저장
		System.out.println("전화번호: "); // 전화번호 입력
		String phoneNo = sc.nextLine(); // 입력받은 전화번호 저장
		System.out.println("생년월일: "); // 생년월일 입력
		String birth = sc.nextLine(); // 입력받은 생년월일 저장
		
		arr[this.count++] = new PhoneInfo(name, phoneNo, birth); // 전화번호를 추가할 때마다 각각의 객체에 데이터를 추가함
		System.out.println("전화번호가 등록되었습니다."); // 전화번호 등록 출력
	}
	
	// 메소드 선언, 메소드 이름 ListPhone
	public void listPhone() {
		// for문 시작 정수형 i선언 0저장, i는 count보다 작으면, i 증감값++
		for(int i = 0; i< this.count; i++) {
			arr[i].show(); // PhoneInfo 클래스에 대한 show() 메서드를 호출
		}
	}
	
	// 메소드 선언, 메소드 이름 searchPhone
	public void searchPhone() {
		System.out.println("이름 : "); // 이름 입력
		String name = sc.nextLine(); // 입력받은 이름을 저장
		int idx = -1; // 문자열의 위치를 알기 위해서 만든 변수입니다.
		
		// for문 시작 정수형 i선언 0저장, i는 count보다 작으면 i 증감값++
		for(int i = 0; i < count; i++) {
			PhoneInfo info = arr[i];
			if(name.equals(info.name)) { // i값은 배열의 위치를 알려줌
				info.show();
				idx = i; // 문자열의 존재여부를 확인합니다.
				break; // 멈춤
			}
		}
		
		if(idx == -1) { // idx는 -1과 같으면
			System.out.println("해당하는 정보를 찾을 수 없습니다."); // 정보를 찾을 수 없습니다. 출력
		} // End if
		
	} // End searchPhone
	
} // End class
