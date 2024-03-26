package E_java;

import java.util.Comparator;
import java.util.TreeSet;

public class E10_compareEx2 {
    public static void main(String[] args) {
        //TreeSet, TreeMap
        //이진 검색 트리를 구현

        TreeSet<GymMember> gym = new TreeSet<>();
        gym.add(new GymMember("채현영", 0));
        gym.add(new GymMember("채원기", 1));
        gym.add(new GymMember("채운이", 2));
        gym.add(new GymMember("채수연", 3));
        gym.add(new GymMember("윤나영", 4));
        gym.add(new GymMember("조현우", 5));
        gym.add(new GymMember("김지훈", 6));
        System.out.println(gym);

        //2. Comparator 이용
        TreeSet<GymMember> gym2 = new TreeSet<>(new Comparator<GymMember>() {
            public int compare(GymMember o1, GymMember o2) {

                //compare 메서드 사용법
                // o1과 o2의 자리를 바꾸고 싶다면 1을 리턴
                // o1과 o2의 자리를 바꾸고 싶지 않다면 -1을 리턴
                // o1과 o2의 같은 값임을 나타내고 싶다면 0을 리턴
                if(o1.name.charAt(0) < o2.name.charAt(0)){
                    return -1;
                }
                else if (o1.name.charAt(0) > o2.name.charAt(0)){
                    return 1;
                }
                else{
                    return 0; //set인 경우 0이 리턴되면 중복으로 간주 -> 들어가지 않는다.
                }

            };
        });

        //에러가 떠요ㅠㅠ
        gym2.add(new GymMember("채현영", 0));
        gym2.add(new GymMember("채원기", 1));
        gym2.add(new GymMember("채운이", 2));
        gym2.add(new GymMember("채수연", 3));
        gym2.add(new GymMember("윤나영", 4));
        gym2.add(new GymMember("조현우", 5));
        gym2.add(new GymMember("김지훈", 6));
        System.out.println(gym2);
    }
}

class  GymMember implements Comparable<GymMember>{
    
    double height;
    double weight;
    int age;
    String name;
    int memNum;

    public GymMember(String name, int memNum) {
        this.name = name;
        this.memNum = memNum;
    }

    @Override
    public String toString() {
        return String.format("%s [%d] \n", name, memNum);
    }

    @Override
    public int compareTo(GymMember o) {
        return Integer.compare(this.memNum, o.memNum);
    }

    // @Override
    // // public int compareTo(GymMember o) {
    //     CompateTo 메서드는 매개변수 o를 통해 비교대상을 전달 받고, 
    //     비교 대상이 해시값 혹은 int 형 => 계산하게 된다. 양수가 나오면 자리를 교체한다. 
    //     현재 인스턴스와 o의 자리를 바꾸고 싶은 경우에 1을 리턴한다. 
    //     현재 인스턴스와 o의 자리를 유지하고 싶으면 -1을 리턴한다.
    //     현재 인스턴스와 o가 같은 값임을 나타내고 싶다면 0을 리턴 

    //     int next = o.memNum ;
    //     System.out.println(memNum + " vs "+next);

    //     if(memNum < next){ 
    //         return -1;
    //     }
    //     else if(memNum == next){
    //         return 0;
    //     }
    //     else{
    //         return 1;
    //     }
    // }
}