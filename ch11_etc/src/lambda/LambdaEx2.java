package lambda;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.IntSupplier;
import java.util.function.ObjDoubleConsumer;
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
        // Function function;
        // Operator operator;
        // Predicate predicate;
    }
}
