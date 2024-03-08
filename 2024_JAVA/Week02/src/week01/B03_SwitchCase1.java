package week01;

public class B03_SwitchCase1 {
	public static void main(String[] args) {
		//switch case
		int jumsu = (int) (Math.random()*110);
		char a = 'A';
		switch(jumsu/10) {
		case 9 :
			System.out.printf("%c",a);
			break;
		case 8:
			System.out.printf("%c",a+1);
			break;
		case 7:
			System.out.printf("%c",a+2);
			break;
		case 6:
			System.out.printf("%c",a+3);
			break;
		case 5:
			System.out.printf("%c",a+4);
			break;
		case 4:
			System.out.printf("%c",a+5);
			break;
		default:
			System.out.printf("Àç¼ö°­");
		}
	}
}
