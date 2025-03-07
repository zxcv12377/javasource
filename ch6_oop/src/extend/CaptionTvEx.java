package extend;

public class CaptionTvEx {
    public static void main(String[] args) {
        // Tv tv = new Tv();

        CaptionTv captionTv = new CaptionTv();
        captionTv.channel = 10;
        captionTv.channelUp();
        System.out.println(captionTv.channel);
        captionTv.displayCaption("Hello java1");
        captionTv.caption = true;
        captionTv.displayCaption("Hello java2");
    }
}
