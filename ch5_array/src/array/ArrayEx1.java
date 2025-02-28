package array;

public class ArrayEx1 {
    public static void main(String[] args) {
        int[] scores = new int[5];
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }

        int[] scores2 = { 85, 65, 95, 75, 100 };
        System.out.println("세번째 학생 : " + scores2[2]);
        System.out.println("배열 길이 : " + scores2.length);

        scores2[4] = 98;
        System.out.println("다섯번째 학생 : " + scores2[4]);

        System.out.println(scores2[5]);
    }
}
