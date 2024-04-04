package H_java;

public class H03_ThreadEx {
    public static void main(String[] args) {
		//sleep()
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				int i = 1;
				while(true) {
					//interrupt 확인
					System.out.println("t1 : "+i);
					i++;
					if (Thread.interrupted()) {   //interrupt 발생 여부 확인
						System.out.println("인터럽트가 발생했었네요. 반복문 종료합니다.");
						break;
					}

					// sleep 확인
//					try {
//						Thread.sleep(1000);  //1초
//					} catch (InterruptedException e) {
//						System.out.println(e.getMessage());
////						System.exit(0);
//					}
				}
				System.out.println("스레드 실행 종료");

			}
		});

		t1.start();


        //------------------------------------
		// interrupt() 메서드
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		t1.interrupt();  // 스레드가 일시 정지 상태이면 예외 발생. sleep interrupted

		// join() 메서드
		Sum t2 = new Sum();
		Sum t3 = new Sum();

		t2.start();
		t3.start();
		try {
			t2.join();   // t2 스레드가 종료될때까지 대기
			t3.join();   // t3 스레드가 종료될때까지 대기
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("두 스레드의 Sum의 합계 : "+(t2.sum + t3.sum));

		//yeild() 일드
        YeildThread t4 = new YeildThread();
        YeildThread t5 = new YeildThread();
        t4.start();
        t5.start();

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
        }
        
        t4.iscontinue = false; //t4 스레드 yeild() 즉, 양보

        try {
            Thread.sleep(100);
        } catch (Exception e) {        }

        t4.iscontinue = true;
        try {
            Thread.sleep(20);
        } catch (Exception e) {}

        t4.isbreak = true;
        t5.isbreak = true;

	}
}

class Sum extends Thread {
	int sum = 0;
	@Override
	public void run() {
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
	}
}

class YeildThread extends Thread{
    boolean isbreak = false;
    boolean iscontinue = true;

    @Override
    public void run() {
        while(!isbreak){
            if(iscontinue){
                System.out.println(getName()+" 실행중 >.<");
            }
            else{
                System.out.println("양보합니다.");
                Thread.yield(); //실행중이 아니라면 양보해라
            }
        }
        System.out.println(getName()+" 종료");
    }
}