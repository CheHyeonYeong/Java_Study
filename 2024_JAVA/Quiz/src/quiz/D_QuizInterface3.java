package quiz;

abstract class Shape {
    protected int x;
    protected int y;

    public void showPosition(){
        System.out.printf("x 좌표 : %d, y 좌표 : %d\n",x,y);
    }
    public abstract double getArea();
    
}

class Rectange extends Shape{
    private int w;
    private int h;

    public int getW() {
        return w;
    }
    public void setW(int w) {
        this.w = w;
    }
    public int getH() {
        return h;
    }
    public void setH(int h) {
        this.h = h;
    }

    public Rectange(int x, int y){
        this.x=x;
        this.y= y;
        w=0;
        h=0;
    }

    @Override
    public double getArea() {
        double result = (x-w) +(y-h);
        return result;
    }
}

class Triangle extends Shape{
    private int z;
    public Triangle(int x, int y ){
        this.x = x;
        this.y = y;
        z = 0;
    }
    public int getZ() {
        return z;
    }
    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public double getArea() {
        double result = (x-z)*(y-z)/2;
        return result;
    }
}

public class D_QuizInterface3 {

    public static void main(String[] args) {
        //도형은 좌표를 이용해 각 도형의 요소들을 나타낼 수 있는 넓이를 구하는 방식은 도형별로 다르다.

        Triangle t = new Triangle(10, 5);
        Rectange r = new Rectange(10, 10);
        System.out.println(t.getArea());
        System.out.println(r.getArea());
        t.showPosition();
        r.showPosition();
    }
}
