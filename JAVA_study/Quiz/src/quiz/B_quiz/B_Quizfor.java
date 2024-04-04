package quiz.B_quiz;

public class B_Quizfor {
	
	public static void one() {
		//100부터 1까지 순서대로 출력하기
		for(int i = 100; i>=1 ;i--) {
			System.out.println(i);
		}
	}
	public static void two() {
			//1~200사이의 수 중 2||3의 배수가 아닌 수 들의 총 합
		int sum=0;
		for (int j=1; j<=200;j++) {
			if (!(j%2==0 || j%3==0)) {
				sum+=j;
			}
		}
		System.out.println(sum);
	}
	public static void three() {
		//1+(1+2)+(1+2+3) +....+(1+2+3+...+10)의 결과를 구하기
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
