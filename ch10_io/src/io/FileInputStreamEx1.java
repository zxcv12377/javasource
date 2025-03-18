package io;

import java.io.*;

public class FileInputStreamEx1 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        int data = 0;
        try {
            fis = new FileInputStream("c:/temp/file1.txt");
            fos = new FileOutputStream("c:/temp/output1.txt");
            while ((data = fis.read()) != -1) {
                char ch = (char) data;
                fos.write(ch);
            }

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
