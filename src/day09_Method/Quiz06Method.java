package day09_Method;

import java.util.Scanner;

public class Quiz06Method {
	
	public int input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("수 입력 : ");
		int num = sc.nextInt();
		return num;
	}
	
	public int op(int n) { //display로부터 num값을 받아 n에 대입
		int temp=0, result=0;
		// 나머지값을 저장할 temp와
		// 최종 결과값을 저장할 result를 선언
		while(true) {	// 무한반복
			temp = n%10;	
			// n을10으로 나누고 남은 나머지값을 temp에 대입
			n = n/10;
			// n을 10으로 나눈 몫을 n에 대입
			result = (result+temp)*10;
			// 1의 자릿수에 나머지값이 들어오게 하는 코드
			// 위의 3줄을 예로들어 설명하자면
			// 예) n값이 123인 경우
			// 	 (반복 중 n이 0이되면 아래 if문 조건이라 반복이 끝남)
			/*
				1회차 반복
				temp   = 123%10	  = 3	//n%10
				n 	   = 123/10   = 12	//n/10
				result = (0+3)*10 =	30  //(result+temp)*10
				
				2회차 반복
				temp   = 12%10	   = 2    //n%10
				n 	   = 12/10     = 1    //n/10
				result = (30+2)*10 = 320  //(result+temp)*10

				3회차 반복
				temp   = 1%10	    = 1     //n%10
				n 	   = 1/10       = 0     //n/10
				result = (320+1)*10 = 3210  //(result+temp)*10
				
				3회차에서 n이 0이 되면서 아래 if조건에 만족
				return이 실행되면서 반복이 종료
				
			*/
			if(n==0) { // 반복 중 n이 0이 되면
				return result/10;	
				// result값에 10을 나눠서 retrun
				// 위의 예로 123이였을 경우
				// result값이 3210이므로 10을 나눠 321을 return
				// 결과적으로 123의 반대인 321이 구해짐		
			}
		}
	}
	
	public void display() {
		int num = input();
		// input호출
		// == input 기능이 끝난 후 ==
		// input으로부터 return 값을 받아 num에 대입
		int reverse = op(num);
		// op로 num을 보냄
		// == op 기능이 끝난 후 ==
		// op로부터 return 값을 받아 reverse에 대입
		System.out.println(num+" ==[reverse]==> "+ reverse);
	}
}
