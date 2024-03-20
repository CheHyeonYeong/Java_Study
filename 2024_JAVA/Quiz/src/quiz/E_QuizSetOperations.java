package quiz;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class E_QuizSetOperations {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));
        List<Integer> list2 = new ArrayList<>(List.of(4, 5, 6, 7, 8, 9));

        Set<Integer> set1 = new HashSet<>(list1);
        Set<Integer> set2 = new HashSet<>(list2);

        // 합집합
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("합집합: " + union);

        // 교집합
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("교집합: " + intersection);

        // 차집합
        Set<Integer> difference1 = new HashSet<>(set1);
        difference1.removeAll(set2);
        Set<Integer> difference2 = new HashSet<>(set2);
        difference2.removeAll(set1);
        System.out.println("차집합: " + difference1 + ", " + difference2);
    }
}