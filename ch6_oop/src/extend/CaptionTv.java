package extend;

public class CaptionTv extends Tv {
    boolean caption;

    void displayCaption(String txt) {
        if (caption) {
            System.out.println(txt);
        }
    }
}
