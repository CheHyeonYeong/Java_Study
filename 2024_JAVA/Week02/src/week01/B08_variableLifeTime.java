package week01;

public class B08_variableLifeTime {
	static int c;
	int b = 5;
	public static void main(String[] args) {
//		- 변수의 수명
//		- {} 블럭 내부에서, 선언된 변수는 지역 변수로 블럭을 벗어나면 사라진다
//		- 변수가 살아 있는 범위를 변수의 영역이라고 한다. (Scope)
//		- 변수의 영역만 겹치지 않는다면 같을 이름의 변수를 사용할 수 있다.
		int b = 8; //멤버변수(필드, 속성)
		
		System.out.println("main method의 b "+b);
		c =10;
		System.out.println("class 멤버변수 C : "+c);
		
		B08_variableLifeTime obj = new B08_variableLifeTime();
		System.out.println("class의 b이자 인스턴스 멤버변수 : "+obj.b);

//		- 객체 생성
//	    - 인스턴스 변수는 영향을 주지 않으나, 클래스 변수는 모든 클래스의 영향을 준다. 공통 변수의 개념으로 생각하면 된다.
	

		B08_variableLifeTime obj2 = new B08_variableLifeTime();

		obj2.b=100;
		System.out.println("class의 b이자 인스턴스 멤버변수 : "+obj.b);
		System.out.println("class의 b이자 인스턴스 obj2 멤버변수 : "+obj2.b);
		
		if(true) {
			int a = 10; //지역변수
			System.out.println(a);
			a= 7;
//			부모가 가지고 있는 것은 출력할 수 있다.
			
		}
//		a =3; => 알 수 없다는 에러가 뜬다. 변수 영역이 다르기 때문
		for (int i =0; i<10;i++) {
			
		}
//		i =10; -> 이것도 안됨 변수 영역이 다르기 때문
		
	}	
}
