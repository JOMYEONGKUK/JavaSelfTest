/*문제 1
 전화번호부를 관리하는 프로그램을 만드시오.
 - 전화번호 관리프로그램 구현하자 (1명의 전화번호부)
 - 상태 : 이름, 전화번호, 생년월일
 - 기능 : 1명의 전화내역을 출력
 */

package kosta.phone; // 패키지 선언, 패키지 이름 kosta.phone

// 클래스 선언, 클래스 이름 PhoneInfo
public class PhoneInfo {

	// 필드
	String name; // 이름
	String phoneNo; // 전화번호
	String birth; // 생년월일
	
	// 기본 생성자 생성
	public PhoneInfo() {}
	
	// 메소드 선언, 메소드 이름 PhoneInfo 매개변수(문자열 name, phoneNo, birth)
	public PhoneInfo(String name, String phoneNo, String birth) {
		this.name = name; // this 생성자와 메소드의 매개 변수 이름이 필드와 동일한 경우 사용
		this.phoneNo = phoneNo; // this 생성자와 메소드의 매개 변수 이름이 필드와 동일한 경우 사용
		this.birth = birth; // this 생성자와 메소드의 매개 변수 이름이 필드와 동일한 경우 사용
	} // End PhoneInfo
	
	// 4. 전화내역을 출력할 메서드를 생성한다.
	public void show() { // 출력을 리턴값이 필요하지 않기 때문에, void를 사용한다. -> void의 사용은 입력매개변수(파라미터)가 없음과도 같다.
		System.out.println("이름 : "+name); // 이름 출력
		System.out.println("전화번호 : "+phoneNo); // 전화번호 출력
		System.out.println("생년월일 : "+birth); // 생년월일 출력
		
	} // End show
	
} // End class
