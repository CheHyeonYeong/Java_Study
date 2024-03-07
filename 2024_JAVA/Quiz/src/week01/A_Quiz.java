package week01;

public class A_Quiz {
	
	public static void main(String[] args) {
		String name="홍길동";
		int age=24;
		String tel= "010-2345-4567";
		int height=187;
		int weight = 87;
		char bloodType='O';
		
		System.out.println(
				"====================\n"
				+ " 	  /)/)\n"
				+ "	(  ..)\r\n"
				+ "	(   >♡\r\n"
				+ "Have a Good Time.\n"
				+ "===================="
				);
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println(
				  "   #### 회비 정보 ####\n"
				+ "============================\n"
				+ "이름 나이 전화번호 회비\n"
				+ "============================\n"
				+ "홍길홍 \"15\" 010-123-1234 ₩20,000\n"
				+ "임꺽정 \"20\" 010-234-2345 ₩30,000\r\n"
				+ ""
				+ "김말이 \"28\" 010-345-3456 ₩50,000\n"
				+ "---------------------------\n"
				+ "총합계                   ₩100,000\n"

				+ "============================\n"
				);		
		System.out.println();
		System.out.println();
		System.out.println();

		System.out.println("\n=====출력결과=====");
		System.out.println();
		System.out.printf("이름: %s \n나이: %d\nTel: %s\n키: %d \n몸무게:%d\n혈액형: %c", name, age, tel, height,weight, bloodType);

	
		System.out.printf("\n%.2f",(37.00/12));
	
	}
	
	

}
