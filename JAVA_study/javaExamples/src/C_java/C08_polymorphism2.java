
package C_java;

import C_java.inhereritance.Person;
import C_java.inhereritance.Student;

public class C08_polymorphism2 {

    public static void main(String[] args) {
        Student s = new Student();
        printPersonInfo(s);
        Person p = new Person();
        printPersonInfo(p);
        
    }
    public static void printPersonInfo(Person p){
        if(p instanceof Student){
            System.out.println("*************Student*************");
        }
        else if(p instanceof Person){
            System.out.println("***********Person***********");
        }
        System.out.println(p);
    }
}
