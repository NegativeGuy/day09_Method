package day09_Method;

import java.util.Scanner;

public class Quiz06Method {
	
	public int input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �Է� : ");
		int num = sc.nextInt();
		return num;
	}
	
	public int op(int n) { //display�κ��� num���� �޾� n�� ����
		int temp=0, result=0;
		// ���������� ������ temp��
		// ���� ������� ������ result�� ����
		while(true) {	// ���ѹݺ�
			temp = n%10;	
			// n��10���� ������ ���� ���������� temp�� ����
			n = n/10;
			// n�� 10���� ���� ���� n�� ����
			result = (result+temp)*10;
			// 1�� �ڸ����� ���������� ������ �ϴ� �ڵ�
			// ���� 3���� ���ε�� �������ڸ�
			// ��) n���� 123�� ���
			// 	 (�ݺ� �� n�� 0�̵Ǹ� �Ʒ� if�� �����̶� �ݺ��� ����)
			/*
				1ȸ�� �ݺ�
				temp   = 123%10	  = 3	//n%10
				n 	   = 123/10   = 12	//n/10
				result = (0+3)*10 =	30  //(result+temp)*10
				
				2ȸ�� �ݺ�
				temp   = 12%10	   = 2    //n%10
				n 	   = 12/10     = 1    //n/10
				result = (30+2)*10 = 320  //(result+temp)*10

				3ȸ�� �ݺ�
				temp   = 1%10	    = 1     //n%10
				n 	   = 1/10       = 0     //n/10
				result = (320+1)*10 = 3210  //(result+temp)*10
				
				3ȸ������ n�� 0�� �Ǹ鼭 �Ʒ� if���ǿ� ����
				return�� ����Ǹ鼭 �ݺ��� ����
				
			*/
			if(n==0) { // �ݺ� �� n�� 0�� �Ǹ�
				return result/10;	
				// result���� 10�� ������ retrun
				// ���� ���� 123�̿��� ���
				// result���� 3210�̹Ƿ� 10�� ���� 321�� return
				// ��������� 123�� �ݴ��� 321�� ������		
			}
		}
	}
	
	public void display() {
		int num = input();
		// inputȣ��
		// == input ����� ���� �� ==
		// input���κ��� return ���� �޾� num�� ����
		int reverse = op(num);
		// op�� num�� ����
		// == op ����� ���� �� ==
		// op�κ��� return ���� �޾� reverse�� ����
		System.out.println(num+" ==[reverse]==> "+ reverse);
	}
}
