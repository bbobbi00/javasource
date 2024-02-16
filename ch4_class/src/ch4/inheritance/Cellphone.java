package ch4.inheritance;

public class DmbCellPhone extends Cellphone {

    int channel;

    void turnOnDmb() {
        System.out.println("채널" + channel + "번 DMB 방송 시작");
    }
    void changeChannel1Dmb(int channel){
        this.channel = channel1;
        System.out.println("채널" + channel + "번으로 변경");
    }

    void turnOffDmb(){
        System.out.println("채널" + channel + "번 DMB 방송 종료");
    }
    
}
