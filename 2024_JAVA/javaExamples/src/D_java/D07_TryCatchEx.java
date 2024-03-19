package D_java;

public class D07_TryCatchEx {
    public static void main(String[] args) {
        int i = 0;
        String[] greetings = {
            "안녕", "방가방가", "또 와"
        };
        while (i<4) {
            try{
                System.out.println(greetings[i]);
            }catch(Exception e){
                System.out.println("예외 발생했습니다. 예외가 발생한 이유는 "+e.getMessage()+"예외처리 작업 끝입니다.");
            }finally{
                System.out.println("finally는 항상 실행됩니다.");
            }
            i++;
        }
        System.out.println("final MAIN");
    }
}
