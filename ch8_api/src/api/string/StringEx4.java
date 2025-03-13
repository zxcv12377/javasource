package api.string;

import java.util.Arrays;

public class StringEx4 {
    public static void main(String[] args) {
        StringEx4 obj = new StringEx4();
        String[] names = { "Queen", "Tod", "Kim", "Lee", "Choi" };

        String result = obj.findKim(names);
        System.out.println(result);
    }

    public String findKim(String[] seoul) {

        // for (int i = 0; i < seoul.length; i++) {
        // if (seoul[i].equals("Kim")) {
        // return "Kim은 " + (i + 1) + "번째에 있다.";
        // }
        // }
        // return "Kim은 없다";
        int i = Arrays.asList(seoul).indexOf("Kim");
        // List<String> list = Arrays.asList(seoul);

        return "Kim은 " + (i + 1) + "번째에 있다.";
    }
}
