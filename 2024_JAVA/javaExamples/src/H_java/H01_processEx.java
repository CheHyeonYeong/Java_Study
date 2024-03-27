package H_java;

public class H01_processEx {
    //스레드 (동시에 여러 프로그램 실행)
    public static void main(String[] args) {
        //프로세스 실행
        try {
            //메모장 실행
            Process p1 = Runtime.getRuntime().exec("notepad.exe");

            //그림판 실행
            Process p2 = Runtime.getRuntime().exec("mspaint.exe");

            p1.waitFor(); //p1 프로세스가 종료될 때까지 대기
            p2.destroy(); //p1 프로세스가 종료되면 실행함. destroy 강제 종료 시킨다.
            

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }

}
