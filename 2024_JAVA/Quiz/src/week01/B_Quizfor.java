package week01;

public class B_Quizfor {
	
	public static void one() {
		//100���� 1���� ������� ����ϱ�
		for(int i = 100; i>=1 ;i--) {
			System.out.println(i);
		}
	}
	public static void two() {
			//1~200������ �� �� 2||3�� ����� �ƴ� �� ���� �� ��
		int sum=0;
		for (int j=1; j<=200;j++) {
			if (!(j%2==0 || j%3==0)) {
				sum+=j;
			}
		}
		System.out.println(sum);
	}
	public static void three() {
		//1+(1+2)+(1+2+3) +....+(1+2+3+...+10)�� ����� ���ϱ�
		int sum =0;
		for (int i=1;i<=10;i++) {
			for (int j = 1;j<=i;j++) {
				sum +=j;
			}
		}
		System.out.println(sum);
		
	}
	public static void main(String[] args) {
//		one();
		two();
//		three();
	}
}
