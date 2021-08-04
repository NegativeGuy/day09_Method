package day09_Method;

import java.util.Scanner;

public class Quiz02Method {
	public void print() {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("수 입력");
		num = sc.nextInt();
		// 아래부터 메서드 호출
		int result = op(num);	
		// op메서드에 num값을 보내서 return 되는 값을 result에 대입
		output(result);
		// output에 return된 result값을 보냄. output 기능 실행됨
	}
	public int op(int n) {	// 호출 되면 n에 받은 값 넣고 기능 실행
		if(n%2==0) {	// n이 짝수면 0을 돌려보냄
			return 0;
		}
		else {		// n이 홀수면 1을 돌려보냄
			return 1;
		}	
	}
	public void output(int res) {
		if(res==0) {
			System.out.println("짝수");
		}
		else {
			System.out.println("홀수");
		}
	}
}
