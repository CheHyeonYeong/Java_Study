package G_java;

import java.util.Arrays;
import java.util.List;

public class G11_FilteringEx {
    public static void main(String[] args) {
        //list 객체 생성하기
        List<String> list = Arrays.asList("홍길동", "김유신","홍길동", "이순신 ","홍길동", "유관순","홍길동", "김유신" );

        //distinct() 메소드로 중복 제거 후 내부 반복자로 출력

        System.out.println("distinct()");
        list.stream().distinct().forEach(s->System.out.println(s+" "));
        System.out.println();

        //"홍으로 시작하는 문자열로 필터링 후 내부 반복자로 출력
        
        System.out.println("filter()");
        list.stream().filter(n->n.startsWith("홍"))
            .forEach(e->System.out.println(e+" "));

        //distinct()와 filter()를 동시에 사용
        System.out.println("distinct()+filter()");
        
        list.stream().distinct().filter(n->n.startsWith("홍")).forEach(e->System.out.println(e+" "));

    }
}
