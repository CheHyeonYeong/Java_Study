package H_java;

public class H06_ThreadEx {
    public static void main(String[] args) {
        //스레드 객체 생성
        DaemonThread dt1 = new DaemonThread();
        DaemonThread dt2 = new DaemonThread();

        //데몬 스레드로 설정
        dt1.setDaemon(true); //이걸로 데몬 스레드임을 알려준다!!
        dt2.setDaemon(true);

        dt1.start();
        dt2.start();

        try {
            Thread.sleep(5000);
        } catch (Exception e) { }
        System.out.println("main 종료");
        //종료하면 멈춰버린다.
    }
}

class DaemonThread extends Thread{

    @Override
    public void run() {
        while (true) {
            System.out.println(getName());
            try {
                sleep(500);
            } catch (InterruptedException e) {  }
        }
    }
}