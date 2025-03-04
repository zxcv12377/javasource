package array;

public class ArrayEx6 {
    public static void main(String[] args) {
        int[] arr = { 78, 99, 52, 35, 14 };

        int tmp[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            tmp[i] = arr[i];
        }
        // System.arraycopy()
        int tmp2[] = new int[10];
        System.arraycopy(arr, 0, tmp2, 1, arr.length);
    }
}
