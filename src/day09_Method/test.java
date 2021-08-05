package day09_Method;

import java.util.Scanner;

public class test {
	public int reverse(int su) {
		int temp=0,result=0;
		while(true) {
			temp = su%10;
			su = su/10;
			result = (result+temp)*10;
			if(su == 0 ) return result/10;
		}
	}
	public int inData(){
		Scanner input = new Scanner(System.in);
		int su=0;
		System.out.print("수 입력 : ");
		su = input.nextInt();
		return su;
	}
	public void display(){
		int su = inData();
		int result = reverse(su);
		System.out.println(su+" 거꾸로 => "+ result);
	}
}
