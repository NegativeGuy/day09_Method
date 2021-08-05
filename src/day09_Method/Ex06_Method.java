package day09_Method;

import java.util.Scanner;

public class Ex06_Method {
	public void display() {
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		System.out.println("두 수 입력");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		int sum = test(n1, n2);
		// 1. test 메서드로 입력받은 두 수를 보냄
		// 2. return으로 두 수의 합을 받은 후 sum에 대입
		printSum(n1, n2, sum);
		// printSum 메서드로 입력받은 두 수와 두수의 합을 보냄
	}
	
	public int test(int n, int n2) // 입력받은 두 수를 받음
	{return n+n2;}	// 두 수를 더해서 돌려보냄
	
	public void printSum(int n1, int n2, int s) 
	// 두 수와 두 수의 합을 받아서 아래 내용대로 출력 실행 
	{System.out.println(n1+"+"+n2+"="+s);}
}
