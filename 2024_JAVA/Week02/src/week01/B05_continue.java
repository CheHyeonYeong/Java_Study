package week01;

public class B05_continue {
	public static void main(String[] args) {
//		�ݺ��� ���ο����� ����� �����ϴ�
//		�ݸ񹮿��� continue�� ����Ѵٸ� �Ʒ� ������ �������� �ʰ� ���� �ݺ� ȸ���� �̵��Ѵ�.-> ���ǽ����� �̵�
	
		for(int i =1;i<=100; i++) {
			if(i%2==1) 
				continue;
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i = 5;i<101;i=i+5) {
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i = 5;i<101;i++) {
			if(i%5!=0)
				continue;
			System.out.print(i+" ");
		}
		
	}

}
