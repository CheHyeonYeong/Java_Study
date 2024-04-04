package D_java;

public class D07_ThrowsEx {
    private static String[] greetings = {
        "안녕", "방가방가", "또 와"
    };
    public static void doIt(int index) throws ArrayIndexOutOfBoundsException{
        System.out.println(greetings[index]);
    }
    public static void doIt2(int index){
        try{
            System.out.println(greetings[index]);
        }        catch(ArrayIndexOutOfBoundsException e){
            System.err.println("잘못된 인덱스 입니다.");
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        int i  = (int)(Math.random()*4);
        try{
            doIt(i);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.err.println("main에서 i가 잘못 선택되었습니다. 다음 명령문으로 넘어갑니다");
        }
        doIt2(i);
        System.out.println("next line is start");
    }
}
