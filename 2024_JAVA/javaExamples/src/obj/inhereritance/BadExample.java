package obj.inhereritance;

public class BadExample {
    //같은 내용을 자꾸 써버린다.
    class Teacher{
        // 이름과 나이 교번 담당 과목
        String name;
        int age;
        String teacherID;
        String subject;
        public String getDetail(){
            return String.format("이름 : %s\t나이 : %d\t teacherID : %s\subject : %s", name, age, teacherID, subject);
        }

    }
    class Student{
        String name;
        int age;
        String studentID;
        String major;
        public String getDetail(){
            return String.format("이름 : %s\t나이 : %d\t studentID : %s\tmajor : %s", name, age, studentID, major);
        }
    }
    class Employee{
        
        String name;
        int age;
        String companyId;
        String department;
        public String getDetail(){
            return String.format("이름 : %s\t나이 : %d\t companyId : %s\tmajor : %s", name, age, companyId, department);
        }
    }

}
