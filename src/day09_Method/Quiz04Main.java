package day09_Method;
import java.util.Scanner;
public class Quiz04Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Quiz04Method prime = new Quiz04Method();
		int num1;
		System.out.print("�� �Է� : ");
		num1 = input.nextInt();
		int result = prime.primeCheck(num1);
		// �Է¹��� ��(num1)�� primeCheck�� ����
		// == primeCheck ����� ���� �� ==
		// primeCheck���κ��� return���� ��(cnt)�� result�� ����
		prime.outPut(num1,result);
		// �Է¹��� ��(num1)�� result(cnt��)�� outPut�� ����
	}
}
