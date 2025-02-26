package op;

public class CompareEx3 {
    public static void main(String[] args) {
        String str1 = "abc"; // String pool에 저장됨
        String str2 = "abc"; // 위에 String pool에 저장된 주소의 값을 사용
        String str3 = new String("abc"); // heap pool에 저장
        
        // String.equals(String) <- 대소문자 구분함
        // String.equalsIgnoreCase(String) <- 이친구는 대소문자 구분없이 비교함
        // 둘 모두 값만 비교함

        System.out.printf("str1 == str2 = %b\n", (str1 == str2)); // 같은 공간에서는 값 비교
        System.out.printf("str1 == str3 = %b\n", (str1 == str3)); // 다른 공간과는 주소 비교
        System.out.printf("str1.equals(str3) = %b\n", (str1.equals(str3)));
        System.out.printf("str1.equals((\"ABC\") = %b\n", (str1.equals("ABC")));
        System.out.printf("str1.equalsIgnoreCase(str3) = %b\n", (str1.equalsIgnoreCase(str3)));
        System.out.printf("str1.equalsIgnoreCase(\"ABC\") = %b\n", (str1.equalsIgnoreCase("ABC")));
        
    }
}
