import java.util.Scanner;

public class multiplyby10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int[] newArr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Store new values in the new array
        for (int i = 0; i < n; i++) {
            newArr[i] = arr[i] * 10;
        }
        // Print the new array
        System.out.println("new array:");

        for (int i = 0; i < n; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}