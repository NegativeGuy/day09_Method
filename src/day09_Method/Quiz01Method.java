package day09_Method;

import java.util.Scanner;

public class Quiz01Method {
	public void Scan() {
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		System.out.println("�� �� �Է�");
		n1=sc.nextInt();
		n2=sc.nextInt();
		print(n1,n2);
		// �Է¹��� �� ���� print �޼���� ����(return �ȹ���)
	}
	
	public void print(int n1, int n2) {
		// �Է¹��� �� ���� ���� n1,n2�� ����
		if(n1>n2) {	// �� ���� ��
			System.out.println(n1);
		}
		else {
			System.out.println(n2);
		}
	}
}
