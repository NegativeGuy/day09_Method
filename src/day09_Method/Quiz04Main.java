package day09_Method;
import java.util.Scanner;
public class Quiz04Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Quiz04Method prime = new Quiz04Method();
		int num1;
		System.out.print("수 입력 : ");
		num1 = input.nextInt();
		int result = prime.primeCheck(num1);
		// 입력받은 수(num1)을 primeCheck로 보냄
		// == primeCheck 기능이 끝난 후 ==
		// primeCheck으로부터 return받은 값(cnt)을 result에 대입
		prime.outPut(num1,result);
		// 입력받은 수(num1)과 result(cnt값)를 outPut로 보냄
	}
}
