package week01;
import java.util.Scanner;
//import�� �ܺο� Ŭ������ �� ���̷� ������ ����ϰڴٴ� �ǹ�
//java.util.Scanner : java��Ű�� ���ο� util��Ű���� ��� �ִ� ScannerŬ������ ����ϰڴ�
//Ctrl + Shift + O : Eclipse�� �ڵ� import ����Ű 

public class B01_Scanner {

	public static void main(String[] args) {
		// Scanner Ŭ������ ��ü�� �ϳ� ����. ������ �����Ͽ� �۾�.... 
		// Ŭ������ ������Ÿ���Դϴ�. 
		Scanner scan = new Scanner(System.in);
		
		// Scanner�� ������� �Է��� ��ٸ���, 
		// �Է��� ���ڿ��� ���� �о� ����.
		System.out.print(">> ");
		String line = scan.nextLine();   // ������ Ÿ�Կ� ������ "."�� ���� �Ŀ� �ش� �������� ����.
		System.out.println("����ڰ� �Է��� ���ڿ� : "+line);
		
		// ������ Ÿ�� ������ .�� ���, ctrl + space�� �� Ÿ�Կ� ����� �� �ִ� ��ɵ�(�Լ���)�� �� �� ����.
//		System.out.print("has next boolean : ");
//		boolean b = scan.hasNextBoolean();
//		System.out.println("boolean ���� ���� : " + b);
		
		// ����� �Է°��� ��ٸ��鼭 �������� ó���ϴ� ���
		System.out.print("�ƹ� ���� ���̳� �Է��� ������>> ");
		int num = scan.nextInt();
		System.out.println("����ڰ� �Է��� ���� : "+num);
		System.out.println("����ڰ� �Է��� ������ ���� char : "+(char)num);
		
	}

}