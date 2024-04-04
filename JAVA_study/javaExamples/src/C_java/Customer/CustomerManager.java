package C_java.Customer;

import java.util.Scanner;

public class CustomerManager {
    static final int MAX = 100;
    //고객 정보를 저장할 변수를 배열로 선언 : 이름, 성별, 이메일, 출생년도

    static String[] nameList = new String[MAX];
    static String[] genderList = new String[MAX];
    static String[] emailList = new String[MAX];
    static int[] birthYearList = new int[MAX]; 
    static int index = -1; //배열 참조 인덱스 배열의 인덱스 시작은 0부터기 때문에 최소는 -1이 되어야 한다.

    //배열에 처음 선언 크기보다 같거나 작은 개수의 자료를 저장하고 
    // 현재 데이터가 몇 개 저장되어 있는지 알 수 있는 변수가 필요하다.
    
    static int count =0;
    //기본 입력장치로부터 데이터를 입력 받기 위해서 Scanner을 받아놓는다.
    static Scanner s = new Scanner(System.in);

    static void insertCustomerData(){
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
        nameList[count] = name;
        genderList[count] = gender;
        emailList[count] = email;
        birthYearList[count] = birthYear;
        count++;
    }
    static void printCustomerData(int index){
        //고객 정보 출력
        System.out.println("==========Customer==========");
        System.out.println("이름 : "+nameList[index]);
        System.out.println("성별 : "+genderList[index]);
        System.out.println("이메일 : "+emailList[index]);
        System.out.println("출생년도 : "+birthYearList[index]);
        System.out.println("==========Customer==========");
    }
    static void updateCustomerData(int index){
        
        System.out.println("==========Update Customer Info==========");
        System.out.print("이름 : " +nameList[index]+ " -> : ");
        String name = s.next();
        if(name.length()!=0){
            nameList[index] = name;
        }
        System.out.print("성별 : " +genderList[index] + " -> : ");
        String gender = s.next();
        
        if(gender.length()!=0){
            genderList[index] = gender;
        }
        System.out.print("이메일 : " +emailList[index]+ " -> : ");
        String email = s.next();
        if(email.length()!=0){
            emailList[index] = email;
        }
        System.out.print("출생년도 : " +birthYearList[index]+ " -> : ");
        int birthYear = s.nextInt();
        if(birthYear != 0){
            birthYearList[index] = birthYear;
        }   
    }

    static void deleteCustomerData(int index){
        for (int i =index;i<count-1; i++){
            nameList[i]=nameList[i+1];
            genderList[i]=genderList[i+1];
            emailList[i]=emailList[i+1];
            birthYearList[i]=birthYearList[i+1];
        }
        count--;
    }
    public static void main(String[] args) {
        //고객 관리 프로그램 메뉴
        while(true){
            //고객 메뉴 UI(Text UI)
            System.out.printf("[INFO] 고객 수 : %d, 인덱스 : %d\n", count, index);
            System.out.println("메뉴를 입력하세요");
            System.out.println("(I)nsert, (P)revious, (N)ext, (C)urrent, (U)pdate, (D)elete, (Q)uit");
            System.out.print("메뉴 입력 : ");
            String menu = s.next();
            menu = menu.toUpperCase();//대소문자 구분을 안하기 위함

            switch (menu.charAt(0)) {
                case 'ㅑ':
                case 'I':
                    if(count>=MAX)
                        System.out.println("더 이상 저장할 수 없습니다.");
                    else{
                        System.out.println("고객 정보 입력을 시작합니다.");
                        insertCustomerData();
                        System.err.println("고객 정보를 저장했습니다.");
                    }
                break;
                case 'ㅔ':
                case 'P':
                    if(index>=0){
                        index--;
                        System.out.println("이전 데이터를 출력합니다.");
                        printCustomerData(index);
                    }
                    else{ //이전 데이터가 존재하지 않으므로 동작하지 않는다.
                        System.out.println("이전 데이터가 존재하지 않습니다");
                    }
                break;
                case 'ㅜ':
                case 'N':
                    if(index<count-1){
                        index++;
                        System.out.println("다음 데이터를 출력합니다.");
                        printCustomerData(index);
                    }
                    else{ //이전 데이터가 존재하지 않으므로 동작하지 않는다.
                        System.out.println("다음 데이터가 존재하지 않습니다");
                    }
                break;
                case 'ㅊ':
                case 'C':
                    if((index>=0 )&&(index< count-1)){
                        System.out.println("현재 데이터를 출력합니다.");
                        printCustomerData(index);
                    }
                    else{
                        System.out.println("출력할 데이터가 없어요");
                    }
                break;
                case 'ㅕ':
                case 'U':
                    updateCustomerData(index);
                    break;
                case 'D':
                    deleteCustomerData(index);
                    break;
                case 'ㅂ':
                case 'Q':
                    System.out.println("프로그램을 종료합니다.");
                    s.close();
                    System.exit(0); //static 메소드임을 알려준다.
                break;
                default:
                    System.out.println("잘못입력하셨어요, 다시 입력하세용");
                break;
            }
        }
    }


}
