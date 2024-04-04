package H_java;

public class H07_ThreadEx {
    public static void main(String[] args) {
        //스레드 설정 그룹
        //1. 그룹 객체 생성
        ThreadGroup group = new ThreadGroup("group1");
        
        //2. 스레드 그룹에 스레드 추가
        MyThread t1 = new MyThread(group, "t1");
        MyThread t2 = new MyThread(group, "t2");
        MyThread t3 = new MyThread(group, "t3");

        //3. 스레드 그룹 시작
        t1.start();
        t2.start();
        t3.start();

        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            // TODO: handle exception
        }
        
        group.interrupt();
        System.out.println("그룹 스레드 숫자 : "+group.activeCount());
        System.out.println("그룹 숫자 : "+group.activeGroupCount());

        group.checkAccess();

        group.destroy();
        group.isDaemon();

        System.out.println("그룹의 부모를 리턴 "+ group.getParent());

        group.list();
    }

}

class MyThread extends Thread{

    public MyThread(ThreadGroup g, String name){
        super(g,name);

    }
    @Override
    public void run() {
        while(true){
            System.out.println(getName());
            try {
                sleep(500);
            } catch (Exception e) {
                System.out.println(e.getMessage() + "interrupt 발생");
                break;
            }
        }
        System.out.println(getName()+ "종료");
    }
}