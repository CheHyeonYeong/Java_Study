package D_java;

public class D07_CheckedException {
    //checkedException은 예외처리 해야한다
    //잘못된 값이 들어와서 예외발생 가능
    public static void main(String[] args) {
        System.out.println("값을 입력받는 프로그램입니다");
        byte[] data = new byte[100]; //한번에 100byte 처리할 공간

        try{
            System.in.read(data); //제어가 되어야 하나, 제어되지 않았기 때문에 문제가 된다.

        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("입력할 문자열은 : ");
        System.out.println(new String(data).trim()); //trim은 공백을 날아감ㅋ
        
        //scanner가 알아서 해줬기 때문에 scanner시 문제는 안됐다


    }
}
