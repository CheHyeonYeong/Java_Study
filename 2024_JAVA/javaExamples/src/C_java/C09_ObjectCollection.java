package C_java;

import C_java.inhereritance.Person;
import obj.Student;

public class C09_ObjectCollection {

    public static void main(String[] args) {
        Object[] objects = new Object[5];
        objects[0]= new Person("hong",30); //person으로 캐스팅을 다시 변환해야 해서 굳이 이렇게 쓰지 맙쉬다~!
        objects[1]= new Student();
        objects[2] = new Integer(100);
        objects[3] = new String("hong");
        objects[4] = new java.util.Date();

        for (Object o : objects){
            System.out.println(o);
        }
    }
}
