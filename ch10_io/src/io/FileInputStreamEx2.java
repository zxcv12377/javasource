package io;

import java.io.*;

public class FileInputStreamEx2 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        int data = 0;
        byte[] b = new byte[1024];
        try {
            fis = new FileInputStream("c:/temp/img1.jpg");
            fos = new FileOutputStream("c:/temp/outputimg1.jpg");
            long start = System.currentTimeMillis();
            while ((data = fis.read(b)) != -1) {
                // char ch = (char) data;
                fos.write(b);
            }
            long end = System.currentTimeMillis();
            System.out.println(end - start);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
                fos.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
