package C_java;

import obj.inhereritance.Person;

public class C03_inheritanceExample {
    public static void main(String[] args) {
        Person p = new Person();
        p.name="홍길동";
        p.age = 25;
        //default 라 패키지가 달라 출력되지 않는다.

        Person p1 = new Person("null", 12, 12.7f,13.0f);
    }

}
