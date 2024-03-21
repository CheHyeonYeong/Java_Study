package E_java;

import E_java.generic.Person;

public class E11_genericEx {
    public static void main(String[] args) {
        E_java.generic.Person<Character> p1 = new Person<>('딸', 8);
        System.out.println(p1.getName());
        Person<String> p2 = new Person<String>("아빠", 45);
        System.out.println(p2.getName());

        System.out.println(p1.test(4.8));
        System.out.println(p1.test("4.8"));
        int[] i = {112,3,4,5,6,7,78};
        System.out.println(p1.test(i));
    }

}
