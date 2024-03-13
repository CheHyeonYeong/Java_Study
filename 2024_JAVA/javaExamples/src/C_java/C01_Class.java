package C_java;

import obj.Pen;
import obj.Student;

public class C01_Class {

    public static void main(String[] args) {
        //학생의 클래스 Student로 학생의 실제 객체를 하나 생성한다.
        Student s = new Student();
        s.kor =100;
        s.eng = 99;
        s.name = "채현영";
        // System.out.println(s);
        // System.out.println(s.kor);        
        // System.out.println(s.eng);
        // System.out.println(s.name);
        // System.out.println(s.getTotal());
        // System.out.println(s.getName());


        //클래스 타입의 배열을 사용 할 수 있다.

        Student[] kids = new Student[100];

        for (int i = 0 ; i<kids.length;i++){
            kids[i]=new Student();
            kids[i].name="default name"+i;

        }
        Student s50=kids[50];
        System.out.println(s50.getName());

        // int i =1;
        // for(Student N : kids){
        //     System.out.println(i+"번째 학생의 이름 : "+N.name);
        //     i++;
        // }

        // 인스턴스 객제 생성
        // 객체 생성 명령어 
        // ClassName instanceName = new Constructor();
        // 생성자는 클래스 이름과 같음
        // 생성자의 역할은 맴버변수(속성) 초기화 혹은 클래스 구동을 위한 사전동작을 구현

        Pen redPen = new Pen();
        redPen.color="red";
        System.out.println(redPen);
        System.out.println(redPen.color);
        //쓰기
        redPen.write();

        Pen pen1 = new Pen();
        System.out.println(pen1.color);
    }    
}
