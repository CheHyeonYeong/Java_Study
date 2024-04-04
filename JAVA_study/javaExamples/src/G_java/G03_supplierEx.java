package G_java;

import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class G03_supplierEx {
    public static void main(String[] args) {
        Supplier<String> s1 = ()->{
            return "홍길동";
        };
        System.out.println(s1.get());
        s1 = ()-> "이순신";
        System.out.println(s1.get());
        IntSupplier s2 = ()->{
            int num = (int)(Math.random()*6)+1;
            return num;
        };
        System.out.println(s2.getAsInt());

        DoubleSupplier s3 = () -> Math.PI;

        System.out.println("원주율 값 : "+s3.getAsDouble());
        Supplier<Integer> s5 = ()->{
            return 1;
        };
        System.out.println(s5.get());
    }
}
