package quiz.B_quiz;

import java.util.Random;

public class B_QuizArray {
	
	static void array() {
		// 1. 1000개짜리 int형 배열을 생성한 뒤 모든 값을 1 - 100사이의 랜덤 숫자로 채워보세요
		int[] num = new int[1000];
		Random rand = new Random();
		for (int i =0; i<1000;i++) {
			num[i]=rand.nextInt(100)+1;
		}
		
//		2. 1000개의 램덤 숫자들 중 각 숫자가 몇번씩 나왔는지 세어 출력하세요
        int[] count = new int[100]; // 1부터 100까지의 숫자가 나오므로 100개의 공간이 필요합니다.
        for (int i = 0; i < 1000; i++) {
            count[num[i] - 1]++; // 숫자의 등장 횟수를 증가시킵니다.
        }

        for (int i = 0; i < 100; i++) {
            System.out.println((i + 1) + "이(가) " + count[i] + "번 나왔습니다.");
        }
	}

	public static void main(String[] args) {
		array();
	}
}
