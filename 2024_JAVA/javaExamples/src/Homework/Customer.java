package Homework;

import java.util.Scanner;

public class Customer {
    static final int MAX = 100;
    //고객 정보를 저장할 변수를 배열로 선언 : 이름, 성별, 이메일, 출생년도

    private String name;
    private String gender;
    private String email;
    private int birthYear; 
    Scanner s = new Scanner(System.in);
    //generate class super~ 라는 것으로 생성자를 자동으로 만들 수 있다.
    //getter, setter을 직접 만들 수 있다. 
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
    @Override
	public String toString() {
		return "Customer [name=" + name + ", gender=" + gender + ", email=" + email + 
				", birthYear=" + birthYear + "]";
	}

	// equals()를 Override하여 비교할 수 있게 만들어 보세요!!
	@Override
	public boolean equals(Object obj) {
		//동일 객체 확인
		if (this == obj) {
			return true;
		}
		// null값 확인
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Customer other = (Customer)obj;
		if(name == null) {
			if (other.name != null) {
				return false;
			}
		}else if (!name.equals(other.name)) return false;
		if (!gender.equals(other.gender)) return false;
		if (!email.equals(other.email)) return false;
		if (!(birthYear == other.birthYear)) return false;
		
		return true;
	}

}
