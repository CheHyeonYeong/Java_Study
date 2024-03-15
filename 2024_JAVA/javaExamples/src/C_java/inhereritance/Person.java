package C_java.inhereritance;

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

	public void walk(){
		System.err.println(name+"은 잘 걸어가요");
	}
    public String getDetails(){
        return String.format("이름 : %s\t나이 : %d\t height : %f\tweight : %f", name, age, height, weight);
    }
    
// Object 메서드 오버라이드 hashCode() - 객체 동등 비교를 위해서 값 생성하는 메서드
	@Override
	public int hashCode() {
		// 특정 값을 기준으로 확인하기 위해서 메서드 수정!! (이름과 나이를 기준으로)
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * ((name == null)? 0 : name.hashCode());
		return result;
	}

	// 동일 객체 판단... 객체의 값을 이용... 
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {  //동일한 객체
			return true;
		}
		if (obj == null) return false; // null 값 확인... 
		if (getClass() != obj.getClass()) return false; //객체 생성 클래스 확인
		Person other = (Person)obj;
		if(age != other.age) return false; //객체 내에 age멤버의 값을 비교 확인
		if(name == null) {
			if(other.name != null) {
				return false; //객체 내의 이름 확인
			}
		}else if(!name.equals(other.name)) return false;

		return true;
	}



	@Override
	public String toString() {
		return "Person [name="+name+", age="+age+"]";
	}


}
