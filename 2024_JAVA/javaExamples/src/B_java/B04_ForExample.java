package B_java;

import java.util.Scanner;

public class B04_ForExample {
	public static void main(String[] args) {
		
		for (int i =0;i<10;i++) {
			System.out.println(i);
		}
		
		//���� for�� ����
		
		for (int i =2;i<=9;i++) {
			for (int j= 2;j<=9;j++) {
				System.out.printf("%d * %d = %d\t", j, i, i*j);
			}
			System.out.println();
		}
		//���ѷ���
//		for (int i = 0 ;true ;i++) {
//			System.out.println("i="+i);
//		}

		String answer = "�ڵ���";
		Scanner scan = new Scanner(System.in);
//		for(;;) {
//			System.out.println("> ");
//
//			String appempt = scan.nextLine();
//			if(answer.equals (appempt)) {
//				System.out.println("����");
//				break;
//			}
//		}
		
		String attempt = "";
		for (;!attempt.contentEquals(answer);) {
			System.out.println("> ");
			attempt = scan.nextLine();
		}
		
	}
}
