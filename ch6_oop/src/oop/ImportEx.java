package oop;

// import문
// 다른 패키지의 클래스 사용할 때
import java.text.*;
import java.util.*;
//import extend.*;
// Math안 요소들이 static이기 때문 Math문 사용시 Math. 빼도됨
import static java.lang.Math.*;

// import 사용하지 않는 패키지(자동으로 import 해줌)
// java.lang.*

public class ImportEx {
    public static void main(String[] args) {
        // Parent parent = new Parent();
        Date date = new Date();
        System.out.println(date);
        SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdFormat.format(date));
        // Math: static 메서드로 선언됨
        // System.out.println(Math.min(15, 25));
        System.out.println(min(15, 25));
        // System.out.println(Math.random());
        System.out.println(random());

        // String str;
    }
}
