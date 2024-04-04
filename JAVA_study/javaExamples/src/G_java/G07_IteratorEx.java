package G_java;
import java.util.*;
public class G07_IteratorEx {


    public static void main(String[] args) {
        //list 객체를 만드는 과정 -> 배열을 리스트 컬렉션을 바꾸고 싶어용
        List<String> list = Arrays.asList(new String[]{
            "홍길동","김유신","이순신", "유관순"
        })    ;
        System.out.println("for문을 이용");
        for(int i =0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println("외부 반복자 이용");
        Iterator<String> it = list.iterator();  //컬렉션 프레임워크에서 요소를 읽어오는 표준화 클래스
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("내부 반복자 이용");
        //consumer : 반환타입이 없다!!
        list.forEach(s -> System.out.println(s));


        
    }
}
