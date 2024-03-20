package E_java;

import java.util.Set;
import java.util.HashSet;
public class E01_SetEx {
    public static void main(String[] args) {
        //해싱 : 하나의 문자열을 보다 빨리 찾을 수 있도록 주소에 직접 접근할 수 있는 짧은 길이의 값이나 키로 변환하는 것을 말함


        // 인터페이스로 다른걸 부를 수 있다 (다형성!!)
        Set set = new HashSet(); 
        set.add("Three"); //제너릭을 쓰지 않아서 뭐든지 쓸 수 있다
        set.add("one"); 
        set.add("two"); 
        set.add("Four"); 
        set.add("five"); 

        set.add(new Integer(4));
        boolean isAdded = set.add("five");
        System.out.println(set);
        System.out.println(isAdded);

        //size
        System.out.println(set.size());

        //remove : 제거
        set.remove("two");
        System.out.println(set);
        
        //clear : 모두 제거

        set.clear();
        System.out.println(set);

        //isEmpty() : 비었는지 확인
        if(set.isEmpty()){
            System.out.println("Set if Empty");
        }
    }
}
