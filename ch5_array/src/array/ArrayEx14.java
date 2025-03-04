package array;

public class ArrayEx14 {
    public static void main(String[] args) {
        int[][] score = {
                { 100, 78, 68 },
                { 55, 45, 80 },
                { 37, 45, 40 },
                { 89, 78, 65 },
                { 20, 30, 40 }
        };
        int[] total = new int[3];
        System.out.printf("번호 국어 영어 수학 총점 평균\n");
        System.out.println("======================================");
        for (int i = 0; i < score.length; i++) {
            int sum = 0;
            float avg = 0;
            System.out.printf("%3d ", i + 1);
            for (int j = 0; j < score[i].length; j++) {
                sum += score[i][j];
                System.out.printf(" %4d", score[i][j]);
            }
            avg = sum / (float) score[i].length;
            System.out.printf(" %4d  %4.2f", sum, avg);
            System.out.println();
            total[0] += score[i][0];
            total[1] += score[i][1];
            total[2] += score[i][2];
        }
        System.out.println("======================================");
        System.out.printf("토탈 ");
        for (int i : total) {
            System.out.printf("%5d", i);

        }
    }
}
