package day09_Method;

import java.util.Scanner;

public class Quiz05Method {
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�� �Է�");
		int num = sc.nextInt();
		int result = op(num);
		System.out.println(num+"�� ���밪 : "+result);
	}
	
	public int op(int n) {
		if(n>=0) {
			return n;
		}
		else {
			return (-n);
		}
	}
}
