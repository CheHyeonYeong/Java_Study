package D_java;

class University{
    int num;
    static String name;
    // static 내부 클래스 : static이 붙은 멤버와 동일하게 사용이 가능하다.
    // 내부 클래스는 static이 붙어 있기 때문에 static이 붙은 멤버에만 접근이 가능하다.
    // 접근 방식에 의해 객체 생성 방법에서 차이가 생기게 된다.
    // static이 없는 멤버 이너 클래스는 외부 객체를 생성한 후에 내부 클래스에 접근이 가능
    // static이 있는 경우 외부 클래스 객체 생성 없이 바로 호출이 가능하다.
     static class Sudent {
        
    }
}
class HighSchool {
    class Sudent{

    }
}
public class D04_staticInner {
    public static void main(String[] args) {
        //static true
        University.Sudent us = new University.Sudent();
        //static flase
        // HighSchool.Sudent high = new HighSchool.Sudent();

        HighSchool high = new HighSchool();     //외부 객체
        HighSchool.Sudent hs = high.new Sudent();//내부 객체


    }
}
