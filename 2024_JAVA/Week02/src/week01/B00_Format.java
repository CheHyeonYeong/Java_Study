package week01;

public class B00_Format {
	public static void main(String[] args) {
		
		int a = 10;
		float b= 10.234f;
		char c= 'T';
		String d = "string";
		System.out.printf("정수형은 %d, 실수형은 %.3f, 한글자는 %c, 문자열은 %s",a,b,c,d);
		
		a=100;
		System.out.printf("\n%10d",a); //제어문 앞에 숫자는 출력 값의 자리수, 10칸 중에 d가 출력되게끔 함, 10칸보다 넓어지면 그냥 넓어짐
		
		String name="홍길동";
		int age=24;
		String tel= "010-2345-4567";
		int height=187;
		int weight = 87;
		char bloodType='O';
		
		
		System.out.println();

		System.out.println("\n=====출력결과=====");
		System.out.println();
		System.out.printf("이름: %s \n나이: %d\nTel: %s\n키: %d \n몸무게:%d\n혈액형: %c", 
				name, age, tel, height,weight, bloodType);

	
		System.out.printf("\n%.2f",(37.00/12));
	
		
	}
	

}
