package io;

import java.io.*;
import java.nio.charset.Charset;

public class ReaderEx3 {
    public static void main(String[] args) {
        // 문자 기반

        try (Reader reader = new FileReader("./ch10_io/src/io/FileEx1.java", Charset.forName("utf-8"));
                BufferedReader br = new BufferedReader(reader);) {
            String str = "";
            int num = 1;
            while ((str = br.readLine()) != null) {
                System.out.println(num + " " + str);
                num++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
