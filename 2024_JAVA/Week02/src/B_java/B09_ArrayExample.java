package B_java;

import java.util.Arrays;

public class B09_ArrayExample {
	public static void main(String[] args) {
		int[] num = new int[10];
		boolean[] win = {true, false, false, false, true};
		String[] welcome = new String[] {
				"오늘 뭐 드셨나요?",
				"오늘 저녁에 비온다고 하네요", "졸리죠?"
		};
		System.out.println(welcome[0]);
		System.out.println(welcome[1]);
		System.out.println(welcome[2]);
		System.out.println("배열의 길이 : " + welcome.length);
		System.out.println(args);  //매게변수를 받아서 처리함. 문자열로 받아들이겠음.
		
		System.out.println("강화된 for을 이용한 반복 처리");
		for(String str : welcome)
			System.out.println(str);
		for (boolean result: win) {
			System.out.println("승률 : " +(result ? "승": "패"));
		}
		
		//배열의 내용 출력 -> 메서드를 안쓰면 그냥 주솟값이 나온다! 그러므로 toString() 메서드를 사용해서 내용을 볼 수 있다.
		System.out.println(Arrays.toString(welcome));
		
		String[] byeM = new String[] {"Good Bye", "see you", "bye bye"};
		String[] byeM2 = new String[10] ;
		
		System.out.println("얕은 복사");
		//주솟값을 대입한다.
		
//		byeM2 = byeM;
//		System.out.println(byeM2);
//		System.out.println(Arrays.toString(byeM2));
		
		System.arraycopy(byeM, 1, byeM2, 5, 2);
		System.out.println(Arrays.toString(byeM2));
		

	}
}
