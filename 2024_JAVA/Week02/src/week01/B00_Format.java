package week01;

public class B00_Format {
	public static void main(String[] args) {
		
		int a = 10;
		float b= 10.234f;
		char c= 'T';
		String d = "string";
		System.out.printf("�������� %d, �Ǽ����� %.3f, �ѱ��ڴ� %c, ���ڿ��� %s",a,b,c,d);
		
		a=100;
		System.out.printf("\n%10d",a); //��� �տ� ���ڴ� ��� ���� �ڸ���, 10ĭ �߿� d�� ��µǰԲ� ��, 10ĭ���� �о����� �׳� �о���
		
		String name="ȫ�浿";
		int age=24;
		String tel= "010-2345-4567";
		int height=187;
		int weight = 87;
		char bloodType='O';
		
		
		System.out.println();

		System.out.println("\n=====��°��=====");
		System.out.println();
		System.out.printf("�̸�: %s \n����: %d\nTel: %s\nŰ: %d \n������:%d\n������: %c", 
				name, age, tel, height,weight, bloodType);

	
		System.out.printf("\n%.2f",(37.00/12));
	
		
	}
	

}
