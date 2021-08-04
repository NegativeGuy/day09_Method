package day09_Method;

import java.util.Scanner;

public class Quiz04Method {
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력");
		int num = sc.nextInt();
		int result = op(num);
		output(num, result);
	}
	
	public int op(int n) {
		for(int i=2; i<n; i++) {
			if(n%i==0) {
				return 0;
			}
			else {
				return 1;
			}
		}
		return n;
	}
	
	public void output(int num, int res) {
		if(res == 0) {			
			System.out.println(num+"은(는) 소수가 아닙니다");
		}
		else {
			System.out.println(num+"은(는) 소수 입니다");
		}
	}
}
