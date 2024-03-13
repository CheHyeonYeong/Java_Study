package C_java;

public class TV {
    //한계값 기호 상수 이용
    public static final int MAX_CHANNEL = 300;
    public static final int MIN_CHANNEL = 1;
    public static final int MAX_VOLUME = 100;
    public static final int MIN_VOLUME = 0;
    
    boolean status=false; //off
    int channel;
    int volume;
    int preChannel;
    
    public TV(){
        channel=7;
        volume=20;
    }
    //행위 제작
    void pushPower(){
        //뒤집기
        status= !status;
    }
    void channelUp(){
        if (this.status){
            preChannel = this.channel;
            if(this.channel==MAX_CHANNEL){
                this.channel=MIN_CHANNEL;
                System.out.println("채널 : "+this.channel);
            }
            else{
                this.channel++;
                System.out.println("채널 : "+this.channel);
            }
        }
        else {
            System.out.println("전원부터 켜세용");
        }
       
    }
    void channelDown(){
        
        if (this.status){
            preChannel = this.channel;
            if(this.channel==MIN_CHANNEL){
                this.channel=MAX_CHANNEL;
                System.out.println("채널 : "+this.channel);
            }
            else{
                this.channel--;
                System.out.println("채널 : "+this.channel);
            }
        }
        else {
            System.out.println("전원부터 켜세용");
        }
    }
    void channelMove(int move){
        if (this.status){
            preChannel = this.channel;
            this.channel = move;
    
            System.out.println("채녈을 "+ channel+"으로 이동했습니다.");
        }
        else {
            System.out.println("전원부터 켜세용");
        }
        
    }
    void preChannelMove(){
        if (this.status) {
            int tenmp = preChannel;
            preChannel = channel;
            this.channel = tenmp;

            System.out.println("채녈을 "+ channel+"으로 이동했습니다.");

        }
        else {
            System.out.println("전원부터 켜세용");
        }
    }
    void VolumeUp(){
        if (this.status) {
            if (this.volume == MAX_VOLUME) {
                System.out.println("더 이상 볼륨을 올릴 수 없습니다.");
            } else {
                this.volume++;
                System.out.println("볼륨 : " + this.volume);
            }

        }
        else {
            System.out.println("전원부터 켜세용");
        }
    }
    void VolumeDown(){

        if (this.status) {
            if (this.volume == MIN_VOLUME) {
                System.out.println("더 이상 볼륨을 내릴 수 없습니다.");
            } else {
                this.volume--;
                System.out.println("볼륨 : " + this.volume);
            }
        }
        else {
            System.out.println("전원부터 켜세용");
        }
    }

    void getTV(){
        //전원 채널 볼륨 저장된 이전채널
        System.out.println("전원 : " +status);
        System.out.println("채널 : " +channel);
        System.out.println("볼륨 : " +volume);
        System.out.println("저장된 이전채널 : " +preChannel);
    }
}
