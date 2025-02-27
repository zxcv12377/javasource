package condition;

//import java.util.Arrays;
import java.util.Scanner;

public class IfTest10 {
   static int min = 0, max = 0;
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.printf("첫 정수 입력 : ");
      String input = scanner.nextLine();
      int value1 = Integer.parseInt(input);
      
      System.out.printf("\n두번째 정수 입력 : ");
      input = scanner.nextLine();
      int value2 = Integer.parseInt(input);
      
      System.out.printf("\n세번째 정수 입력 : ");
      input = scanner.nextLine();
      int value3 = Integer.parseInt(input);

      if(value1 > value2){
         if(value1 > value3){
            max = value1;
            if(value2 > value3){
               min = value3;
            }
            else{
               min = value2;
            }
         }
      }
      else if(value3 > value1){
         if(value3 > value2){
            max = value3;
            if(value2 > value1){
               min = value1;
            }
            else{
               min = value2;
            }
         }
      }
      else{
         if(value2 > value3){
            max = value2;
            if(value1 > value3){
               min = value3;
            }
            else{
               min = value1;
            }
         }
      }
      //maxValue(value1, value2, value3);
      System.out.printf("\n최소값 %d 최대값 %d", min, max);
      scanner.close();
    }

   //  public static void maxValue (int a, int b, int c){ // 배열 오름차순 정렬을 이용함
   //    int[] arr = {a,b,c};
   //    Arrays.sort(arr);
   //    min = arr[0];
   //    max = arr[2];      
   //  }
}
