package week01;

import java.util.Random;
import java.util.Scanner;

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

	
	static void diamond() {
		// 1. 다음과 같은 형태로 별직기를 진행해 보세요
		/*힌트  : 공백, 별, 단(줄)
				      *
				     ***
				    *****
				   *******
				  *********
				   *******
				    *****
				     ***
				      * 				 */
		int size = 5; // 별의 최대 개수
		System.out.println("diamond 출력");

        for (int i = 1; i <= size; i++) {
            for (int j = size - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = size - 1; i >= 1; i--) {
            for (int j = size - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

	}
	static void diamondtwo() {

				// 2. 1번의 코드를 활용하여 줄 수를 입력 받아서 그 줄 수 에 맞는 다이아몬드 별을 찍는 
		 		//   프로그램을 작성해 보세요. (단, 줄은 홀수로만 입력 받아야 합니다.)

		Scanner s = new Scanner(System.in);
		System.out.println("홀수만 입력하면 다이아몬드를 출력해주는 여자");
		int size = s.nextInt(); // 별의 최대 개수

        for (int i = 1; i <= size; i++) {
            for (int j = size - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = size - 1; i >= 1; i--) {
            for (int j = size - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
	}
	public static void main(String[] args) {
		array();
		diamond();
		 
//		diamondtwo();	
	}
}
