package C_java;

import obj.Count;

class InstanceInit{
    public final int DATA;
    
    // Instance Initializer
    // 생성자가 호출되기전에 호출됨
    // 인스턴스 변수 초기화에 사용
    // 생성자를 이용하여 인스턴스 변수 초기화가 가능하기 때문에 사용할 기회는 많지 않음

    {
        DATA = 10;
        System.err.println("static initializer가 수행");
    }
}

//Static 초기화자 클래스

class StaticInit{

    static {
        //생성자가 실행되기 전에 static 변수 초기화 객체 여러번 생성해도 한번만!
        System.err.println("static initializer가 수행");
    }
    public StaticInit(){
        
        System.err.println("Constructor 호출됨");
    }
}

public class C06_static {
    public static void main(String[] args) {
        Count c1= new Count();
        c1.a++;
        c1.b++;
        System.out.println("Non-static a : "+c1.a);
        System.out.println("static b : "+c1.b);       

        Count c2 = new Count();
        c2.a++;
        c2.b++;
        System.out.println("Non-static a : "+c2.a);
        System.out.println("static b : "+c2.b);   //값이 저장되어 있다. 전역변수
        Count.b++;
        System.out.println("c1 static b : "+c1.b);  
        System.out.println("c2 static b : "+c2.b);   
        System.out.println("c3 static b : "+Count.b);

        //메소드
        //객체를 생성할 필요없이 바로 부를 수 있다.

        System.out.println("Count.doit() : "+Count.doIt());
        System.out.println("Count.doit() : "+Count.doIt());
        System.out.println("Count.doit() : "+Count.doIt());

        //Static init 테스트

        StaticInit s1= new StaticInit();
        System.err.println(s1);
        StaticInit s2 = new StaticInit();
        System.err.println(s2);
        

    }
}
