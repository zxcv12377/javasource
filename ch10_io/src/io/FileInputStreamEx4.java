package io;

import java.io.*;

public class FileInputStreamEx4 {
    public static void main(String[] args) {
        int data = 0;
        byte[] b = new byte[1024];
        // try-with-resource : fianlly에서 자원해제하는 부분 자동화
        try (FileInputStream fis = new FileInputStream("c:/temp/img1.jpg");
                BufferedInputStream bis = new BufferedInputStream(fis);
                FileOutputStream fos = new FileOutputStream("c:/temp/outputimg1.jpg");
                BufferedOutputStream bos = new BufferedOutputStream(fos)) {

            while ((data = fis.read(b)) != -1) {
                // char ch = (char) data;
                fos.write(b);
            }
            bos.flush(); // 버퍼를 비우는 작업
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
