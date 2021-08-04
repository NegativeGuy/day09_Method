package day09_Method;

public class Ex01 {
	public static void main(String[] args) {
		/*
		 class
		 - 사용자 정의 자료형
		 	(사용자가 만들고 싶은데로 만들어 사용하는 자료형)
		 - 재사용이 가능
		 
		 객체
		 - 변수를 객체라고 부른다
		 - class 자료형으로 변수를 만드는 것
		 
		 method(메소드)
		 - 기능하는 것. 소괄호()가 있으면 기능이라고 보면 됨
		 - 보편적으로 메소드 또는 함수라고 말한다
		 - 메소드는 클래스 내부에서 정의하는 것
		 - 함수는 클래스 없이 독립적으로 사용하는 것
		 
		 접근제한자
		 - public	: 외부의 접근을 허용
		 - private	: 외부의 접근을 불허
		 - protected: 상속받은 자식 접근 허용
		 - default	: 동일한 패키지에서만 접근 허용
		    └>(접근제한자가 없는 상태)
		*/
		
		Ex01_Class ex = new Ex01_Class();
		
		ex.name = "안녕하세요";
		// .은 맴버접근연산자
		ex.age = 12345;
		System.out.println(ex.name);
	}
}
