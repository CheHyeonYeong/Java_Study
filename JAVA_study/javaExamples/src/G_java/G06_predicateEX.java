package G_java;

import java.util.function.Predicate;
public class G06_predicateEX {
    static Student[] list = {
        new Student("홍길동", 20, 80, "컴공"),
        new Student("이순신", 32, 70, "통계"),
        new Student("김유신",100, 60, "컴공")
    }; //클래스 멤버 변수이기 때문에 불러올 수 있다!!
    public static void main(String[] args) {
        //과가 컴공인 학생의 영어 점수 평균
        double avg = avgEng(t->t.getMajor().equals("컴공"));
        System.out.println("컴공과 평균 영어 점수");
        System.out.println(avg);        
    }
    private static double avgEng(Predicate<Student> pr){
        int count = 0;
        int sum = 0;
        for(Student s : list){
            if(pr.test(s)){
                count ++;
                sum += s.getEng();
            }
        }
        return (double)sum/count;
    }
}
class Student {
    private String name;
    private int eng ;
    private int math;
    private String major;

    public int getEng() {
        return eng;
    }
    public String getMajor() {
        return major;
    }
    public int getMath() {
        return math;
    }
    public String getName() {
        return name;
    }
    public Student(String name, int eng, int math, String major){
        this.name = name;
        this.eng = eng;
        this.math = math;
        this.major = major;
    }
    
}