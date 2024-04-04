package B_java;

// import java.util.Random;

public class B02_IfExample2 {

	public static void main(String[] args) {
		
//		Random rand = new Random();
//		float a = rand.nextFloat();
//		boolean b = rand.nextBoolean();
//		int c = rand.nextInt();
//		int d = rand.nextInt(10);
//		System.out.printf("%f, %b, %d, %d", a,b,c,d);
		
		//���� ���� �߻� (0~99)
		int jumsu = (int) (Math.random()*100);
		
		//���� if��
		System.out.println("���� :"+jumsu);
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
			System.out.println("F");System.out.println("����� ����� ������Դϴ�.");
		}
		
		//��ø if��
		
	}

}
