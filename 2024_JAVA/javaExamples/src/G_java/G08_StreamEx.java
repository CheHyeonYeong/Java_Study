package G_java;
import java.util.stream.Stream;
import java.util.Arrays;
import java.util.List;

public class G08_StreamEx {
    public static void main(String[] args) {
        //배열을 이용한 스트림 생성
        String[] arr = new String[]{
            "a", "b", "c", "d","e","f"
        };

        Stream<String> stream1 = Arrays.stream(arr);
        stream1.forEach(s->System.out.print(s+" "));
        System.out.println();

        Stream<String> stream2 = Arrays.stream(arr, 2, 5); //배열의 일부를 추출해서 객체 생성
        stream2.forEach(s->System.out.print(s+" "));
        System.out.println();

        //문자열 배열을 컬렉션 프레임워크로 만들어서 스트림 만들기
        List<String> list = Arrays.asList(arr);

        //List 객체를 stream()를 이용. Stream 객체 생성
        Stream<String> stream3 = list.stream();
        stream3.forEach(s->System.out.print(s));

        //스트림 객체 생성 : build() 메서드 이용하기
        Stream stream4 = Stream.builder() //집어넣는 개수에 따라서 달라짐!! 따로 limit이 필요치 않다!
            .add("무궁화")
            .add("삼천리")
            .add("화려강산")
            .add("대한사람")
            .add("현영이")
            .build();
        stream4.forEach(s->System.out.println(s+" "));
        System.out.println();


        //스트림 객체 생성 : 2.generate()메서드 이용하기
        //람다에서 Supplier<T> 인터페이스를 이용하여 값을 추가 생성합니다.

        Stream<String> Stream5 = Stream.generate(()->"애국가").limit(10); //limit이 없으면 끝이 안난다.
        Stream5.forEach(s->System.out.println(s+" "));

        //스트림 객체 생성 : 3. iterate() 메서드 이용하기
        Stream<Integer> stream6 = Stream.iterate(1, n->n+1).limit(10);  //시작 값 1->10까지
        stream6.forEach(s-> System.out.println(s+" "));
    }

}
