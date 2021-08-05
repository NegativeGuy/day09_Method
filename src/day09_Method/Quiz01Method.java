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
		// 입력받은 두 수를 print 메서드로 보냄(return 안받음)
	}
	
	public void print(int n1, int n2) {
		// 입력받은 두 수를 각각 n1,n2에 넣음
		if(n1>n2) {	// 두 수를 비교
			System.out.println(n1);
		}
		else {
			System.out.println(n2);
		}
	}
}
