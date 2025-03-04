package solocoding;

import java.util.Scanner;

public class LifeCycleGame {
    public static int[][] place;

    public LifeCycleGame() {

    }

    // LifeCycleGame
    // 5x5 판 / 1은 다음 차례때 2가됨 / 2는 다음 차례 때 3이됨 / 3은 다음 차례때 사라짐
    // 1의 상하좌우는 다음 차례 때 1이 됨

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        place = new int[size][size];
        placeViewer();
        // #region RANDOM NUMBER PRODUCT
        for (int i = 0; i < place.length; i++) {
            for (int j = 0; j < place.length; j++) {
                place[i][j] = (int) (Math.random() * 2);
                System.out.print(place[i][j]);
            }
            System.out.println();
        }
        // #endregion

        int[][] copy = place.clone();

        for (int i = 0; i < place.length; i++) {
            for (int j = 0; j < place.length; j++) {

            }
        }
        System.out.println();
        for (int i = 0; i < copy.length; i++) {
            for (int j = 0; j < copy.length; j++) {
                System.out.print(copy[i][j]);
            }
            System.out.println();
        }

        sc.close();
    }

    public static void placeViewer() {
        for (int i = 0; i < place.length; i++) {
            for (int j = 0; j < place.length; j++) {
                System.out.print(place[i][j]);
            }
            System.out.println();
        }
    }
}
