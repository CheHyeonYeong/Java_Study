package quiz.B_quiz;

import java.util.Random;
import java.util.Scanner;

public class B_Quiz {

	public static void one() {
		//1. 1~101 미만의 정수를 생성하고 그 숫자의 홀짝을 구분해라 3항 연산
		System.out.println("1번");
		int rand = (int)(Math.random()*100+1);
		String answer = (rand%2==0)?"짝":"홀";
		System.out.println(answer);
	}
	public static void two() {
		System.out.println("2번");
		//2. -5~5사이의 임의의 정수를 생성하고 삼항연산식을 사용하여 절대값을 출력하세요
		 Random random = new Random();
	     int randomNumber = random.nextInt(11) - 5;
	     String answer = (randomNumber < 0) ? Integer.toString(randomNumber * (-1)) : Integer.toString(randomNumber);
	     System.out.println("임의의 정수: " + answer);
		
	}
	public static void three() {
		//정수를 입력받아 홀짝인지 판별 3항연산
		System.out.println("3번");
		Scanner s = new Scanner(System.in);
		System.out.println("정수를 입력하시오");
		int i = s.nextInt();
		String answer = (i%2==0)?"짝":"홀";
		System.out.println(answer);
		s.close();
	}

	public static void four() {
		//키와 나이를 입력받아서 height >=140, age >=8 놀이기구 탑승 여부 결정 프로그램 작성
		Scanner scan = new Scanner(System.in);
		System.out.println("키를 입력하시오");
		int key = scan.nextInt();
		System.out.println("나이를 입력하시오");
		int age = scan.nextInt();
		if(key>=140 &&age>=8) {
			System.out.println("탑승 가능");
		}
		else {
			System.out.println("탑승 불가능");
		}
		scan.close();
	}

	public static void five() {
		//2개 정수 입력 후 max, same시 같다고 출력
		
		Scanner s = new Scanner(System.in);
		System.out.println("수를 입력하시오");
		int i = s.nextInt();
		System.out.println("수를 입력하시오");
		int age = s.nextInt();
		if(i==age) {
			System.out.println("둘이 같아요");
		}
		else {
			if(i>age) {
				System.out.println(i+"가 커요");
			}
			else {
				System.out.println(age+"가 커요");
			}
		}
		s.close();
	}
	public static void six() {
		//정수를 입력받아서 +인 경우 홀짝 구분, 0이면 0입니다 출력, 음수인 경우에는 음의 정수입니다를 입력하는 프로그램을 작성
		Scanner s = new Scanner(System.in);
		System.out.println("수를 입력하시오");
		int i = s.nextInt();
		if(i>0) {
			String answer = (i%2==0)?"짝":"홀";
			System.out.println(answer);
		}
		else if(i==0) {
			System.out.println("0");
		}
		else {
			System.out.println("음수");
		}
		s.close();
	}
	public static void seven() {
		//구매시 가격 출력 프로그램, 입력 받아야 함
		//String[] a = ["수박", "사과","멜론","포도","귤"];
		Scanner s = new Scanner(System.in);
		System.out.println("사고싶은 것을 입력하시오 \n\"수박\", \"사과\",\"멜론\",\"포도\",\"귤\"");
		String menu = s.nextLine();
		switch(menu) {
		case "수박":
			System.out.println("1000원");
			break;
		case "사과":
			System.out.println("1500원");
			break;
		case "멜론":
			System.out.println("1800원");
			break;
		case "포도":
			System.out.println("1505465원");
			break;
		case "귤":
			System.out.println("123456원");
			break;
		default:
			System.out.println("잘못 입력했습니다.");
			break;
		}
		s.close();
	}
	public static void main(String[] args) {
		
//		one();
//		two();
//		three();
//		four();
//		five();
//		six();
		seven();
		
		
		
	}

}
