package B_java;

import java.util.Scanner;

public class B06_while {
	
	public static void main(String[] args) {
		int i = 0;
		while (i<10) {
//			i++;  // �������� ��ġ�� ���� ����� �ٸ���.
			System.out.println(i);
			i++;
		}
//		while (true) {
//			System.out.println(i+=10000);
//			if(i%200000==0)
//				continue;
//			if(i<0) //���� �÷ο�
//				break;
//		}
		
		i=0;
		Scanner s = new Scanner(System.in);
		
//		while ((i=s.nextInt())!=0) {
//			System.out.println("i�� 0�� �ƴմϴ�.");
//		}
		
		do{
			System.out.println("���� �Է��Ͻÿ�");
		
			i = s.nextInt();
			System.out.println("i�� 0�̾ �ϴ� 1���� �����Ѵ�.");
		}while(i!=0);
		
		
		s.close();
		
		
	}
	
}
