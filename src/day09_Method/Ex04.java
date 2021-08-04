package day09_Method;

public class Ex04 {
	public static void main(String[] args) {
		Ex04_Method ex = new Ex04_Method();
		int num=10, su=20;
		ex.sumFunc(num, su); 	// num,su는 인자값(파라미터)
		//ex.sumFunc(10, 20); 	// 10,20은 인자값(파라미터)
		
		ex.test("문자열을 받는 파라미터 필요",100);
	}
}
