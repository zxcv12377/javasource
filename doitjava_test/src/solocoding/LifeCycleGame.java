package solocoding;

import java.util.Scanner;

public class LifeCycleGame {
    private static int[][] place;
    private static boolean[][] changed;
    private static int size = 0;

    // LifeCycleGame
    // 5x5 판 / 1은 다음 차례때 2가됨 / 2는 다음 차례 때 3이됨 / 3은 다음 차례때 사라짐
    // 1의 상하좌우는 다음 차례 때 1이 됨
    // key-value 사용할지 int배열과 boolean배열을 사용할지 선택
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        size = sc.nextInt() + 1;
        place = new int[size][size];
        changed = new boolean[size][size];
        // #region INITIALIZE
        for (int i = 1; i < place.length - 1; i++) {
            for (int j = 1; j < place.length - 1; j++) {
                int rand = (int) (Math.random() * 2);
                changed[i][j] = false;
                place[i][j] = rand;
            }
        }
        placeViewer();
        // #endregion

        System.out.println();
        for (int i = 1; i < place.length - 1; i++) {
            for (int j = 1; j < place.length - 1; j++) {
                if (place[i][j] == 0) {// ArrayIndexOutOfBoundsException
                    if ((place[i][j + 1] == 1 || place[i][j - 1] == 1 || place[i + 1][j] == 1 || place[i - 1][j] == 1)
                            && changed[i][j] == false) {
                        place[i][j] = 1;
                        changed[i][j] = true;
                    }
                } else if (place[i][j] == 1 || changed[i][j] == false) {
                    place[i][j] = 2;
                } else if (place[i][j] == 2) {
                    place[i][j] = 3;
                }
            }
        }
        placeViewer();
        sc.close();
    }

    public static void placeViewer() {
        for (int i = 0; i < place.length; i++) {
            for (int j = 0; j < place[i].length; j++) {
                System.out.print(place[i][j]);
            }
            System.out.println();
        }
    }
}
