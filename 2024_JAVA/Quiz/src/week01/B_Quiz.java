package week01;

import java.util.Random;
import java.util.Scanner;

public class B_Quiz {

	public static void one() {
		//1. 1~101 �̸��� ������ �����ϰ� �� ������ Ȧ¦�� �����ض� 3�� ����
		System.out.println("1��");
		int rand = (int)(Math.random()*100+1);
		String answer = (rand%2==0)?"¦":"Ȧ";
		System.out.println(answer);
	}
	public static void two() {
		System.out.println("2��");
		//2. -5~5������ ������ ������ �����ϰ� ���׿������ ����Ͽ� ���밪�� ����ϼ���
		 Random random = new Random();
	     int randomNumber = random.nextInt(11) - 5;
	     String answer = (randomNumber < 0) ? Integer.toString(randomNumber * (-1)) : Integer.toString(randomNumber);
	     System.out.println("������ ����: " + answer);
		
	}
	public static void three() {
		//������ �Է¹޾� Ȧ¦���� �Ǻ� 3�׿���
		System.out.println("3��");
		Scanner s = new Scanner(System.in);
		System.out.println("������ �Է��Ͻÿ�");
		int i = s.nextInt();
		String answer = (i%2==0)?"¦":"Ȧ";
		System.out.println(answer);
		s.close();
	}

	public static void four() {
		//Ű�� ���̸� �Է¹޾Ƽ� height >=140, age >=8 ���̱ⱸ ž�� ���� ���� ���α׷� �ۼ�
		Scanner scan = new Scanner(System.in);
		System.out.println("Ű�� �Է��Ͻÿ�");
		int key = scan.nextInt();
		System.out.println("���̸� �Է��Ͻÿ�");
		int age = scan.nextInt();
		if(key>=140 &&age>=8) {
			System.out.println("ž�� ����");
		}
		else {
			System.out.println("ž�� �Ұ���");
		}
		scan.close();
	}

	public static void five() {
		//2�� ���� �Է� �� max, same�� ���ٰ� ���
		
		Scanner s = new Scanner(System.in);
		System.out.println("���� �Է��Ͻÿ�");
		int i = s.nextInt();
		System.out.println("���� �Է��Ͻÿ�");
		int age = s.nextInt();
		if(i==age) {
			System.out.println("���� ���ƿ�");
		}
		else {
			if(i>age) {
				System.out.println(i+"�� Ŀ��");
			}
			else {
				System.out.println(age+"�� Ŀ��");
			}
		}
		s.close();
	}
	public static void six() {
		//������ �Է¹޾Ƽ� +�� ��� Ȧ¦ ����, 0�̸� 0�Դϴ� ���, ������ ��쿡�� ���� �����Դϴٸ� �Է��ϴ� ���α׷��� �ۼ�
		Scanner s = new Scanner(System.in);
		System.out.println("���� �Է��Ͻÿ�");
		int i = s.nextInt();
		if(i>0) {
			String answer = (i%2==0)?"¦":"Ȧ";
			System.out.println(answer);
		}
		else if(i==0) {
			System.out.println("0");
		}
		else {
			System.out.println("����");
		}
		s.close();
	}
	public static void seven() {
		//���Ž� ���� ��� ���α׷�, �Է� �޾ƾ� ��
		//String[] a = ["����", "���","���","����","��"];
		Scanner s = new Scanner(System.in);
		System.out.println("������ ���� �Է��Ͻÿ� \n\"����\", \"���\",\"���\",\"����\",\"��\"");
		String menu = s.nextLine();
		switch(menu) {
		case "����":
			System.out.println("1000��");
			break;
		case "���":
			System.out.println("1500��");
			break;
		case "���":
			System.out.println("1800��");
			break;
		case "����":
			System.out.println("1505465��");
			break;
		case "��":
			System.out.println("123456��");
			break;
		default:
			System.out.println("�߸� �Է��߽��ϴ�.");
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
