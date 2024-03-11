package A_java;

public class a04_varTypes {
/*
 * - 정수형 : 양의 정수, 음의 정수, 0
    - byte (1byte)
    - char (2byte)
    - short (2byte)
    - int (4byte)
    - long (8byte)  : 큰 정수값을 표기하기 위해 사용
    - 1byte (byte, char(c언어))
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
		long _l = 22_100_000_000L; //long은 정수 뒤에 L을 사용
		
		System.out.println(_b);
		System.out.println(_s);
		System.out.println(_c);
		System.out.println(_i);
		System.out.println(_l);

		/*
		 * - 실수형 : 그래픽 계산에서 많이 사용
    		- 복잡하고 정확한 수학 계산이 필요한 분야에서 주요 사용됨
		    - 부동소수점 방식을 사용
		    - float(4byte) : 뒤에 f를 붙어야 함
		    - double(8byte) **기본타입**
		- 논리형
		    - bool → boolean
		- 참조형 (클래스 타입), 참조타입
		    - String (문자열)
		    - 그 외 모든타입 .. 대문자로 시작하는 모든 타입
		    
		 -대소문자로 타입을 알 수 있는데, 기본타입과 참조 타입이 있다.
		 */

		
	}
}
