package lambda;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.IntSupplier;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaEx2 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // void accept(T t);
        // 숫자를 전달인자로 받아 출력하기

        Consumer<Integer> consumer = (a) -> System.out.println(a);
        consumer.accept(4);

        // 문자를 전달인자로 받아 출력
        Consumer<String> consumer1 = (a) -> System.out.println(a);
        consumer1.accept("sssssssssssssss");

        BiConsumer<String, String> biConsumer = (t, u) -> System.out.println(t + u);
        biConsumer.accept("ss", "aa");

        DoubleConsumer doubleConsumer = (d) -> System.out.println(d);
        doubleConsumer.accept(50.5);

        ObjDoubleConsumer<String> objDoubleConsumer = (t, d) -> System.out.println(t + d);
        objDoubleConsumer.accept("OBJDOUBLECONSUMER_", 50.5);

        // Math.random() : 1~6을 리턴
        Supplier<Integer> supplier = () -> (int) ((Math.random() * 6) + 1);
        System.out.println(supplier.get());

        IntSupplier intSupplier = () -> (int) ((Math.random() * 6) + 1);
        System.out.println(intSupplier.getAsInt());

        // 전달인자로 받은 문자열의 길이가 0인지 테스트한 후 0이라면 빈 문자열입니다 출력
        Predicate<String> predicate = (str) -> str.length() == 0;
        if (predicate.test("")) {
            System.out.println("빈 문자열 입니다.");
        }

        // 전달 인자로 받은 숫자가 짝수인지 테스트 한 후 짝수라면 짝수입니다 출력.

        Predicate<Integer> predicate1 = (num) -> (num % 2) == 0;
        if (predicate1.test(50)) {
            System.out.println("짝수");
        } else {
            System.out.println("홀수");
        }

        // 숫자를 받아서 문자로 리턴
        Function<Integer, String> function = (i) -> String.valueOf(i);
        System.out.println(function.apply(50));

        // 사칙연산
        BiFunction<Integer, Integer, Integer> f2 = (x, y) -> x + y;
        System.out.println(f2.apply(5, 4));

    }
}
