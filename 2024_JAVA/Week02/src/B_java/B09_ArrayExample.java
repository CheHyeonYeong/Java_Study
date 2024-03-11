package B_java;

import java.util.Arrays;

public class B09_ArrayExample {
	public static void main(String[] args) {
		int[] num = new int[10];
		boolean[] win = {true, false, false, false, true};
		String[] welcome = new String[] {
				"���� �� ��̳���?",
				"���� ���ῡ ��´ٰ� �ϳ׿�", "������?"
		};
		System.out.println(welcome[0]);
		System.out.println(welcome[1]);
		System.out.println(welcome[2]);
		System.out.println("�迭�� ���� : " + welcome.length);
		System.out.println(args);  //�ŰԺ����� �޾Ƽ� ó����. ���ڿ��� �޾Ƶ��̰���.
		
		System.out.println("��ȭ�� for�� �̿��� �ݺ� ó��");
		for(String str : welcome)
			System.out.println(str);
		for (boolean result: win) {
			System.out.println("�·� : " +(result ? "��": "��"));
		}
		
		//�迭�� ���� ��� -> �޼��带 �Ⱦ��� �׳� �ּڰ��� ���´�! �׷��Ƿ� toString() �޼��带 ����ؼ� ������ �� �� �ִ�.
		System.out.println(Arrays.toString(welcome));
		
		String[] byeM = new String[] {"Good Bye", "see you", "bye bye"};
		String[] byeM2 = new String[10] ;
		
		System.out.println("���� ����");
		//�ּڰ��� �����Ѵ�.
		
//		byeM2 = byeM;
//		System.out.println(byeM2);
//		System.out.println(Arrays.toString(byeM2));
		
		System.arraycopy(byeM, 1, byeM2, 5, 2);
		System.out.println(Arrays.toString(byeM2));
		

	}
}
