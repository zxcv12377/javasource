package io;

import java.io.*;
import java.util.Scanner;

public class WriterEx1 {
    public static void main(String[] args) {
        // 키보드에서 입력을 받아서 그 내용을 파일에 작성하는 프로그램
        // 사용자가 q를 입력하면 입력중지
        Scanner sc = new Scanner(System.in);
        String str = "";
        String result = "";
        do {
            System.out.print(">> ");
            str = sc.nextLine();
            result += str;

            try (Writer writer = new FileWriter("c:/temp/output3.txt", true);
                    BufferedWriter bw = new BufferedWriter(writer)) {
                // writer.write(str);
                bw.write(result);

            } catch (IOException e) {
                e.printStackTrace();
            }

        } while (!((str = sc.nextLine()).equalsIgnoreCase("q")));

        sc.close();

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
