package C_java;

import obj.Student;

public class C01_Class {

    public static void main(String[] args) {
        //학생의 클래스 Student로 학생의 실제 객체를 하나 생성한다.
        Student s = new Student();
        s.kor =100;
        s.eng = 99;
        s.name = "채현영";
        System.out.println(s);
        System.out.println(s.kor);        
        System.out.println(s.eng);
        System.out.println(s.name);
        System.out.println(s.getTotal());
        System.out.println(s.getName());


        //클래스 타입의 배열을 사용 할 수 있다.

        Student[] kids = new Student[100];

        for (int i = 0 ; i<kids.length;i++){
            kids[i]=new Student();
            kids[i].name="default name"+i;

        }
        Student s50=kids[50];
        System.out.println(s50.getName());

        int i =1;
        for(Student N : kids){
            System.out.println(i+"번째 학생의 이름 : "+N.name);
            i++;
        }
    }
    
}
