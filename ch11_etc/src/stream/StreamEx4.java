package stream;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx4 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "홍길동", "신용권", "김자바", "신민철", "홍길동");

        // Set<String> set = new HashSet<>(names);

        names.stream().distinct().forEach(n -> System.out.println(n));

        System.out.println();
        // 신씨 성을 가진 사람 출력
        names.stream().filter(n -> n.startsWith("신"))
                .forEach(n -> System.out.println(n));

        System.out.println();
        names.stream().distinct()
                .filter(n -> n.startsWith("홍"))
                .forEach(n -> System.out.println(n));

        List<String> fruits = Arrays.asList(
                "apple", "grape", "melon", "watermelon", "banana");

        // 대문자로 변경 후 출력
        for (String string : fruits) {
            System.out.println(string.toUpperCase());
        }
        System.out.println();
        // 새로운 리스트로 생성
        List<String> str1 = new ArrayList<>();
        for (String string : fruits) {
            str1.add(string.toUpperCase());
        }
        System.out.println(str1);
        System.out.println();
        // stream 이용
        List<String> str2 = fruits.stream()
                .map(f -> f.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(str2);

        // Stream 생성
        // IntStream.range(0, 0)
        // of(T ... values) : 가변
        // of(T t)
        Stream<File> stream1 = Stream.of(
                new File("file1.txt"),
                new File("file2.txt"),
                new File("file3"),
                new File("file4.bak"),
                new File("file5.java"));

        Stream<File> stream2 = Stream.of(
                new File("file1.txt"),
                new File("file2.txt"),
                new File("file3"),
                new File("file4.bak"),
                new File("file5.java"));
        // 확장자출력

        Set<String> exSet = new HashSet<>();
        stream1.forEach(f -> {
            int pos = f.getName().indexOf(".");
            if (pos != -1) {
                String ext = f.getName().substring(pos + 1);
                exSet.add(ext);
            }
        });
        System.out.println(exSet);

        // Stream
        stream2.map(f -> f.getName())
                .filter(f -> f.indexOf(".") > -1)
                .map(f -> f.substring(f.lastIndexOf(".") + 1))
                .distinct()
                .forEach(f -> System.out.println(f));
    }
}
