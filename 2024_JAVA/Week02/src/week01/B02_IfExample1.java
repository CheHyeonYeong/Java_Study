package week01;

import java.util.Scanner;

public class B02_IfExample1 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("���� �Է� : ");
		int num = scan.nextInt();
		
		if(num>=10) {
			System.out.println("�Է� ������ 10���� ũ�ų� ����");
		}
		else if(num<0) {
			System.out.printf("�Է� ������ %d �����Դϴ�",num);
		}
		System.out.println("close");
		scan.close();
		
	}

}
