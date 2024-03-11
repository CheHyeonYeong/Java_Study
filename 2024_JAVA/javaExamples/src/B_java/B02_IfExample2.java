package B_java;

import java.util.Random;

public class B02_IfExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Random rand = new Random();
//		float a = rand.nextFloat();
//		boolean b = rand.nextBoolean();
//		int c = rand.nextInt();
//		int d = rand.nextInt(10);
//		System.out.printf("%f, %b, %d, %d", a,b,c,d);
		
		//정수 난수 발생 (0~99)
		int jumsu = (int) (Math.random()*100);
		
		//다중 if문
		System.out.println("점수 :"+jumsu);
		if(jumsu>=90) {
			if (jumsu>100) {
				System.out.println("wrong score");
			}
			else {
				System.out.println("A");
			}
		}
		else if(jumsu>=80) {
			System.out.println("B");
		}
		else if(jumsu>=70) {
			System.out.println("C");
		}
		else if(jumsu>=60) {
			System.out.println("D");
		}
		else {
			System.out.println("F");System.out.println("당신은 재수강 대상자입니다.");
		}
		
		//중첩 if문
		
	}

}
