package io;

import java.io.*;
import java.util.Scanner;

public class WriterEx2 {
    public static void main(String[] args) {
        // 키보드에서 입력을 받아서 그 내용을 파일에 작성하는 프로그램
        // 사용자가 q를 입력하면 입력중지

        String result = "";

        try (Scanner sc = new Scanner(System.in);
                Writer writer = new FileWriter("c:/temp/output3.txt", true);
                BufferedWriter bw = new BufferedWriter(writer)) {
            String str = "";
            // writer.write(str);
            do {
                System.out.print(">> ");
                str = sc.nextLine();

                if (!str.equalsIgnoreCase("q")) {
                    bw.write(str);
                    bw.newLine();
                }
            } while (!str.equalsIgnoreCase("q"));

        } catch (IOException e) {
            e.printStackTrace();
        }

        // try (BufferedReader bf = new BufferedReader(new
        // InputStreamReader(System.in));
        // Writer wr = new FileWriter("c:/temp/output3.txt", true)) {
        // String str = "";
        // while ((str = bf.readLine()) != null) {
        // if (str.equalsIgnoreCase("q")) {
        // return;
        // }
        // wr.write(str);
        // }
        // } catch (IOException e) {
        // e.printStackTrace();
        // }
    }
}