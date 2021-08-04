package day09_Method;

import java.util.Scanner;

public class Quiz02Main {
	public static void main(String[] args) {
		// 입력받은 값이 짝수인지 홀수인지 구별하는 함수를 만드시오.
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("수 입력");
		num = sc.nextInt();
		if(num%2==0) {
			System.out.println("짝수");
		}
		else {
			System.out.println("홀수");
		}
	}
}
