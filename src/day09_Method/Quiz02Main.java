package day09_Method;

import java.util.Scanner;

public class Quiz02Main {
	public static void main(String[] args) {
		// �Է¹��� ���� ¦������ Ȧ������ �����ϴ� �Լ��� ����ÿ�.
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("�� �Է�");
		num = sc.nextInt();
		if(num%2==0) {
			System.out.println("¦��");
		}
		else {
			System.out.println("Ȧ��");
		}
	}
}
