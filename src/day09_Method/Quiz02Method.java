package day09_Method;

import java.util.Scanner;

public class Quiz02Method {
	public void print() {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("�� �Է�");
		num = sc.nextInt();
		// �Ʒ����� �޼��� ȣ��
		int result = op(num);	
		// op�޼��忡 num���� ������ return �Ǵ� ���� result�� ����
		output(result);
		// output�� return�� result���� ����. output ��� �����
	}
	public int op(int n) {	// ȣ�� �Ǹ� n�� ���� �� �ְ� ��� ����
		if(n%2==0) {	// n�� ¦���� 0�� ��������
			return 0;
		}
		else {		// n�� Ȧ���� 1�� ��������
			return 1;
		}	
	}
	public void output(int res) {
		if(res==0) {
			System.out.println("¦��");
		}
		else {
			System.out.println("Ȧ��");
		}
	}
}
