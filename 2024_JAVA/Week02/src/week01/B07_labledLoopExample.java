package week01;

public class B07_labledLoopExample {
	public static void main(String[] args) {
//		���� �տ� �̸��� ���� �� : �� ���
		outer: for(int i = 0; i<3;i++) {
			for (int j =0;j<3;j++) {
				if(j ==2) {
					//break;
					break outer; //���̺��� outer�� �ݺ����� ����
				}
				System.out.println(i+"\t"+j);
			}
		}
		
		
	}
}
