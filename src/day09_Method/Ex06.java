package day09_Method;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Ex06_Method ex = new Ex06_Method();
		ex.display();
		
		// Ŭ������ �ƴ� ����main���� �ڵ��Է� ���� ���
		System.out.println("-----��main���� ����-------");
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		System.out.println("�� �� �Է�");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		// ���� �ڵ�� class���� display�� �ش�
		// �Ʒ� �ڵ�� �޼��� ȣ��
		int sum = ex.test(n1, n2);
		ex.printSum(n1, n2, sum);
	}
}
