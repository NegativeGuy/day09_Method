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
		printSum(n1, n2, sum);
	}
	
	public int test(int n, int n2) 
	{return n+n2;}
	
	public void printSum(int n1, int n2, int s) 
	{System.out.println(n1+"+"+n2+"="+s);}
}
