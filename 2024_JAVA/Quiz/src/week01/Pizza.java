package week01;


class Circle {
    private int radius;
    public Circle(int r){radius =r;}
    int getRadius(){
        return radius;
    }
}
public class Pizza extends Circle{
    String name;
    int r;
    Circle c = new Circle(r);

    private Pizza(String name, int radius){
        super(radius);
        this.name = name;
    }
    Pizza(int radius, String name){
        super(radius);
        this.name = name;
    }

    Pizza(int radius){
        super(radius);
        this.name = "name";
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getRadius(int radius) {
        return c.getRadius();
    }

    public void setRadius(int radius) {
        this.r=radius;
    }
    public String print(){
        return String.format("%s 피자는 반지름 %dcm",name,c.getRadius());
    }
}

class Menu extends Pizza{

    Menu(String name ,int radius) {
        super(radius,name);
        
    }


}