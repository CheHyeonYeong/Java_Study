package H_java;

public class H05_ThreadEx {
    public static void main(String[] args) {
        
        Account a = new Account();
        Mom m =new Mom(a);
        Son s =new Son(a);

        m.start();
        s.start();
        try {
            Thread.sleep(10000);    
        } catch (InterruptedException e) {}
        s.interrupt();
        m.interrupt();


    }
}

class Account{
    int money;
    synchronized void withdraw(){
        while (money ==0) {
            try {
                wait();
            } catch (InterruptedException e) {
                break; //예외 발생시 멈춰
            }
        }
        notifyAll();
        System.out.println(Thread.currentThread().getName()+money+"원 출금");
        money=0;
    }

    synchronized void deposit(){
        while (money>0) {
            try {
                wait();
            } catch (InterruptedException e) {
                break;
            }
        }
        
        money = (int)(((Math.random()*5)+1)*10000);
        notifyAll();
        System.out.println(Thread.currentThread().getName()+money+"원 입금");
    }
}

//엄마 스레드
class Mom extends Thread{
    Account a;
    public Mom(Account a){
        super("엄마");
        this.a = a;
    }
    @Override
    public void run() {
        while (true) {
            try {
                a.deposit();
                sleep((int)(Math.random()*2000));
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}

//아들 스레드
class Son extends Thread{
    Account a;
    public Son(Account a){
        super("아들");
        this.a = a;
    }
    @Override
    public void run() {
        while (true) {
            try {
                a.withdraw();
                sleep((int)(Math.random()*300));
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}