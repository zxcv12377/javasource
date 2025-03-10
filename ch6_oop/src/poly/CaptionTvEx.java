package poly;

public class CaptionTvEx {
    public static void main(String[] args) {
        // 조상 타입의 참조변수로 자식 인스턴스 참조
        // Tv tv = new Tv();
        Tv2 tv = new CaptionTv();

        // CaptionTv captionTv = new CaptionTv();
        tv.channel = 10;
        tv.channelUp();
        System.out.println(tv.channel);

        CaptionTv ctv = (CaptionTv) tv;
        ctv.displayCaption("Hello java1");
        ctv.caption = true;
        ctv.displayCaption("Hello java2");
    }
}
