package G_java;

public class G01_lambdaFunctionEx {

    public static void main(String[] args) {
        //1
        InterfaceEX ie =(int x, int y) -> x+y;  
        System.out.println(ie.sum(4, 5));
        
        //2 함수적 인터페이스
        LambdaInterface li = () -> { 
            String str = "메서드 출력";
            System.out.println(str);
        };
        li.print();
        LambdaInterface3 li3= (name) -> {
          System.out.println("제이름은 "+name+"입니다.");
        };
        li3.print("홍길동");
        LambdaInterface4 li4= (x,y) -> {
            return x*y;
          };
        li4.cal(3,2);
        Outer o = new Outer();
        o.method();
        
    }
}

class Outer{
    public int iv = 10;
    void method(){
        final int iv = 40; //내부 클래스일 경우에는 final로 상수화 해달라고 한다.
        LambdaInterface5 li5 = ()->{
            System.out.println("Outer.this.iv"+Outer.this.iv); //this : 객체의 정보
            System.out.println("this.iv : "+this.iv); //outer로 부터 iv 값을 받았기 때문에 10이 나온다.
            System.out.println("iv : " +iv); 
        };
        li5.method();
    }
}

@FunctionalInterface
interface LambdaInterface5 {
    void method();    
}

interface InterfaceEX{
   public int sum(int x, int y);
}

@FunctionalInterface //해당 인터페이스가 함수적 인터페이스임을 알려줌
interface LambdaInterface{
    void print();
    // void print2();//오류 발생 => 함수형 인터페이스는 추상 메소드가 하나여야 한다
}
@FunctionalInterface 
interface LambdaInterface3{
    void print(String name);
}
@FunctionalInterface 
interface LambdaInterface4{
    int cal(int x, int y);
}
