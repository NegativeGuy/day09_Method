package day09_Method;

public class Ex05_Method {
	public int sumFunc(int num1, int num2) {
		int sum = num1 + num2;
		return sum;	// public int에서 int는 return값(int)과 동일해야함
	}
	
	public void test(int n) {	//void는 return 값이 없을 때 사용
		if(n==1) {
			System.out.println("if");
			// return이 없기 때문에 아래 "test 메소드 종료" 출력
		}
		else {
			System.out.println("else");
			return; 	
			// return은 해당 메소드 종료도 있음, 
			// 그래서 아래 "test 메소드 종료" 출력 안됨
		}
		System.out.println("test 메소드 종료");
	}
	
	public String test02() {
		return "안녕하세요";
	}
	
	public String test03() {
		int num = 1;
		if(num==1) {
			return "111.111";
		}
		return null;
	}
}
