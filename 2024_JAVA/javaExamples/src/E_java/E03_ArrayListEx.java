package E_java;

import java.util.ArrayList;
import java.util.List;

public class E03_ArrayListEx {
    public static void main(String[] args) {
        //크기가 자동으로 조정된다.
        //배열과 유사한 형태
        //순차적으로 데이터에 접근할 때 유리

        List list = new ArrayList();  //object type이기 때문에 아무거나 받을 수 있음

        list.add("홍길동");
        list.add("010-1234-5678");
        list.add('O');
        
        for (int i = 0 ;i<list.size();i++){
            System.out.print( list.get(i)+"\t" );
        }
        System.out.println();
        //add(idx, value) : 리스트에 특정 위치에 추가

        list.add(2,"hong@namer.com");
        System.out.println("변경이후 : ");
        for (int i = 0 ;i<list.size();i++){
            System.out.print( list.get(i)+"\t" );
        }

        //set(idx, value) : 원하는 위치에 요소를 추가 (덮어쓰기)

        list.set(2, "def123@naver.com");

        System.out.println("변경이후 : ");
        for (int i = 0 ;i<list.size();i++){
            System.out.print( list.get(i)+"\t" );
        }
        System.err.println();

        //get(index) : 원하는 인덱스 데이터를 가져올 때 사용
        System.out.println(list.get(0));


        System.out.println(list.indexOf('O'));

        //remove(index) : 그 위치에 데이터를 삭제하면서 값을 반환하는 것
        //remove(Object) : 해당 데이터를 삭제하고 그 결과를 반환한다

        System.out.println(list.indexOf("홍길동"));
        System.out.println(list.remove(0));
        System.out.println(list.remove("홍길동"));

        //contains : 값을 포함하고 있다
        System.out.println(list.contains("홍길동"));

        //toString :
        System.out.println(list.toString()); 
        //toArray : 
        list.toArray();


        //clear : 
        list.clear();
        System.out.println(list);
        
    }
}
