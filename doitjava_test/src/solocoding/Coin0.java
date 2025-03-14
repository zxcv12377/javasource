package solocoding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Coin0 {
    public static void main(String[] args) {
        int n;
        long k;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = "";
        try {
            str = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        StringTokenizer strToken = new StringTokenizer(str);
        n = Integer.parseInt(strToken.nextToken());
        k = Integer.parseInt(strToken.nextToken());
        int[] value = new int[n];
        for (int i = 0; i < value.length; i++) {
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            value[i] = Integer.parseInt(str);
        }
    }

    public static long coin(long k) {

        return 0;
    }
}
