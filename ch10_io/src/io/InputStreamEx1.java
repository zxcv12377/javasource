package io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

// 입력장치에서 읽어오기

public class InputStreamEx1 {
    public static void main(String[] args) {
        // ~~Stream : 입력값 byte 형태로 처리
        InputStream in = System.in;
        OutputStream out = System.out;

        try {
            // 한바이트만 읽은 후 int로 반환 (영어, 숫자만 가능)
            // int input = in.read();
            // out.write(input);
            // int input = 0;
            // while ((input = in.read()) != -1) {
            // out.write(input);
            // }
            byte[] b = new byte[1024];
            while (in.read(b) != -1) {
                out.write(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
