package C_java;

//도형!
abstract class Shape {
    //추상클래스

    private int x;
    private int y;
    public Shape(){

    }
    public Shape(int x, int y){
        this.x=x;
        this.y= y;
    }
    public abstract double getArea();
    
    public String position(){
        return String.format("x=%d, y=%d",x,y);
    }
}

class Circle extends Shape{

    private int r;
    public Circle(int r){
        this(r,r,r);
    }
    public Circle(int x, int y, int r){
        super(x,y);
        this.r = r;
    }

    @Override
    public double getArea() {
        return (Math.PI * r * r);
    }
}

//shape를 부모로 하는 사각형 삼각형 클래스를 만들어 보세요

class Triangle extends Shape{
    private double x;
    private double y;
    public Triangle(double x){
        this(x,x);
    }
    public Triangle(double x, double y){
        this.x = x;
        this.y = y;
    }

    @Override
    public double getArea() {

        return x*y*0.5;
    }
}

class Rectange extends Shape{
    int width;
    int height;
    public Rectange(int x){
        this(x,x);
    }
    public Rectange(int x, int y){ 
        this.width = x;
        this.height = y;
    }

    @Override
    public double getArea() {
        return (double)(width*height);
    }
}

public class C10_Abstract {
    public static void main(String[] args) {
        Shape circle = new Circle(10);

        System.out.println("원의 넓이"+circle.getArea());
        System.out.println("원의 넓이"+circle.position());


    
    }
}
