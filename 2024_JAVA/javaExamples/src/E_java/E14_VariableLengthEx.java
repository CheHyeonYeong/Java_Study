package E_java;

public class E14_VariableLengthEx {
    public static void main(String[] args) {
        log("hello");
        log("VariableLengthExample");
    }

    public static void log(String ... msg){
        System.out.print("로그 : ");
        for(String message: msg){
            System.out.print(message+" , ");
        }

    }
}
