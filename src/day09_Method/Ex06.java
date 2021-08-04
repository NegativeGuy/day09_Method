package day09_Method;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Ex06_Method ex = new Ex06_Method();
		ex.display();
		
		// 클래스가 아닌 내부main에서 코드입력 했을 경우
		System.out.println("-----ㅡmain에서 실행-------");
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		System.out.println("두 수 입력");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		// 위의 코드는 class에서 display에 해당
		// 아래 코드는 메서드 호출
		int sum = ex.test(n1, n2);
		ex.printSum(n1, n2, sum);
	}
}
