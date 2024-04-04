package B_java;

public class B05_continue {
	public static void main(String[] args) {
//		반복문 내부에서만 사용이 가능하다
//		반목문에서 continue를 사용한다면 아래 내용을 실행하지 않고 다음 반복 회차로 이동한다.-> 조건식으로 이동
	
		for(int i =1;i<=100; i++) {
			if(i%2==1) 
				continue;
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i = 5;i<101;i=i+5) {
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i = 5;i<101;i++) {
			if(i%5!=0)
				continue;
			System.out.print(i+" ");
		}
		
	}

}
