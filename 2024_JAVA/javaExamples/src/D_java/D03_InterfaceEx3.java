package D_java;

import D_java.Interface_.ISomething;

public class D03_InterfaceEx3 implements ISomething{
    @Override
    public void run(){
        System.out.println("run() : "+ISomething.A);

    }
    public static void main(String[] args) {
        //상수라면 다 똑같다
        System.out.println(ISomething.MY_INT);
        System.out.println(D03_InterfaceEx3.MY_INT);

        //메서드의 동작이 같다 -> 다형성
        ISomething is = new D03_InterfaceEx3();
        is.run();

        D03_InterfaceEx3 di = new D03_InterfaceEx3();
        di.run();       
    }
}
