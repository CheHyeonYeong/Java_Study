package quiz.F_quiz;

import java.io.*;
import java.util.*;


public class F03_PhoneBook {
    public static PhoneBook loadPhoneBook() {
        PhoneBook phoneBook = null;
        try {
            FileInputStream fileIn = new FileInputStream("phonebook.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            phoneBook = (PhoneBook) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return phoneBook;
    }

    public static void main(String[] args) {
        PhoneBook book = loadPhoneBook();
        if (book == null) {
            book = new PhoneBook();
        }
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("==== What to do ====");
            System.out.println("1. New Group");
            System.out.println("2. Print");
            System.out.println("3. New Address");
            System.out.println("4. Find Phone");
            System.out.println("5. Find Name");
            System.out.println("6. Exit");
            System.out.print("> ");
            int behavior = sc.nextInt();
            sc.nextLine();
       
            switch (behavior) {
            case 1:
                String gString = sc.nextLine();
                book.addGroup(gString);
               break;
            case 2:
               book.printAll();
               break;
            case 3:
                System.out.print("그룹을 선택하세요: ");
                String group = sc.nextLine();
                System.out.print("전화번호를 입력하세요: ");
                String phoneNumber = sc.nextLine();
                System.out.print("이름을 입력하세요: ");
                String name = sc.nextLine();
                book.addPhoneNumber(group, phoneNumber, name);
                break;
            case 4:
                System.out.print("검색할 전화번호 일부를 입력하세요: ");
                String partialNumber = sc.nextLine();
                book.searchByPartialNumber(partialNumber);
                break;
            case 5:
                System.out.print("검색할 이름을 입력하세요: ");
                String searchName = sc.nextLine();
                book.searchByName(searchName);
                break;
            case 6:
                System.out.println("프로그램을 종료합니다.");
                book.savePhoneBook();
                sc.close();
                System.exit(0);
            default:
                System.out.println("메뉴 선택을 잘못했습니다");
               break;
            }
         }
       
    }
}

class PhoneBook implements Serializable{
    private static final long serialVersionUID =1L;
    private HashMap<String, HashMap<String, String>> phoneBook;
    File saveFile = null;
    String svaePath = "saveFile/phonebook.sav";

    public PhoneBook() {

        //객체 생성시 파일에 저장된 내용을 불러오는 동작!!
        //파일이 존재하면 내용을 불러오고 파일이 없다면 생성한다.
        this.phoneBook = new HashMap<>();
    }

    public void addGroup(String group){
        if(!phoneBook.containsKey(group)){
            phoneBook.put(group, new HashMap<>());
            savePhoneBook();
            System.out.println("그룹 "+group+"을 추가했어용");
        }
        else{
            System.out.println("이미 존재하는 그룹이에요!");
        }
    }

   void printAll(){
        System.out.println("전화번호부 목록");
        for(String gString: phoneBook.keySet()){
            System.out.println("그룹 : "+gString);
            HashMap<String, String> numbers = phoneBook.get(gString);
            if(numbers.keySet().size()==0){
                System.out.println("비어있음");
            }
            else{
                for(String numString : numbers.keySet()){ //전화번호가 키로 쓰고, value가 이름이다   
                    System.out.println("전화번호 : "+numString+"이름 : "+numbers.get(numString));
                }
            }
        }
   }
   void addPhoneNumber(String group, String number, String name){
        if(phoneBook.containsKey(group)){
            phoneBook.get(group).put(number, name);
            // 중복 여부를 확인해야 한다.

            savePhoneBook();
            System.out.println("전화번호 "+number+"를 그룹 "+group+"에 추가했습니다.");
        }
        else{
            System.out.println("존재하지 않는 그룹입니다.");
        }
   }
   public void searchByPartialNumber(String partialNumber) {
        System.out.println("일치하는 전화번호를 찾습니다: " + partialNumber);
        for (String group : phoneBook.keySet()) {
            HashMap<String, String> numbers = phoneBook.get(group);
            for (String number : numbers.keySet()) {
                if (number.contains(partialNumber)) {
                    System.out.println("전화번호: " + number + ", 이름: " + numbers.get(number) + " (그룹: " + group + ")");
                }
            }
        }
    }
    public void searchByName(String name) {
        System.out.println("'" + name + "' 이름으로 검색합니다:");
        for (String group : phoneBook.keySet()) {
            HashMap<String, String> numbers = phoneBook.get(group);
            for (String number : numbers.keySet()) {
                if (numbers.get(number).equals(name)) {
                    System.out.println("이름: " + name + ", 전화번호: " + number + " (그룹: " + group + ")");
                }
            }
        }
    }
    void savePhoneBook(){
        try{
            FileOutputStream fileOut = new FileOutputStream("phonebook.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(this);
            out.close();
            fileOut.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    


    
}
