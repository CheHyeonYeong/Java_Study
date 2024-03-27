package H_java;

public class H02_threadEx {
    public static void main(String[] args) {
        Thread t1= new ThreadExtends();
        t1.run();

        Runnable r = new RunnableImpl();
        Thread t2 = new Thread(r);
        //동시에 개별적으로 실행을 한다!!!


        //익명 함수를 이용해서 구현
        Thread t3 = new Thread(new Runnable() {
            
            @Override
            public void run() {
                System.out.println("Runnable 구현하는 방법으로 실행");
                for(int i=0;i<50;i++){
                    System.out.println("Thred3 : "+i);
                }     
            }
        });

        
		// 람다식 표현
		Thread t4 = new Thread(() -> {
			System.out.println("t4 스레드 시작");
			for (int i = 0; i < 500; i++) {
				System.out.println("Thread4: "+i);
			}
		});


		// 스레드 우선순위
		//  스레드가 가질 수 있는 우선 순위는 1 ~ 10 사이의 숫자로 10이 가장 높은 우선순위임.
		//  중요! 스레드의 우선순위는 절대적 수치가 아닌 상대적 수치
		//  우선 순위에 따라서 점유시간과 자원이 주어지게 된다. 
		//
		//  우선순위 적용방법 - setProperty(int)   1 ~ 10
		//   
		//  우선순위 적용시 주의 사항
		//   1. 우선순위는 상대적 값이다.
		//   2. 스레드를 실행하기 전에 지정해야 한다.
		//   3. main() 메서드에서 실행하는 스레드의 경우 기본값 5
		//  직접 스레드의 우선 순위값을 설정을 하는 것보다 Thread의 static final 필드 
		//  값을 이용하는 것이 더 좋다.

		// 우선 순위 지정( 1 ~ 10, 상수값 이용)
		t1.setPriority(Thread.NORM_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t3.setPriority(Thread.NORM_PRIORITY);
		t4.setPriority(Thread.MAX_PRIORITY);

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		System.out.println("main thread 종료");

    }
}


//Thread를 상속하는 방식
class ThreadExtends extends Thread{
    @Override
    public void run() {
        System.out.println("스레드 상속 받는 방법으로 실행");
        for(int i=0;i<50;i++){
            System.out.println("Thread Extends : " + i);
        }
        
    }
}

//Runnable 구현체
class RunnableImpl implements Runnable {
    @Override
    public void run() {
        System.out.println("Runnable 구현하는 방법으로 실행");
        for(int i=0;i<50;i++){
            System.out.println("RunnableImpl : "+i);
        }
        
    }

    
}