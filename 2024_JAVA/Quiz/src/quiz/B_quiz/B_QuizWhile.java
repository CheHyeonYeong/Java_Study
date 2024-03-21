package quiz.B_quiz;

public class B_QuizWhile {
	private static void one() {
		int i = 2;
		while (i<=9) {
			int dan =2;
			while(dan <=9) {
				System.out.printf("%d * %d = %d\t", dan, i, i*dan);
				dan++;
			}
			System.out.println();
			i++;
		}
	}
	public static void main(String[] args) {
		one();
	}
}
