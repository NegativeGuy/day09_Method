package day09_Method;

import java.util.Scanner;

public class Quiz03Method {
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�� �Է�");
		int num = sc.nextInt();
		int result = op(num);
		output(num, result);
	}
	
	public int op(int n) {
		if(n%3==0) {
			return 1;
		}
		else {
			return 0;
		}
	}
	
	public void output(int num, int res) {
		if(res==1) {
			System.out.println(num+"��(��) 3�� ��� �Դϴ�");
		}
		else {
			System.out.println(num+"��(��) 3�� ����� �ƴմϴ�");
		}
	}
}
