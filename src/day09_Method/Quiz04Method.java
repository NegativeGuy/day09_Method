package day09_Method;

public class Quiz04Method {
	public int primeCheck(int n1) {	//입력받은 수(num1)을 n1에 대입
		int cnt=0;	// 카운트한 수를 저장할 변수 cnt를 선언
		// 추가설명
		// 1. 소수는 1과 자기자신을 제외한 어떤 수로도 나눌 수 없는 수이다
		// 2. 그렇다는건 반복문에서 2번(1과 자신)만 나눠지는건 소수
		// 3. 세번 이상 나눠지는 건 소수가 아니게 된다
		// 그래서 몇번 나눠지는지 카운트해서 그 값을 저장할 cnt변수가 필요
		// cnt가 2이면 소수, 3이상이면 소수가 아니게 됨
		for(int i=1;i<=n1;i++) { // 1부터 입력한 수(num)까지 반복
			if(n1 % i == 0 ) { // 나머지가 0이면(=i가 num의 약수이면)
				cnt++;	// 
			}
		}
		return cnt;
		// 반복문이 끝나면 카운트한 수를 return
	}
	public void outPut(int n1,int re) {
		// 입력받은 수(num1)와 result(cnt값)을 각각 n1, re에 대입
		if(re == 2)// re(cnt값)이 2이면(소수이면)
			System.out.println(n1+"은 소수 입니다 ");
		else	// re(cnt값)이 3이상이면(소수가 아니면)
			System.out.println(n1+"은 소수가 아닙니다");
	}
}
