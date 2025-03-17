package io;

import java.io.File;

public class FileEx1 {
    public static void main(String[] args) {

        // 파일객체 생성
        File file1 = new File("c:\\temp\\test1.txt");
        File file2 = new File("c:/temp", "test1.txt");

        File dir = new File("c:/temp");
        File file3 = new File(dir, "test1.txt");

        System.out.println("경로를 제외한 파일명 : " + file1.getName());
        String fileName = file1.getName();
        int pos = fileName.lastIndexOf(".");
        System.out.println("확장자를 제외한 파일명 : " + fileName.substring(0, pos));
        System.out.println("확장자 : " + fileName.substring(pos + 1));
        System.out.println("경로를 포함한 파일명 : " + file1.getPath());
        System.out.println("파일의 절대 경로 : " + file1.getAbsolutePath());
        System.out.println("파일의 디렉토리 : " + file1.getParentFile());

        System.out.println("File.pathSeparator : " + File.pathSeparator);
        System.out.println("File.pathSeparatorChar : " + File.pathSeparatorChar);
        String path = "c:\\temp" + File.separator + "test1.txt";
        System.out.println("File.separator : " + File.separator);
        System.out.println("File.separatorChar : " + File.separatorChar);

    }
}
