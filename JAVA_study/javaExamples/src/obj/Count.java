package obj;

//static study
public class Count {
    public int a = 0;
    public static int b = 0;
    
    public static int doIt(){
        //return ++a; //non-static은 참조할 수 없다
        //static 메소드는 인스턴스 변수 A를 객체 생성 없이 참조 불가능 한다

        //if 참조 해야하는 상황
        ++new Count().a; //++((new Count()).a)
        return ++b; 
    }
}
