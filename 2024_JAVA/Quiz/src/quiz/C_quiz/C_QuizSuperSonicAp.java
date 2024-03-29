package quiz.C_quiz;

class Airplane {
    // Airplane은 멤버 변수로 name을 가지고 있습니다. 
	//생성자로 이름을 입력받아 초기화 받게 설정하고, 
	//메서드는 takeOff(), fly(), land() 3가지를 가지고 있습니다.
    String name;
    Airplane(String name){
        this.name = name;
    }
    Airplane(){
        this.name = "미정";
    }
    void takeOff(){

    }
    void fly(){

    }
    void land(){

    }
	
}

class SuperSonicAp extends Airplane {

    	/*
	 *  1. Airplane을 생성 상속 받습니다. 생성자는 이름을 받아서 초기화
	 *  2. flyMode는 int형 변수로 선언합니다.
	 *  3. fly() 메서드를 오버라이딩 합니다.
	 *     fly() 메서드 안에서는 flyMode가 1이면 "고속 모드로 비행합니다." 출력
	 *     	flyMode가 0이라면, super를 통해 부모님의 메서드를 호출
	 */

     int flyMode ;

     SuperSonicAp(){
        super();
     }
     @Override
     void fly(){
        if(flyMode==1){
            System.out.println("고속모드로 비행합니다.");
        }
        else if (flyMode==0){
            super.fly();
        }
     }
}

public class C_QuizSuperSonicAp {
	
	public static void main(String[] args) {
		
	}
}



