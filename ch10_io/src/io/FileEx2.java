package io;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

public class FileEx2 {
    public static void main(String[] args) {
        File file1 = new File("c:/temp");
        File dir = new File(file1, "dir");
        File dir2 = new File("c:/temp/sample/dir1");
        // 디렉토리 생성
        if (!dir.exists()) {
            dir.mkdir();
        }
        if (!dir2.exists()) {
            dir2.mkdirs();
        }
        File file2 = new File("c:/temp/file1.txt");
        File file3 = new File("c:/temp/file2.txt");
        File file4 = new File("c:/temp/dir/file1.txt");

        // 파일 생성
        try {
            if (!file2.exists()) {
                file2.createNewFile();
            }
            if (!file3.exists()) {
                file3.createNewFile();
            }
            if (!file4.exists()) {
                file4.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 디렉토리 접근 후 파일 가져오기
        File[] files = file1.listFiles();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd a hh:mm");

        System.out.println("최종수정일\t\t 형태\t\t 크기\t 이름");
        System.out.println("--------------------------------------------------------------");
        for (File file : files) {
            // 디렉토리인지 파일인지 구별해서 출력
            // 최종수정일 형태 크기 이름

            // file.lastModified() => (00:00:00 GMT, January 1, 1970) 기준으로 흐른시간 long으로 반환
            System.out.print(sdf.format(new Date(file.lastModified())) + "\t");
            if (file.isDirectory()) {
                System.out.println("<DIR>\t\t\t" + file.getName());
            } else {
                System.out.println("\t\t" + file.length() + "\t" + file.getName());
            }
            System.out.println();
        }
    }

}
