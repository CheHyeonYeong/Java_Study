package quiz.D_quiz;

interface Animal{
    void sleep();
    void eat();
}
// 추가
interface Pet {
    void play();
    
}

class LandAnimal{
    String name;
    String food;
    public LandAnimal(String name , String food){
        this.name = name;
        this.food = food;
    }
}

class SeeAnimal {
    String name;
    String food;
    public SeeAnimal(String name , String food){
        this.name = name;
        this.food = food;
    }
}
class Dog extends LandAnimal implements Animal, Pet {
    
    public Dog(String name, String food){
        super(name,food);
    }
    @Override
    public void sleep() {
        System.out.println(name +"는 잠을 잔다");
    }
    @Override
    public void eat() {
        System.out.println(name +"는 "+food+"을 먹는다");
    }    
    @Override
    public void play() {
        System.out.println("이 동물은 애완동물이 될 수 있다.");
    }
}

class PrintStatus{
    public void show(Animal a){
        a.eat();
        a.sleep();
    }

}

public class D_QuizInterface2 {

    public static void main(String[] args) {
        PrintStatus p = new PrintStatus();
        Dog dog = new Dog("개", "사료");
        p.show(dog);
        dog.play();
        System.out.println(7-1*20/5);
    }
}
