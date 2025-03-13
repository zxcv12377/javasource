package api.string;

public class StringEx5 {
    public static void main(String[] args) {
        System.out.println("AB 문자열 횟수 : " + count("12345AB12AB345AB", "AB"));
        System.out.println("AB 문자열 횟수 : " + count("12345", "AB"));
    }

    public static int count(String src, String target) {
        int count = 0;
        int temp = 0;
        while ((temp = src.indexOf(target, temp)) != -1) {
            temp += target.length();
            count++;
        }

        return count;
    }
}
