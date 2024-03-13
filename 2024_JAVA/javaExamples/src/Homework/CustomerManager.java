package Homework;

import java.util.Scanner;

public class CustomerManager {
    static final int MAX = 100;
    static Scanner s = new Scanner(System.in);
    static int count = 0;
    static int index = -1;
    public static void main(String[] args) {
        //이전에 만들어 놓은 고개관리 프로그램을 oop 형식으로 변경하여 재 프로그래밍 진행
        //Customer클래스를 생성하고
        //관련 프로그램을 위해 생성한 Customer 클래스 기준으로 재작성하세요

        Customer[] customer = new Customer[MAX];

        while (true) {
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
                        customer[count] = new Customer();
                        System.out.println("고객 정보를 저장했습니다.");
                        count++;
                    }
                break;
                case 'ㅔ':
                case 'P':
                    if(index>0){
                        index--;
                        System.out.println("이전 데이터를 출력합니다.");
                        customer[index].printCustomerData();
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
                        customer[index].printCustomerData();
                    }
                    else{ //이전 데이터가 존재하지 않으므로 동작하지 않는다.
                        System.out.println("다음 데이터가 존재하지 않습니다");
                    }
                break;
                case 'ㅊ':
                case 'C':
                    if((index>=0 )&&(index< count-1)){
                        System.out.println("현재 데이터를 출력합니다.");
                        customer[index].printCustomerData();
                    }
                    else{
                        System.out.println("출력할 데이터가 없어요");
                    }
                break;
                case 'ㅕ':
                case 'U':
                    customer[index].updateCustomerData();
                    break;
                case 'D':
                    System.out.println("해당 정보를 삭제하겠습니다.");
                    customer[index].printCustomerData();
                    for (int i =index;i<count-1; i++){
                        customer[i]=customer[i+1];
                    }
                    count--;
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
