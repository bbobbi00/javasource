package ch4;

public class TvEx {

  public static void main(String[] args) {
    // 생성자 호출
    Tv tv = new Tv("black",3,true);
    // System.out.println(tv.color);
    // System.out.println(tv.channel);
    // System.out.println(tv.power);

    // tv.color = "black";
    // tv.channel = 3;
    // tv.power = true;

    


     tv.channelUp();
     System.out.println("현재 채널" + tv.channel());
    // 채널 번호 직접 입력
    tv.setChannel(45);
    System.out.println("현재 채널" + tv.getChannel());

    // 전원 끄기
    tv.setPower(false);


  }
}
