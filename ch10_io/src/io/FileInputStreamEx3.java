package io;

import java.io.*;

public class FileInputStreamEx3 {
    public static void main(String[] args) {
        int data = 0;
        byte[] b = new byte[1024];
        // try-with-resource : fianlly에서 자원해제하는 부분 자동화
        try (FileInputStream fis = new FileInputStream("c:/temp/img1.jpg");
                FileOutputStream fos = new FileOutputStream("c:/temp/outputimg1.jpg");) {

            long start = System.currentTimeMillis();
            while ((data = fis.read(b)) != -1) {
                // char ch = (char) data;
                fos.write(b);
            }
            long end = System.currentTimeMillis();
            System.out.println(end - start);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
