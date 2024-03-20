package D_java;

public class D17_String_StringBuilder {
    public static void main(String[] args) {
        //성능 비교!
        //String
        long start, end;
        start = System.currentTimeMillis();
        String str = "A"; //String 값이 변경될 때마다 새로운 객체를 생성
        for(int i =0; i<300000;i++){
            str = str+"A";
        }
        end = System.currentTimeMillis();
        System.out.println("Stirng : " +(end-start)*0.001+"초");

        //StirngBuilder
        start = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder("A");
        for(int i =0; i<300000;i++){
            sb.append("A");
        }
        end = System.currentTimeMillis();
        System.out.println("StirngBuilder : " +(end-start)*0.001+"초");
    }
}