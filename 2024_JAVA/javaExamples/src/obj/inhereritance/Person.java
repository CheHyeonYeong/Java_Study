package obj.inhereritance;

public class Person {
    //이름, 나이, 키, 몸무게, gender...
    public String name;
    public int age;
    protected float height; //default + 상속 관계일 때만 접근 가능
    float weight;

    public Person(){

    }
    public Person(String name, int age, float height, float weight){
        this.name= name;
        this.age= age;
        this.height=height;
        this.weight=weight;

    }
    public Person(String name, int age){
        this.name= name;
        this.age= age;

    }
    //오버로딩 같이름 -> 다기능
    public Person (int age, String name){
        this.name= name;
        this.age=age;
    }
    public String getDetails(){
        return String.format("이름 : %s\t나이 : %d\t height : %f\tweight : %f", name, age, height, weight);
    }
    

}
