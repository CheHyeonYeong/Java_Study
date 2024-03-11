package B_java;

import java.util.Scanner;

public class B02_IfExample1 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int num = scan.nextInt();
		
		if(num>=10) {
			System.out.println("입력 정수가 10보다 크거나 같다");
		}
		else if(num<0) {
			System.out.printf("입력 정수는 %d 음수입니다",num);
		}
		System.out.println("close");
		scan.close();
		
	}

}
