package week01;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class C_QuizPM {

    static void one(){
        //소수 출력 1~100
        int[] pNum = new int[100];
        int count =-1;
        for (int i =2; i<=100;i++){
            boolean flag = true;
            for (int j =2;j<i;j++){
                if(i%j==0){
                    flag=false;
                }
            }
            if(flag){
                count++;
                pNum[count]=i;
            }
        }
        for(int i =0;i<=count;i++){
            System.out.print(pNum[i]+"\t");
        }

    }
    static void two(){
        //단어 거꾸로 출력하기
        Scanner s = new Scanner(System.in);
        System.out.print("거꾸로 출력할 문자열을 작성해주세요 : ");
        String str = s.nextLine();
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
        s.close();

    }
    static void three(){
        //로또 번호 (1~45), 6개 번호 출력, 중복 x, sort 필요

        int[] numbers = new int[6];
        Random random = new Random();
        
        for (int i = 0; i < 6; i++) {
            int randomNumber;
            boolean isDuplicate;
            // 중복되지 않는 숫자 선택
            do {
                isDuplicate = false;
                randomNumber = random.nextInt(45) + 1;
                
                // 선택된 번호가 배열에 이미 존재하는지 확인
                for (int j = 0; j < i; j++) {
                    if (numbers[j] == randomNumber) {
                        isDuplicate = true;
                        break;
                    }
                }
            } while (isDuplicate);
            
            numbers[i] = randomNumber;
        }
        Arrays.sort(numbers);
        for(int i =0; i<6; i++){
            System.out.print(numbers[i]+"\t");
        }
    }
    static void four(){
        //대문자 입력하면 소문자 출력. 소문자 입력하면 대문자 출력

        Scanner s = new Scanner(System.in);
        System.out.print("영어를 입력하면 대소문자 변환해줍니다. : ");
        String str = s.nextLine();

        StringBuilder result = new StringBuilder();
        
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(c >= 'A' && c <= 'Z'){
                result.append((char)(c + 32)); // 대문자를 소문자로 변환
            }
            else if(c >= 'a' && c <= 'z'){
                result.append((char)(c - 32)); // 소문자를 대문자로 변환
            }
            else{
                result.append(c); // 알파벳이 아닌 경우 그대로 추가
            }
        }
        System.out.println(result);
        s.close();
    }
    static void five(){
        //커피 가격 2000원 -> 10개이상 구매시 초과분에 대해서 1500원 받음,
        //개수 입력+가격이 얼마인지 계산하여 출력하는 프로그램
        Scanner s = new Scanner(System.in);
        System.out.print("커피 가격 반환 프로그램 : ");
        int coffee = s.nextInt();
        int money = 0;
        if(coffee>=10){
            money = (10*2000)+((coffee-10)*1500);
        }
        else{
            money = coffee*2000;
        }
        System.out.println("총 액은 "+money+"원 입니다.");
        s.close();

    }
    static void six(){
        //랜덤 알파벳대문자 50개 출력
        //10줄마다 줄바꿈해서 출력됨.

        Random random = new Random();
        char k;
        
        for (int i=0;i<5;i++){
            for(int j = 0;j<10;j++){
                k= (char)random.nextInt(65,90);
                System.out.print(k);
            }
            System.err.println();
        }
        

    }

    public static void main(String[] args) {
        // one();   
        // two();
        // three();
        // four();
        // five();
        six();
    }
}
