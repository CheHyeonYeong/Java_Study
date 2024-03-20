package D_java;
import java.util.Arrays;
public class D15_stringEx {

    public static void main(String[] args) {
        // String 메소드 사용 예시
        String str = "Hello, world!! 1234567890";
        System.out.println(str);
        
        // 1. substring - 문자열을 원하는 인덱스 이후로 출력하는 메소드
        System.out.println(str.substring(0));
        System.out.println(str.substring(1));
        System.out.println(str.substring(2));
        System.out.println(str.substring(3));
        System.out.println(str.substring(4));
        System.out.println(str.substring(5));
        System.out.println(str);
        // x번인덱스부터 y번 인덱스 이전까지만 출력
        System.out.println(str.substring(0,5));  
        System.out.println(str.substring(7,12)); 
        System.out.println("======================================================");
        // 2. split - 문자열을 원하는 기준으로 자른다 -> 배열로 변환됨
        str = "apple/banana/kiwi/lemon/orange";
        String[] fruit = str.split("/");
        for (int i=0; i<fruit.length; i++) {
           System.out.println(fruit[i]);
        }
        System.out.println(Arrays.toString(fruit));
        System.out.println("======================================================");
        // 3. indexOf - 원하는 문자의 인덱스 위치값을 반환 (못찾을 경우 -1)
        int orangeIndex = str.indexOf("orange");
        System.out.println("오렌지 위치 : " + orangeIndex);
        System.out.println("첫번째 o의 위치 :" + str.indexOf('o'));
        System.out.println("두번째 o의 위치 :" + str.indexOf('o', str.indexOf('o')+1));
        // 못찾을 경우 -1
        System.out.println("첫번째 x의 위치 :" + str.indexOf('x'));
        System.out.println("======================================================");
        // 4. charAt - 원하는 위치의 문자를 가져옴
        char ch = str.charAt(str.indexOf("orange"));
        String orange = str.substring(
                    str.indexOf("orange"), 
                    str.indexOf("orange") + "orange".length());
        
        System.out.println(ch);
        System.out.println(orange);
        System.out.println("======================================================");
        // 5. contains - 해당 문자가 문자열에 포함되어 있는 경우
        if(str.contains("apple")) {
           System.out.println("사과도 과일이군요.");
        } else {
           System.out.println("사과는 과일이 아니군요");
        }
        //6. length() - 문자열의 길이, equals - 문자열 비교

        //7. replace : 원하는 문자를 치환


        str = "abc@naver.com";
        str = str.replace("naver", "gamil");
        System.out.println(str);
        str = "abc@naver.com";
        
        //딱 맞는 친구만 찾아서 바꿔준다!
        str = str.replaceFirst("naver", "korea");
        System.out.println(str);

    }
        
  
}
