package G_java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class G12_mappingEx {

    public static void main(String[] args) {
        //flatMapXXX() 메서드

        //문자열을 공백으로 분리해서 매핑
        List<String> list1 = Arrays.asList("동백물과", "백두산이", "마르고 닳도록");
        list1.stream().flatMap(data -> Arrays.stream(data.split(" "))).forEach(word->System.out.println(word));

        //문자열을 , 로 분리해서 double 자료형으로 반환하여 맵핑
        List<String> list2 = Arrays.asList("1.1,2.2,3.3","4.4,5.5,6.6"); //이걸 더블 스트링으로 바꿀거에용
        DoubleStream dsr = list2.stream().flatMapToDouble(data->{
            String[] strArr = data.split(",");
            double[] dArr = new double[strArr.length];
            for (int i = 0;i<dArr.length;i++){
                dArr[i] = Double.parseDouble(strArr[i].trim());
            }
            return Arrays.stream(dArr);
        });
        dsr.forEach(n-> System.out.println(n));
        System.out.println();




        //---------------------여기부터 공부 다시 하기------------------

        //문자열을 , 로 분리해서 int 자료형으로 변화해서 매핑
        List<String> list3 = Arrays.asList("1, 2, 3","4, 5, 6");
		IntStream isr = list3.stream().flatMapToInt(data -> {
			String[] strArr = data.split(",");
			int[] intArr = new int[strArr.length];
			for(int i = 0; i< strArr.length; i++) {
				intArr[i] = Integer.parseInt(strArr[i].trim());
			}
			return Arrays.stream(intArr);
		});
		isr.forEach(s -> System.out.println(s));

        //mapXXX() 메서드 : 요소를 새로 구성해서 새로운 스트림을 리턴
		List<String> list4 = Arrays.asList("동해물과", "백두산이","마르고 닳도록");

        System.out.println("함수적 인터페이스 방식");
        list4.stream().mapToInt(String::length)
            .forEach(len -> System.out.println(len));
        // - asDoubleStream, asLongStream, boxed
		// asDoubleStream : IntStream, LongStream을 DoubleStream으로 형변환
		// asLongStream : IntStream을 LongStream으로 형변환
		// boxed : IntStream, LongStream, DoubleStream을 각가 Stream<Integer>
		//     , Stream<Long>, Stream<Double>로 형변환
        int intArr[] = {10, 20, 30, 40, 50, 60};

		// double타입의 요소를 갖는 DoubleStream으로 형변환
		Arrays.stream(intArr).asDoubleStream()
						.forEach(d -> System.out.println(d));
		System.out.println();

		//int타입의 요소를 갖는  Stream<Integer>으로 형변환
		Arrays.stream(intArr).boxed()
						.forEach(i -> System.out.println(i.getClass()));

    }
}
