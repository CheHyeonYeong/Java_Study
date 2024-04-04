package G_java;
import java.util.function.IntBinaryOperator;
import java.util.function.DoubleBinaryOperator;

public class G05_OperatorEx {
    static Student[] list = {
        new Student("홍길동", 20, 80, "컴공"),
        new Student("이순신", 32, 70, "통계"),
        new Student("김유신",100, 60, "빅데이터")
    }; //클래스 멤버 변수이기 때문에 불러올 수 있다!!
    public static void main(String[] args) {
        System.out.print("최대 수학 점수 : ");
        int max = maxOrMinMath((a,b)->{
            if(a>b) return a;
            else return b;
        }); //정의만 함 
        System.out.println(max);


        System.out.print("최대 수학 점수 : ");
        max = maxOrMinMath((a,b)->(a<=b?a:b)); //정의만 함 
        System.out.println(max);
        System.out.print("최대 평균 점수 : ");
        System.err.println(maxOrMinAvg((a,b)-> (a>=b ? a:b)));
        
        System.out.print("최소 평균 점수 : ");
        System.err.println(maxOrMinAvg((a,b)-> (a<=b ? a:b)));
    }



    private static int maxOrMinMath(IntBinaryOperator op){
        int result = list[0].getMath();
        for(Student s : list){
            result = op.applyAsInt(result, s.getMath());
        }
        return result;
    }
    private static double maxOrMinAvg(DoubleBinaryOperator p){
        double result = (list[0].getMath() + list[0].getEng() )/2.0;
        for(Student s : list){
            result = p.applyAsDouble(result, (s.getMath()+s.getEng())/2.0);
        }
        return result;
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