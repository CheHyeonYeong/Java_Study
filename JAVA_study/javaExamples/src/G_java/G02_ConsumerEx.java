package G_java;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class G02_ConsumerEx {

    //Consumer<T> = 추상 메서드 void accept(T t)
    //BiCunsumer<T,U> = 추상 메서드 : void accept(T t, U u)
    //xxxConsumer - 각 데이터 타입에 따른 Consumer(IntConsumer, longConsumer, doubleConsumer)
    //ObjxxxConsumer - T객체와 기본데이터 타입의 매개변수를 받는 Consumer...
    public static void main(String[] args) {
        //Consumer 인터페이스
        Consumer<String> c1 = name -> System.out.println("제이름은 "+name+"입니다.");
        c1.accept("null");

        BiConsumer<String,Integer> c2 = (name, age) -> {
            System.out.printf("제이름은 %s입니다. 나이는 %d입니다", name, age);
        };
        c2.accept("홍길동", 20);
        DoubleConsumer c3= (score) ->{
            System.out.printf("제 점수는요 %d 입니다.",score);
        };
        c3.accept(98.6);
        ObjIntConsumer<String> c4 = (lecture, i) ->{
            System.out.printf("제 %s의 점수는  %d 점 입니다.",lecture,i);
        };
        c4.accept("자바프로그래밍", 90);
    }
}
