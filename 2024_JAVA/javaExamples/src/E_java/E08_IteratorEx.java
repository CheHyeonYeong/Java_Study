package E_java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
import java.util.List;
public class E08_IteratorEx {
    public static void main(String[] args) {
        Set set = new HashSet<>();

        set.add("Three");
        set.add("one"); 
        set.add("two"); 
        set.add("Four"); 
        set.add("five"); 

        set.add(new Integer(4));
        Iterator it = set.iterator();  //set에서 Iterator 객체 생성 메서드
        while (it.hasNext()) {
            System.out.println(it.next());
            
        }

        List list = new ArrayList<>();

        list.add(10);
        list.add(50);
        list.add(20);
        list.add(40);
        list.add(30);
        
        Iterator it2= list.listIterator();
        while (it2.hasNext()) {
            System.out.println(it2.next()+"\t");   
        }

    }
}
