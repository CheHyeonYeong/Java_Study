package C_java;

import C_java.inhereritance.Employee;
import C_java.inhereritance.Person;
import C_java.inhereritance.Student;
import C_java.inhereritance.Teacher;

public class C09_HeteroCollection {
    public static void main(String[] args) {
        Person[] pArr = new Person[4];
        pArr[0]= new Person("hong",20);
        pArr[1] = new Student("null", 0, "null", "null");
        pArr[2] = new Teacher("null", 0, "null1");
        pArr[3] = new Employee("null", 0, "null1");

        for (Person p :pArr){
            System.out.println(p.getDetails());
        }
    }

}
