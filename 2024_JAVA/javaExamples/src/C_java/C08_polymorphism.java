package C_java;

import C_java.inhereritance.Person;
import C_java.inhereritance.Student;
import C_java.inhereritance.Teacher;

//다형성
public class C08_polymorphism {

    public static void main(String[] args) {

        Person p2;
        p2 = new Teacher("홍선생", 22, "JAVA programming");

        System.err.println(p2.getDetails());

        //instanceof 좌항의 객체와 우항의 클래스를 비교
        System.out.println(p2 instanceof Person);
        System.out.println(p2 instanceof Teacher);

        Person p = new Student("홍길동", 17,"20240325","도술");

        System.out.println(p.getDetails());
        Person p0 = new Person("이순신",40);
        System.out.println(p0.getDetails());

        p.walk();
        //p.study(); //p는 다형적 객체이기 때문에 부모 클래스에 있는 메서드만 사용할 수 있다

        Student casting = (Student) p; //이렇게 강제 캐스팅을 하면 된다.
        casting.study();
    }
}
