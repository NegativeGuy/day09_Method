package day09_Method;

import java.util.Scanner;

public class Quiz04Method {
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է�");
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
			System.out.println(num+"��(��) �Ҽ��� �ƴմϴ�");
		}
		else {
			System.out.println(num+"��(��) �Ҽ� �Դϴ�");
		}
	}
}
