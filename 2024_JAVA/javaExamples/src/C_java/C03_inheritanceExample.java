package C_java;

import obj.Student;
import obj.inhereritance.Person;

public class C03_inheritanceExample {

    	/*
	 *  this와 super
	 *   - this 
	 *    > this는 현재 객체(자기 자신)
	 *    > this. 
	 *       - 변수 또는 메서드를 참조
	 *       - this.name => 자기 자신의 name 멤버변수를 참조
	 *       - this.go()  => 자기 자신의 go() 메서드를 참조하겠다... 
	 *    > this()
	 *       - 자기 자신 클래스 내의 다른 생성자를 참조
	 *       - this();   => 기본 생성자를 참조
	 *       - this("hello");   => 자신이 가지고 있는 생성자를 호출. 인자 값을 처리하는 생성자
	 *   
	 *   - super
	 *    > super는 현재 객체의 부모 객체, 한단계 위 부모를 의미함. 
	 *    > super.
	 *       - 부모의 변수 또는 메서드를 참조
	 *       - super.name => 부모의 name 멤버변수를 참조
	 *       - super.go() => 부모의 go() 메서드를 참조
	 *    > super()
	 *       - 부모 생성자를 참조
	 *       - super()  => 부모의 기본 생성자를 참조
	 *       - super(10, 20) => 부모의 해당 인자값을 처리하는 생성자를 참조
	 *       - super("hello")
	 */
    public static void main(String[] args) {
        Person p = new Person();
        p.name="홍길동";
        p.age = 25;
        //default 라 패키지가 달라 출력되지 않는다.

        Person p1 = new Person("null", 12, 12.7f,13.0f);
        System.out.println(p1.getDetails());
        
//		Person p = new Person();
//		p.name = "홍길동";
//		p.age = 25;
//		p.height = 179.8f;   //protected  -> 같은 패키지 내와 자식 클래스는 접근 가능
//		p.weight = 100.0f;   //default  -> 같은 패키지내에서 접근 가능
		Person p2 = new Person("홍길동", 25, 179.8f, 105.6f);
		System.out.println(p2.getDetails());

//		Student s1 = new Student();
//		s1.name = "이순신";
//		s1.age = 30;
//		s1.studentId = "20240314";
//		s1.major = "해양학과";
		// Student s1 = new Student("이순신", 30, "20240314", "해양학과");
		// System.out.println(s1.getDetails());
    }

}
