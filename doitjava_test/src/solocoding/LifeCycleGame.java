package solocoding;

import java.util.Scanner;

public class LifeCycleGame {
    private static int[][] place;
    private static int[][] copyPlace;
    private static boolean[][] changed;
    private static int size = 0;
    private static int sizePlus = 0;

    // LifeCycleGame
    // 5x5 판 / 1은 다음 차례때 2가됨 / 2는 다음 차례 때 3이됨 / 3은 다음 차례때 사라짐
    // 1의 상하좌우는 다음 차례 때 1이 됨
    // key-value 사용할지 int배열과 boolean배열을 사용할지 선택
    public static void main(String[] args) {
        // #region PARAMATER
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        size = Integer.parseInt(inputString);
        sizePlus = size + 2;
        place = new int[sizePlus][sizePlus];
        changed = new boolean[sizePlus][sizePlus];
        copyPlace = new int[sizePlus][sizePlus];
        // #endregion
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
        // #region LOOP
        while (true) {
            for (int i = 0; i < place.length; i++) {
                System.arraycopy(place[i], 0, copyPlace[i], 0, place[0].length);
            }

            for (int i = 1; i < place.length - 1; i++) {
                for (int j = 1; j < place.length - 1; j++) {
                    if (copyPlace[i][j] == 0) {// ArrayIndexOutOfBoundsException -> 배열크기를 1줄씩 더 늘리는 것으로 해결
                        if ((copyPlace[i][j + 1] == 1 || copyPlace[i][j - 1] == 1 || copyPlace[i + 1][j] == 1
                                || copyPlace[i - 1][j] == 1)) {
                            place[i][j] = 1;
                        }
                    } else if (place[i][j] == 1) {
                        place[i][j] = 2;
                    } else if (place[i][j] == 2) {
                        place[i][j] = 3;
                    } else if (place[i][j] == 3) {
                        place[i][j] = 0;
                    }
                }
            }
            placeViewer();

            if (allDestroyedCheck()) {
                System.out.println("생명 순환이 멈춤");
                sc.close();
                System.exit(0);
            }
            System.out.println("계속 진행하시겠습니까?(Q를 누르시면 종료됩니다.)");
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("q")) {
                sc.close();
                System.exit(0);
            }
        }
        // #endregion
    }

    // #region METHODS
    public static void placeViewer() {
        for (int i = 1; i < place.length - 1; i++) {
            for (int j = 1; j < place[i].length - 1; j++) {
                System.out.print(place[i][j]);
            }
            System.out.println();
        }
    }

    public static void testPlaceViewer() {
        for (int i = 0; i < place.length; i++) {
            for (int j = 0; j < place[i].length; j++) {
                System.out.print(place[i][j]);
            }
            System.out.println();
        }
    }

    public static boolean allDestroyedCheck() {
        int count = 0;
        for (int i = 1; i < place.length - 1; i++) {
            for (int j = 1; j < place.length - 1; j++) {
                if (place[i][j] == 0) {
                    count++;
                }
            }
        }
        return (size * size) == count ? true : false;
    }
    // #endregion
}
