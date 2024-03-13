package Homework;

import java.util.Scanner;

public class Customer {
    static final int MAX = 100;
    //고객 정보를 저장할 변수를 배열로 선언 : 이름, 성별, 이메일, 출생년도

    String name;
    String gender;
    String email;
    int birthYear; 
    Scanner s = new Scanner(System.in);

    Customer(){
        //이름, 성별, 이메일, 출생년도 입력 받음
        System.out.print("이름 : " );
        String name = s.next();
        System.out.print("성별 : " );
        String gender = s.next();
        System.out.print("이메일 : " );
        String email = s.next();
        System.out.print("출생년도 : " );
        int birthYear = s.nextInt();
        
        //고객의 객체를 배열에 저장해야 한다.
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.birthYear = birthYear;
    }
    void printCustomerData(){
        //고객 정보 출력
        System.out.println("==========Customer==========");
        System.out.println("이름 : "+name);
        System.out.println("성별 : "+gender);
        System.out.println("출생년도 : "+ birthYear);
        System.out.println("==========Customer==========");
    }
    void updateCustomerData(){
        
        System.out.println("==========Update Customer Info==========");
        System.out.print("이름 : " + this.name + " -> : ");
        String name = s.next();
        if(name.length()!=0){
            this.name = name;
        }
        System.out.print("성별 : " + this.gender + " -> : ");
        String gender = s.next();
        
        if(gender.length()!=0){
            this.gender = gender;
        }
        System.out.print("이메일 : " + this.email + " -> : ");
        String email = s.next();
        if(email.length()!=0){
            this.email = email;
        }
        System.out.print("출생년도 : " +this.birthYear+ " -> : ");
        int birthYear = s.nextInt();
        if(birthYear != 0){
            this.birthYear = birthYear;
        }   
    }

}
