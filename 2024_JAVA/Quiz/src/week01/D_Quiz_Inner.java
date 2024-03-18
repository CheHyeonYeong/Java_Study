package week01;

/*
 * ### 만능 리모컨 

익명클래스 + 인터페이스 => 
  익명클래스와 인터페이스를 함께 사용하면 상황에 따라 가변 가능한 코드를 만들 수 있습니다. 
Machine이라는 클래스를 상속해서 에어컨, 컴퓨터, TV등의 여러가지 기계 클래스들이 존재한다고 가정!
이때 어느 기계에도 적용 가능한 만들 리모콘을 만들어 보세요!!! 

  Machine 클래스 
   - 변수 : name
   - 메서드 : machineWork -> 리모콘을 이용하여 On/Off기능을 동작함!
   
  TV, 컴퓨터, 에어컨 -> Machine을 상속받아서 이름만 동작하고, 일부 메서드는 알아서 작성하세요!!!

  Main메서드가 있는 클래스를 생성하여 테스트 해보세요 ~~~ 
 */

 interface RemoteMachine{
    void trunON();
    void trunOff();
 }

class Machine {
    String name;
    public Machine(String name){
        this.name = name;
    }
    public void machineWork(RemoteMachine m ){
        System.out.println(name + "을(를) 조작합니다.");

            m.trunON();
            m.trunOff();
        
        
    }
    
}

public class D_Quiz_Inner {
    public static void main(String[] args) {
        Machine tv = new Machine("TV"){
            @Override
            public void machineWork(RemoteMachine m) {
                super.machineWork(m);
            }
        };
        tv.machineWork(new RemoteMachine() {
            @Override
            public void trunON() {
                System.out.println(tv.name + "전원이 켜집니다.");
                
            }
            @Override
            public void trunOff() {
                System.out.println(tv.name +"전원이 꺼집니다.");
                
            }
        });


        Machine computer = new Machine("computer"){
            @Override
            public void machineWork(RemoteMachine m) {
                super.machineWork(m);
            }
        };;
        computer.machineWork(new RemoteMachine() {
            @Override
            public void trunON() {
                System.out.println(computer.name + "전원이 켜집니다.");
                
            }
            @Override
            public void trunOff() {
                System.out.println(computer.name +"전원이 꺼집니다.");
                
            }
        });


        Machine aircon = new Machine("aircon"){
            @Override
            public void machineWork(RemoteMachine m) {
                super.machineWork(m);
            }
        };;
        aircon.machineWork(new RemoteMachine() {
            @Override
            public void trunON() {
                System.out.println(aircon.name + "전원이 켜집니다.");
                
            }
            @Override
            public void trunOff() {
                System.out.println(aircon.name +"전원이 꺼집니다.");
                
            }
        });

        
    }
}
