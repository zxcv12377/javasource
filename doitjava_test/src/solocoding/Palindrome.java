package solocoding;

// 반환값 호출 횟수
public class Palindrome {
    public static String recursion(String s, int l, int r) {
        if (l >= r)
            return "1 " + (l + 1);
        else if (s.charAt(l) != s.charAt(r))
            return "0 " + (l + 1);
        else
            return recursion(s, l + 1, r - 1);
    }

    public static String isPalindrome(String s) {
        return recursion(s, 0, s.length() - 1);
    }

    public static void main(String[] args) {
        System.out.println("ABBA: " + isPalindrome("ABBA"));
        System.out.println("ABC: " + isPalindrome("ABABA"));
        System.out.println(isPalindrome("AAA"));
    }
}
