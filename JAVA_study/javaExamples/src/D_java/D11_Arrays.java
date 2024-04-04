package D_java;

import java.util.Arrays;

public class D11_Arrays {
    public static void main(String[] args) {
        double[] argOrg = {1.1,2.2,3.3,4.4,5.5};
        System.out.println("원본 배열");
        for (double b : argOrg){
            System.out.print(b+"\t");
        }
        System.out.println();

        //배열의 전체 복사
        double[] argCpy1 = Arrays.copyOf(argOrg,argOrg.length);
        System.out.println("전체 배열 복사");

        for(double d: argCpy1){
            System.out.print(d+"\t");
        }
        System.out.println();


        //처음부터 세번째 요소까지 복사
        double[] arrCpy2 = Arrays.copyOf(argOrg, 3);
        System.out.println("처음부터 세번째 요소까지 복사");
        for(double d: arrCpy2){
            System.out.print(d+"\t");
        }
        System.out.println();

        //1번 인덱스부터 3번 인덱스까지 복사
        double[] arrCpy3 = Arrays.copyOfRange(argOrg, 1,4);
        System.out.println("1번 인덱스부터 3번 인덱스까지 복사");
        for(double d: arrCpy3){
            System.out.print(d+"\t");
        }
        System.out.println();


        int[] score = { 75,47,23,56,89};
        System.out.println(Arrays.toString(score));

        //배열의 데이터를 오름차순으로 정렬
        int[] score2 = Arrays.copyOf(score, score.length);
        Arrays.sort(score2);

        System.out.println("오름차순으로 정렬");
        System.out.println(Arrays.toString(score2));

        // 배열 내부 데이터의 인덱스를 탐색하는 메서드
        int index = Arrays.binarySearch(score, 75);
        index = Arrays.asList(score).indexOf(75);
        System.out.println("75가 있는 인덱스 번호 : "+index);

        int[] score3 = Arrays.copyOf(score, score.length);
        score3[2] = 140;

        if(Arrays.equals(score, score3)){
            System.out.println("모두 일치");
        }
        else{
            System.out.println("일치합니다.");
        }
    }
}
