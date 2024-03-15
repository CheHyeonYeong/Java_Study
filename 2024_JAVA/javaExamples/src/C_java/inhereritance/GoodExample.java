package C_java.inhereritance;



public class GoodExample {
    //같은 내용을 자꾸 써버린다.
    class Teacher extends Person{
        String teacherID;
        String subject;
        
        @Override
        public String getDetails(){
            return String.format("이름 : %s\t나이 : %d\t teacherID : %s\subject : %s", name, age, teacherID, subject);
        }

    }
    public class Student extends Person{
        String studentID;
        String major;
        @Override
        public String getDetails(){
            return String.format("이름 : %s\t나이 : %d\t studentID : %s\tmajor : %s", name, age, studentID, major);
        }
    }
    class Employee extends Person{

    }

}
