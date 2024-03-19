package week01;

public class B_QuizStar {
	private static void one() {
		System.out.println("1번");
		for (int i = 1;i < 6; i++) {
			 for (int j = 1; j <= i; j++) {
	                System.out.print("*");
	            }
			 System.out.println();
		}
	}
	private static void two() {
		System.out.println("2번");
	    for (int i = 5; i >= 1; i--) {
	        for (int j = 1; j <= i; j++) {
	            System.out.print("*");
	        }
	        System.out.println();
	    }
	}
	private static void three() {
		System.out.println("3번");
		for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 6 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }	   	
	}

	private static void four() {
		System.out.println("4번");
		for (int i = 1; i <= 5; i++) {

            for (int k = 1; k < i; k++) {
            	System.out.print(" ");
            }
            for (int j = 1; j <= 6 - i; j++) {
                
                System.out.print("*");
            }
            System.out.println();
        }	   	
	}


	private static void five() {
		System.out.println("5	번");
		for (int i =0;i<5;i++) {
			for (int j = 0; j < 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i*2 +1; k++) {
                System.out.print("*");
            }
            System.out.println();
		}
	}
	private static void six() {
	    System.out.println("6번");
	    for (int i = 5; i >= 1; i--) {
	        for (int j = 1; j <= 5 - i; j++) {
	            System.out.print(" ");
	        }
	        for (int k = 1; k <= (i * 2) - 1; k++) {
	            System.out.print("*");
	        }
	        System.out.println();
	    }
	}

		
	public static void main(String[] args) {
		one();
		two();
		three();
		four();
		five();
		six();
	}
}
