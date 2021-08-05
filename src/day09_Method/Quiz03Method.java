package day09_Method;

import java.util.Scanner;

public class Quiz03Method {
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("수 입력");
		int num = sc.nextInt();
		int result = op(num);
		// op 메서드로 입력받은 num을 보냄
		// ===op 메서드 기능이 끝난 후===
		// op로부터 return 받은 값을 result에 대입
		output(num, result);
		// 입력받은 num과 result를 output 메서드로 보냄
	}
	
	public int op(int n) {	// 입력받은 num을 받아 n에 대입
		if(n%3==0) {	// n이 3의 배수이면
			return 1;	// 1을 input 메서드로 return
		}
		else {			// n이 3의 배수가 아니면
			return 0;	// 0을 input 메서드로 return
		}
	}
	
	public void output(int num, int res) {
		// 입력받은 수(num)과 result값을 각각 num, res에 대입
		if(res==1) {	// res가 1이면
			System.out.println(num+"은(는) 3의 배수 입니다");
		}
		else {	// res가 1이 아니면
			System.out.println(num+"은(는) 3의 배수가 아닙니다");
		}
	}
}
