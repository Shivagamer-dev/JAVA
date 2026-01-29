import java.util.Scanner;

public class Shiva590012350 {
    public static void main(String [] args) {
       int sum = 0;
       int sum_array = 0;
       Scanner sc = new Scanner(System.in);
       sum = sc.nextInt();
       int arr[] = new int[5];
         for(int i=0; i<5; i++) {
            arr[i] = sc.nextInt();
            sum_array += arr[i];
         }
         if(sum == sum_array){
            System.out.println("Yes");
         }
         else{
            System.out.println("No");
         }


    }
}