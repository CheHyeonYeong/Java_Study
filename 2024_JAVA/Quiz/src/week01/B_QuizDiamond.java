package week01;
import java.util.Scanner;


public class B_QuizDiamond {
    	
	static void diamond() {
		// 1. 다음과 같은 형태로 별직기를 진행해 보세요
		/*힌트  : 공백, 별, 단(줄)
				      *
				     ***
				    *****
				   *******
				  *********
				   *******
				    *****
				     ***
				      * 				 */
		int size = 5; // 별의 최대 개수
		System.out.println("diamond 출력");

        for (int i = 1; i <= size; i++) {
            for (int j = size - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = size - 1; i >= 1; i--) {
            for (int j = size - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

	}
	static void diamondtwo() {

				// 2. 1번의 코드를 활용하여 줄 수를 입력 받아서 그 줄 수 에 맞는 다이아몬드 별을 찍는 
		 		//   프로그램을 작성해 보세요. (단, 줄은 홀수로만 입력 받아야 합니다.)

		Scanner s = new Scanner(System.in);
		System.out.println("홀수만 입력하면 다이아몬드를 출력해주는 여자");
		int size = s.nextInt(); // 별의 최대 개수

        for (int i = 1; i <= size; i++) {
            for (int j = size - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = size - 1; i >= 1; i--) {
            for (int j = size - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        s.close();
	}
    static void flagArg() {
        Scanner s = new Scanner(System.in);
        //줄 수를 입력받는 부분
        System.out.println("줄 수를 입력해주세요, 짝수일 경우 어그러집니다. : ");
        int dan = s.nextInt();
        int sp = dan /2; //여백
        int st =1; //별
        boolean flag = true; //true : 삼각형, false : 역삼각형

        for (int i = 0;i<dan ;i++){
            //flag 기법, boolean 알고리즘, 특정 내용만 바뀌게 된다~
            for(int j =0; j<sp;j++){
                System.out.print(" ");
            }
            for (int j = 0; j<st;j++){
                System.out.print("*");
            }
            System.out.println();
            if(i==(dan/2)){flag= false;}
            if(flag){sp -=1; st +=2;}
            else{sp+=1;st-=2;}
            System.out.println();
        }
        s.close();
    }

    static void plaindiamond(){
        Scanner s = new Scanner(System.in);
        //줄 수를 입력받는 부분
        System.out.println("줄 수를 입력해주세요, 짝수일 경우 어그러집니다. : ");
        int dan = s.nextInt();
        int sp = dan /2; //여백
        int st =1; //별
        boolean flag = true; //true : 삼각형, false : 역삼각형

        
        System.out.println("*");
        for (int i = 0;i<dan ;i++){
            //flag 기법, boolean 알고리즘, 특정 내용만 바뀌게 된다~
            for(int j =0; j<sp;j++){
                System.out.print(" ");
            }
            
            System.out.print("*");
            for (int j = 0; j<st-1;j++){
                System.out.print(" ");
            }
            System.out.println("*");
            if(i==(dan/2)){flag= false;}
            if(flag){sp -=1; st +=2;}
            else{sp+=1;st-=2;}
            System.out.println();
        }
        
        System.out.println("*");
        s.close();

    }
    
    static void dalerdiamond(){
        
        Scanner scna = new Scanner(System.in);
        //줄 수를 입력받는 부분
        System.out.println("줄 수를 입력해주세요, 짝수일 경우 어그러집니다. : ");
        int line = scna.nextInt();
        int sp = line /2; //여백
        int st =1; //별
        boolean flag = true; //true : 삼각형, false : 역삼각형

        System.out.println("*");
        for (int i = 0;i<line ;i++){
            //flag 기법, boolean 알고리즘, 특정 내용만 바뀌게 된다~
            for(int j =0; j<sp;j++){
                System.out.print(" ");
            }
            
            System.out.print("*");
            for (int j = 0; j<st-1;j++){
                System.out.print("$");
            }
            System.out.println("*");
            if(i==(line/2)){flag= false;}
            if(flag){sp -=1; st +=2;}
            else{sp+=1;st-=2;}
            System.out.println();
        }
        System.out.println("*");
        scna.close();


    }
    
    public static void main(String[] args) {
     
		// diamond();
		 
		// diamondtwo();	
        // flagArg();   
        // plaindiamond();   
        dalerdiamond();
    }

    
}
