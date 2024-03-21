package quiz.E_quiz;

import java.util.HashMap;
import java.util.PriorityQueue;

public class E03_Hash {
    public static String solution(String[] participant, String[] completion){
        HashMap<String,Integer> map = new HashMap<>();
       // 참가자 이름을 HashMap에 추가하고 개수를 기록
       for (String p : participant) {
        map.put(p, map.getOrDefault(p, 0) + 1);
        }

        System.out.println("참자가 결과 : map");
        for (String c : completion) {
            map.put(c, map.get(c) - 1);
        }
        for (String key : map.keySet()) {
            if (map.get(key) == 1) {
                return key;
            }
        }
        
        // 예외 처리
        throw new RuntimeException("참가자와 완주자 명단이 잘못되었습니다.");
    }
    public static int solution2(int[] scoville, int k){
        int count = 0;
        PriorityQueue<Integer> st = new PriorityQueue<>();
        for (int s : scoville) {
            st.offer(s);
        }

        while (st.size() > 1 && st.peek() < k) {
            int first = st.poll();
            int second = st.poll();
            int new_value = first + (second * 2);
            st.offer(new_value);
            count++;
        }
        
        if (st.size() == 1 && st.peek() < k) {
            return -1;
        }

        return count;
    }

}

