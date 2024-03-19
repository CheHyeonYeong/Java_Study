package D_java;

//259 page
interface MyInterface1 {
    default void defaultMethod(){
        System.out.println("MyInterface1의 default 메서드");
    }
    static void staticMethod(){
        System.err.println("MyInterface1의 static 메서드");
    }
}
interface MyInterface2 {
    default void defaultMethod(){
        System.out.println("MyInterface2의 default 메서드");
    }
    static void staticMethod(){
        System.err.println("MyInterface2의 static 메서드");
    }
}

class Parent{
    public void method2(){
        System.out.println("Parent class's method2");
    }
}

class Child extends Parent implements MyInterface1, MyInterface2{
    @Override
    public void method2() {
        super.method2();
    }

    @Override
    public void defaultMethod() {
        System.out.println("Child class's default method");
        MyInterface1.super.defaultMethod();
        MyInterface2.super.defaultMethod();
    }
}

public class D05_defaultInterface {
    public static void main(String[] args) {
        Child c = new Child();
        c.defaultMethod();
        c.method2();   
        
        MyInterface1.staticMethod();
        MyInterface2.staticMethod();
    }

}
