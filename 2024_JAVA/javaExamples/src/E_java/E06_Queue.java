package E_java;

import java.util.Queue;
import java.util.LinkedList;

public class E06_Queue {
    public static void main(String[] args) {
        Queue<Integer> qu = new LinkedList<>();

        qu.add(1);
        qu.offer(2);
        qu.add(3);
        System.out.println(qu);

        while (!qu.isEmpty()) {
            System.out.println(qu.poll());
            
        }
    }

}
