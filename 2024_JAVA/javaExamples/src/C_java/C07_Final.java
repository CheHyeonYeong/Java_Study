package C_java;

class MyDate {
    int year = 2024;
    int month = 3;
    int day = 15;
    public String toString(){
        return String.format("[%d - %d - %d ]",year,month,day);
    }

    public void doIt (final int a){
        // a++; -> 불가능
    }    
}


class Parent{
    
    public final void method(){
        System.err.println("parent - method()");
    }
}


class child extends Parent {

    //final은 오버라이딩이 안된다
    // public final void method(){
    //     System.err.println("parent - method()");
    // }
}
class FinalInit {
    final int a ;
    // {
    //     a=10;
    // }
    FinalInit(int a ){
        this.a = a; //문제는 안되나, 값이 만들어지고 나서 부착되는 것이기 때문에 final 초기화는 아님을 인지하자
    }
}

public class C07_Final {

    static final MyDate date = new MyDate(); //-> 객체 주소가 변경되지 않는다.

	public int data = 100;
    public static void main(String[] args) {
        // date = new MyDate(); => 불가능

        System.err.println(date.toString());
        date.year = 2025;
        System.err.println(date.toString());
        System.out.println(new FinalInit(100).a);
        
        new C07_Final().doIt("null");

    }

    public void doIt(final String name){
        final int age = 38;
        class InnerLocal {
            public void innerdoIt(){
				System.out.println("외부 클래스의 멤버변수 data : "+data);
				System.out.println("외부 클래스의 파라미터 변수 name : "+name);
				System.out.println("외부 클래스의 지역변수 age : "+age);
			}
        }
        new InnerLocal().innerdoIt();
    }
}
