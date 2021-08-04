package day09_Method;

import java.util.Scanner;

public class Quiz01Method {
	public void Scan() {
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		System.out.println("두 수 입력");
		n1=sc.nextInt();
		n2=sc.nextInt();
		print(n1,n2);
	}
	
	public void print(int n1, int n2) {
		if(n1>n2) {
			System.out.println(n1);
		}
		else {
			System.out.println(n2);
		}
	}
}
