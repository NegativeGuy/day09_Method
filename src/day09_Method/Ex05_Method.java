package day09_Method;

public class Ex05_Method {
	public int sumFunc(int num1, int num2) {
		int sum = num1 + num2;
		return sum;	// public int���� int�� return��(int)�� �����ؾ���
	}
	
	public void test(int n) {	//void�� return ���� ���� �� ���
		if(n==1) {
			System.out.println("if");
			// return�� ���� ������ �Ʒ� "test �޼ҵ� ����" ���
		}
		else {
			System.out.println("else");
			return; 	
			// return�� �ش� �޼ҵ� ���ᵵ ����, 
			// �׷��� �Ʒ� "test �޼ҵ� ����" ��� �ȵ�
		}
		System.out.println("test �޼ҵ� ����");
	}
	
	public String test02() {
		return "�ȳ��ϼ���";
	}
	
	public String test03() {
		int num = 1;
		if(num==1) {
			return "111.111";
		}
		return null;
	}
}
