package B_java;

import java.util.Scanner;

public class B06_while {
	
	public static void main(String[] args) {
		int i = 0;
		while (i<10) {
//			i++;  // 증감값의 위치에 따라 결과가 다르다.
			System.out.println(i);
			i++;
		}
//		while (true) {
//			System.out.println(i+=10000);
//			if(i%200000==0)
//				continue;
//			if(i<0) //오버 플로우
//				break;
//		}
		
		i=0;
		Scanner s = new Scanner(System.in);
		
//		while ((i=s.nextInt())!=0) {
//			System.out.println("i가 0이 아닙니다.");
//		}
		
		do{
			System.out.println("수를 입력하시오");
		
			i = s.nextInt();
			System.out.println("i가 0이어도 일단 1번은 실행한다.");
		}while(i!=0);
		
		
		s.close();
		
		
	}
	
}
