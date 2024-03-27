package H_java;

public class H04_ThreadEx {

    public static void main(String[] args) {
        SmartPhoneGame game = new SmartPhoneGame();
        Player1 p1 = new Player1();
        p1.setGame(game);
        p1.start();

        Player2 p2 = new Player2();
        p2.setGame(game);
        p2.start();
        
    }
}
class SmartPhoneGame{
    private int level;

    public int getLevel() {
        return level;
    }
    public synchronized void increaseLevel(){
        synchronized(this){
            while (true) {
                this.level ++;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {}
                    
                //현재 스레드의 이름과 레벨 출력
                System.out.println(Thread.currentThread().getName()+" LEVEL : "+this.level);
                    if(this.level%10==0){
                        break;
                }
            }
        }
        
    }
}

class Player1 extends Thread{
    private SmartPhoneGame game;
    public void setGame(SmartPhoneGame game) {
        this.game = game;
        this.setName("Player1");
    }
    public SmartPhoneGame getGame() {
        return game;
    }
    @Override
    public void run() {
        game.increaseLevel();
    }
}
class Player2 extends Thread{
    private SmartPhoneGame game;
    public void setGame(SmartPhoneGame game) {
        this.game = game;
        this.setName("Player2");
    }
    public SmartPhoneGame getGame() {
        return game;
    }
    @Override
    public void run() {
        game.increaseLevel();
    }
}