package day09_Method;

import java.util.Scanner;

public class Ex07_Method {
	public void reverse() {
		Scanner sc = new Scanner(System.in);
		int su=0, temp=0;
		System.out.println("¼ö ÀÔ·Â");
		su = sc.nextInt();
		
		while(true) {
			temp = su%10;
			su = su/10;
			System.out.println(temp+", ");
			if(su==0) {
				break;
			}
		}
	}
}
