package week01;

import java.util.Random;
import java.util.Scanner;

public class B_QuizArray {
	
	static void array() {
		// 1. 1000��¥�� int�� �迭�� ������ �� ��� ���� 1 - 100������ ���� ���ڷ� ä��������
		int[] num = new int[1000];
		Random rand = new Random();
		for (int i =0; i<1000;i++) {
			num[i]=rand.nextInt(100)+1;
		}
		
//		2. 1000���� ���� ���ڵ� �� �� ���ڰ� ����� ���Դ��� ���� ����ϼ���
        int[] count = new int[100]; // 1���� 100������ ���ڰ� �����Ƿ� 100���� ������ �ʿ��մϴ�.
        for (int i = 0; i < 1000; i++) {
            count[num[i] - 1]++; // ������ ���� Ƚ���� ������ŵ�ϴ�.
        }

        for (int i = 0; i < 100; i++) {
            System.out.println((i + 1) + "��(��) " + count[i] + "�� ���Խ��ϴ�.");
        }
	}

	
	static void diamond() {
		// 1. ������ ���� ���·� �����⸦ ������ ������
		/*��Ʈ  : ����, ��, ��(��)
				      *
				     ***
				    *****
				   *******
				  *********
				   *******
				    *****
				     ***
				      * 				 */
		int size = 5; // ���� �ִ� ����
		System.out.println("diamond ���");

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

				// 2. 1���� �ڵ带 Ȱ���Ͽ� �� ���� �Է� �޾Ƽ� �� �� �� �� �´� ���̾Ƹ�� ���� ��� 
		 		//   ���α׷��� �ۼ��� ������. (��, ���� Ȧ���θ� �Է� �޾ƾ� �մϴ�.)

		Scanner s = new Scanner(System.in);
		System.out.println("Ȧ���� �Է��ϸ� ���̾Ƹ�带 ������ִ� ����");
		int size = s.nextInt(); // ���� �ִ� ����

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
