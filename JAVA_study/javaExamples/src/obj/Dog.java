package obj;

public class Dog implements Comparable<Dog>{ //제너릭으로 <> 비교 인터페이스 대상은 Dog입니다.

    //멤버 변수
    String dogID;
    String dogName;
    public int weight;

    public Dog(String dogID, String dogName, int weight){
        super();
        this.dogID = dogID;
        this.dogName = dogName;
        this.weight = weight;
    }
    @Override
    public String toString(){
        return "Dog [dogId="+dogID+"DogName = "+dogName+"]"+this.hashCode();
    }

    //getter setter 만들기

    public Object getDogID() {
		return this.dogID;
	}

    public void setDogID(String dogID) {
        this.dogID = dogID;
    }

    public Object getDogName() {
		return this.dogName;
	}

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }


    public Object getWeight() {
		return this.weight;
	}

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null) return false; 
        if(getClass() != obj.getClass()) return false;
        
        
        //객체 내 정보 확인
        Dog other = (Dog)obj;
        if(dogID == null){
            if(other.dogID != null)return false;
            else if(!dogID.equals(other.dogID)) return false;
        }

        if(dogName ==null){
            if(other.dogName != null)return false;
            else if(!dogName.equals(other.dogName)) {
                return false;}
        }

        if(weight != other.weight)return false;

        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result +((dogID)==null?0:dogID.hashCode());
        result = prime * result +((dogID)==null?0:dogName.hashCode());
        result = prime * result+weight;
        return result;
    }

    @Override
    public int compareTo(Dog o) {
        //두 객체 간에 비교 값을 지정...
        return this.weight - o.weight;
    }
}
