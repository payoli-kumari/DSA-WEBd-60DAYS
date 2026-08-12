import java.util.Scanner;

public class shuffle_arr {
    public static int[] shuffle(int[] nums, int n) {
        int arr[] =new int[2*n];
        int count=0;
        for(int i=0;i<n;i++){
            arr[count]=nums[i];
            arr[count+1]=nums[i+n];
            count+=2;
        }
            return arr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of elements in array:");
        int n = sc.nextInt();

        int nums[]= new int[2*n];
        System.out.println("Enter" +(2*n)+ " elements:");

       for (int i = 0; i < 2 * n; i++) {
       nums[i] = sc.nextInt();
}

        int[]  result= shuffle(nums,n);

    System.out.println("shuffle array:" +" ");

    for (int i=0; i<result.length; i++){
        System.out.println(result[i] +" ");
    }
        
    }
}




/*2nd approach ( both have the same time complexity, but Method 1 uses less extra memory.)

import java.util.Scanner;

class ShuffleArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array length: ");
        int length = sc.nextInt();

        int[] nums = new int[length];

        System.out.println("Enter array elements:");
        for (int i = 0; i < length; i++) {
            nums[i] = sc.nextInt();
        }

        // Divide length into two equal parts
        int n = length / 2;

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        for (int i = 0; i < n; i++) {
            arr1[i] = nums[i];
        }

        for (int j = 0; j < n; j++) {
            arr2[j] = nums[j + n];
        }

        int[] result = new int[length];

        int k = 0;

        for (int i = 0; i < n; i++) {
            result[k] = arr1[i];
            result[k + 1] = arr2[i];

            k += 2;
        }

        System.out.println("Shuffled array:");

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}

*/