package array;

public class ArrayEx13 {
    public static void main(String[] args) {
        int[][] arr1 = new int[2][2];

        arr1[0][0] = 73;
        arr1[0][1] = 83;
        arr1[1][0] = 63;
        arr1[1][1] = 53;

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + "  ");
            }
            System.out.println();
        }
        for (int[] tmp : arr1) {
            for (int is2 : tmp) {
                System.out.print(is2 + "  ");
            }
            System.out.println();
        }
        System.out.println();

        int[][] arr2 = {
                { 100, 100, 100 },
                { 20, 30, 40 }
        };

        int sum = 0;
        for (int[] tmp : arr2) {
            for (int is2 : tmp) {
                sum += is2;
            }
        }

        System.out.println(sum);
    }

}
