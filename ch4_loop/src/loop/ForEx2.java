package loop;

// import java.util.Scanner;

public class ForEx2 {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            System.out.println(i + "   ");
        }
        System.out.println();
        for (int i = 10; i > 0; i--) {
            System.out.println(i + "   ");
        }
        System.out.println();
        for (int i = 1; i < 11; i++) {
            if(i % 2 == 0){
                System.out.println(i + "   ");
            }
        }
        System.out.println();
        for (int i = 1; i < 11; i+=2) {
            System.out.println(i + "   ");
        }
    }
}
// Scanner scanner = new Scanner(System.in);
//         System.out.printf("정수 입력 : ");
//         String str = scanner.nextLine();
//         int n = Integer.parseInt(str);

//         for (int i = 1; i < n * 2; i += 2) { // 별그리기 피라미드
//             for (int j = n * 2 - 1; j > i; j -= 2) {
//                 System.out.printf(" ");
//             }
//             for (int j = 0; j < i; j++) {
//                 System.out.printf("0");
//             }
//             System.out.println("");
//         }
//         System.out.println("");
//         System.out.println("");
//         for (int i = 1; i < n * 2; i += 2) { // 별그리기 역피라미드
//             for (int j = 1; j < i; j += 2) {
//                 System.out.printf(" ");
//             }
//             for (int j = n * 2; j > i; j--) {
//                 System.out.printf("0");
//             }
//             System.out.println("");
//         }
//         scanner.close();

// j = 9 = 1 0
// 5 000
// j = 7 = 3 00000
// 456 0000000
// j = 5 = 5 000000000
// 34567
// j = 3 = 7
// 2345678
// j = 1 = 9
// 123456789