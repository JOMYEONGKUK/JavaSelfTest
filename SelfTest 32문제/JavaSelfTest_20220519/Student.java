/*문제 1
학생이 학교에 가기 위해 수행하는 여러 과정을 객체 지향 프로그램으로 만들 수 있다.
이 예제에서는 학생이 버스, 지하철, 택시를 타고 가는 것을 객체 지향 프로그래밍으로 작성하시오.
 */

package cooperation; // 패키지 선언, 패키지 이름 cooperation

// 클래스 선언, 클래스 이름 Student
public class Student {
	
	public String studentName; // 학생 이름
	public int money; 		   // 학생이 가지고 있는 돈
	
	// 매개변수로 학생이름, 가진 돈을 받는 생성자
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
		
	// 버스를 타는 메소드 함수 정의
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000; // 버스 요금 1000원을 지불
	}
	
	// 지하철을 타는 메소드 함수 정의
	public void takeSubway(Subway subway) {
		subway.take(1500);
		this.money -= 1500; // 지하철 요금 1500원을 지불
	}
	
	// 택시를 타는 메소드 함수 정의
	public void takeTaxi(Taxi taxi) {
		taxi.take(10000);
		this.money -= 10000; // 택시 요금 10000원 지불
	}
	
	// 학생의 현재 정보를 출력하는 메소드 및 함수 정의
	public void showInfo() {
		System.out.println(studentName + "님의 남은 돈은"+money+"입니다.");
		
	}
	
} // End class
