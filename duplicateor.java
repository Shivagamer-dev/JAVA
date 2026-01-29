import java.util.Scanner;

public class duplicateor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("neter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean hasDuplicate = false;

    
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    hasDuplicate = true;
                    break;
                }
            }
            if (hasDuplicate) {
                break;
            }
        }

        if (hasDuplicate) {
            System.out.println("aray contains duplicate elements.");
        } else {
            System.out.println("array does not contain duplicate elements.");
        }

        sc.close();
    }
}