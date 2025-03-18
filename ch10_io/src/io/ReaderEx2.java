package io;

import java.io.*;
import java.nio.charset.Charset;

public class ReaderEx2 {
    public static void main(String[] args) {
        // 문자 기반

        try (Reader reader = new FileReader("c:/temp/file1.txt", Charset.forName("utf-8"));
                BufferedReader br = new BufferedReader(reader);
                Writer writer = new FileWriter("c:/temp/output2.txt", true);
                BufferedWriter bw = new BufferedWriter(writer)) {
            String str = "";
            while ((str = br.readLine()) != null) {
                bw.write(str);
                bw.newLine();

            }
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
