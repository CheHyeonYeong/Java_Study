package G_java;

public class g01_lambdaFunctionEx {

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
    }

}
interface InterfaceEX{
    public int sum(int x, int y);

}
interface LambdaInterface{
    void print();
    void print2();//오류 발생

}