import java.util.Scanner;

public class linearsearch {

    // Function to search an element
    public static boolean search(int[] arr, int key) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Given array
        int[] arr = {1, 3, 5, 7, 9};

        System.out.print("Enter the element to search: ");
        int key = sc.nextInt();

        if (search(arr, key)) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }
}