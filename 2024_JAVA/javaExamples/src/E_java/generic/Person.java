package E_java.generic;

public class Person<E> {
    private E name;
    private int age;


    public Person(E name, int age){
        this.age = age;
        this.name = name;
    }

	public Object getName() {
		return this.name;
	}

	public void setName(E name) {
		this.name = name;
	}

    //메서드
    //클래스 선언부에서 정의되지((E) 않은 유형 매개변수를 사용하는 방법
    public <T extends Object> T test(T t){ //리턴타입이 제너릭이 되었다.
        return t;
    }


}
