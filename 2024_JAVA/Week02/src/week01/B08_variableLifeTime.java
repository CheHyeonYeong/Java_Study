package week01;

public class B08_variableLifeTime {
	static int c;
	int b = 5;
	public static void main(String[] args) {
//		- ������ ����
//		- {} �� ���ο���, ����� ������ ���� ������ ���� ����� �������
//		- ������ ��� �ִ� ������ ������ �����̶�� �Ѵ�. (Scope)
//		- ������ ������ ��ġ�� �ʴ´ٸ� ���� �̸��� ������ ����� �� �ִ�.
		int b = 8; //�������(�ʵ�, �Ӽ�)
		
		System.out.println("main method�� b "+b);
		c =10;
		System.out.println("class ������� C : "+c);
		
		B08_variableLifeTime obj = new B08_variableLifeTime();
		System.out.println("class�� b���� �ν��Ͻ� ������� : "+obj.b);

//		- ��ü ����
//	    - �ν��Ͻ� ������ ������ ���� ������, Ŭ���� ������ ��� Ŭ������ ������ �ش�. ���� ������ �������� �����ϸ� �ȴ�.
	

		B08_variableLifeTime obj2 = new B08_variableLifeTime();

		obj2.b=100;
		System.out.println("class�� b���� �ν��Ͻ� ������� : "+obj.b);
		System.out.println("class�� b���� �ν��Ͻ� obj2 ������� : "+obj2.b);
		
		if(true) {
			int a = 10; //��������
			System.out.println(a);
			a= 7;
//			�θ� ������ �ִ� ���� ����� �� �ִ�.
			
		}
//		a =3; => �� �� ���ٴ� ������ ���. ���� ������ �ٸ��� ����
		for (int i =0; i<10;i++) {
			
		}
//		i =10; -> �̰͵� �ȵ� ���� ������ �ٸ��� ����
		
	}	
}
