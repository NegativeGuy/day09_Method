package day09_Method;

import java.util.Scanner;

public class Ex06_Method {
	public void display() {
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		System.out.println("�� �� �Է�");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		int sum = test(n1, n2);
		// 1. test �޼���� �Է¹��� �� ���� ����
		// 2. return���� �� ���� ���� ���� �� sum�� ����
		printSum(n1, n2, sum);
		// printSum �޼���� �Է¹��� �� ���� �μ��� ���� ����
	}
	
	public int test(int n, int n2) // �Է¹��� �� ���� ����
	{return n+n2;}	// �� ���� ���ؼ� ��������
	
	public void printSum(int n1, int n2, int s) 
	// �� ���� �� ���� ���� �޾Ƽ� �Ʒ� ������ ��� ���� 
	{System.out.println(n1+"+"+n2+"="+s);}
}
