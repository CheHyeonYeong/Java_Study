package H_java;

public class H03_ThreadEx {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable (){
            @Override
            public void run() {
                for(int i = 0; i<20; i++){
                    System.out.println("t1 : "+i);
                    try {
                        Thread.sleep(1000);
                        if(Thread.interrupted()){
                            System.out.println("인터럽트 발생 -> 종료");
                            break;
                        }
                    } catch (InterruptedException e) {
                        System.out.println(e.getMessage());
                        // System.exit(0);
                    }
                }
                System.out.println("스레드 실행종료");
            }
        });
        t1.start();

        //interrupt() 메서드
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
 
        }
        t1.interrupt();
    }
}

class Sum extends Thread {

    
}