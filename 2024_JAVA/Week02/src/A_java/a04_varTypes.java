package A_java;

public class a04_varTypes {
/*
 * - ������ : ���� ����, ���� ����, 0
    - byte (1byte)
    - char (2byte)
    - short (2byte)
    - int (4byte)
    - long (8byte)  : ū �������� ǥ���ϱ� ���� ���
    - 1byte (byte, char(c���))
        - signed : -128~ 127, unsigned : 0~255
    - 2byte(short, char(java))
        - signed : -2^15 ~ 2^15-1 , unsigned : 0~65535
    - 4byte (int)
        - signed : -2^31 ~ 2^31-1, unsigned : 0~4294967295 (2^32-1)
    - 8byte (long)
        - signed : -2^63 ~ 2^63-1
 */
	
	public static void main(String[] args) {
		byte _b= -128;
		short _s = 10;
		char _c = 65535;
		int _i = 2_100_000_000;
		long _l = 22_100_000_000L; //long�� ���� �ڿ� L�� ���
		
		System.out.println(_b);
		System.out.println(_s);
		System.out.println(_c);
		System.out.println(_i);
		System.out.println(_l);

		/*
		 * - �Ǽ��� : �׷��� ��꿡�� ���� ���
    		- �����ϰ� ��Ȯ�� ���� ����� �ʿ��� �о߿��� �ֿ� ����
		    - �ε��Ҽ��� ����� ���
		    - float(4byte) : �ڿ� f�� �پ�� ��
		    - double(8byte) **�⺻Ÿ��**
		- ����
		    - bool �� boolean
		- ������ (Ŭ���� Ÿ��), ����Ÿ��
		    - String (���ڿ�)
		    - �� �� ���Ÿ�� .. �빮�ڷ� �����ϴ� ��� Ÿ��
		    
		 -��ҹ��ڷ� Ÿ���� �� �� �ִµ�, �⺻Ÿ�԰� ���� Ÿ���� �ִ�.
		 */

		
	}
}
