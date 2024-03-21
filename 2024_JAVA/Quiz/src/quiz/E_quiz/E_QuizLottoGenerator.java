package quiz.E_quiz;
import java.util.Random;
import java.util.TreeSet;

public class E_QuizLottoGenerator {
    public static void main(String[] args) {
        TreeSet<Integer> lotto = new TreeSet<>();
        Random random = new Random();

        while (lotto.size() < 6) {
            int number = random.nextInt(45) + 1;
            lotto.add(number);
        }

        System.out.println("로또 번호: " + lotto);
    }
}