package day09_Method;

import java.util.Scanner;

public class Quiz03Method {
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�� �Է�");
		int num = sc.nextInt();
		int result = op(num);
		// op �޼���� �Է¹��� num�� ����
		// ===op �޼��� ����� ���� ��===
		// op�κ��� return ���� ���� result�� ����
		output(num, result);
		// �Է¹��� num�� result�� output �޼���� ����
	}
	
	public int op(int n) {	// �Է¹��� num�� �޾� n�� ����
		if(n%3==0) {	// n�� 3�� ����̸�
			return 1;	// 1�� input �޼���� return
		}
		else {			// n�� 3�� ����� �ƴϸ�
			return 0;	// 0�� input �޼���� return
		}
	}
	
	public void output(int num, int res) {
		// �Է¹��� ��(num)�� result���� ���� num, res�� ����
		if(res==1) {	// res�� 1�̸�
			System.out.println(num+"��(��) 3�� ��� �Դϴ�");
		}
		else {	// res�� 1�� �ƴϸ�
			System.out.println(num+"��(��) 3�� ����� �ƴմϴ�");
		}
	}
}
