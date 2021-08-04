package day09_Method;

public class Ex05 {
	public static void main(String[] args) {
		Ex05_Method ex = new Ex05_Method();
		int s = ex.sumFunc(10, 20);
		System.out.println("╣н гу : "+s);
		
		ex.test(1);
		String ss = ex.test02();
		System.out.println(ss);
		
		System.out.println(ex.test02());
	}
}
