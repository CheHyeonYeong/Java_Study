package D_java;

import D_java.Interface_.ToDo;
import D_java.Interface_.ToDo3;
import D_java.Interface_.ToDo4;

public class D01_InterfaceEx {
    public static void main(String[] args) {
        RactangleI rI = new RactangleI(20, 34)   ;
        Triangle tI = new Triangle(20,34);
        Shape s = new RactangleI(30 , 48); //다형성

        System.err.println("rect's Area : "+rI.getArea());
        System.out.println("Tri's Arat = "+tI.getArea());
        System.out.println("S1's Area = "+s.getArea());


// ---------------------------------------------------
        ToDo todo = new ToDo(); //인터페이스 구현체 ToDo 클래스
        ToDo3 itodo3 = todo; //다형성 때문에 에러가 뜨지 않는다.
        itodo3.m1();
        itodo3.m2();
        itodo3.m3();
        
        ToDo4 itodo4 = todo;  //if 클래스의 경우 상속이 하나만 가능하기 때문에, 해당 경우는 인터페이스만 가능하다.
        itodo4.m4();
        
    }
}

interface Shape { 
    public abstract double getArea(); //==double getArea()
}

class RactangleI implements Shape{

    int width;
    int height;
    public RactangleI(int width, int height){
        this.width = width;
        this.height = height;
    }
    @Override
    public double getArea(){
        return width*height ;
    }
}

class Triangle implements Shape {
    int width;
    int height;
    public Triangle(int width, int height){
        this.width=width;
        this.height=height;
    }
    public double getArea(){
        return width*height/2;
    }

    
}