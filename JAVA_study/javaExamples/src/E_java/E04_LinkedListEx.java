package E_java;
import java.util.LinkedList;;
public class E04_LinkedListEx {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("hello");
        list.add("java");
        list.add("banana");
        list.addFirst("apple");
        list.addLast("zoo");
        
        System.out.println(list);

        list.remove(); //head 엘리먼트 삭제
        System.err.println("list data after remove() : "+list);
        
        list.remove(2); //head 엘리먼트 삭제
        System.err.println("list data after remove(2) : "+list);

        list.set(1,"new element");
        System.out.println("list data after set() : "+list);

        String str1 = list.peek(); //처음 엘리먼트 조회
        String str2 = list.poll(); //처음 엘리먼트 조회 후 삭제
        System.out.println(str1); 
        System.out.println(str2); 
        System.out.println(list);

        

    }
}
