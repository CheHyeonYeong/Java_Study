package obj;

public class Pen {
    //클래스 안에 코드
    //attribute (속성, 멤버변수), constructors (생성자), method
    
    //attribute (속성, 멤버변수)
    public String color;//패키지 관계 없이 불러 올 수 있음
    int price; //default 같은 패키지 내에서 불러올 수 있음
    
    //메서드    
    public void write(){
        System.out.println("hello world");
    }

    public Pen(){ //기본 생성자 매개변수
        color= "black";
    }
    
    public Pen(String str){ //기본 생성자 매개변수
        color= str;
    }
}

