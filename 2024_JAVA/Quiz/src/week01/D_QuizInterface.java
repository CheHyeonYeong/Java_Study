package week01;

class Carnivore{//육식

}
class Herbivore { //초식

}
class  Deer extends Herbivore{ //사슴
    
}
class Lion extends Carnivore{ //사자
    
}

class ZooKeaper{ //사육사
    public void feed(Lion lion){
        System.out.println("고기를 줍니다");
    }
    
    public void feed(Deer deer){
        System.out.println("건초를 줍니다");
    }
    
}
public class D_QuizInterface {
    public static void main(String[] args) {
        ZooKeaper zk = new ZooKeaper();
        Lion lion = new Lion();
        Deer deer = new Deer();
        zk.feed(lion);
        zk.feed(deer);
    }
}
