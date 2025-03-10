package poly;

public class CaptionTv extends Tv2 {
    boolean caption;

    void displayCaption(String txt) {
        if (caption) {
            System.out.println(txt);
        }
    }
}
