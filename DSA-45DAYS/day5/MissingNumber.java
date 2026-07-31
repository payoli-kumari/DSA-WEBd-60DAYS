public class MissingNumber {

    public static int missing_no(int[] arr) {

        int xorsum = 0;
        int n = arr.length;

        // XOR all numbers from 0 to n
        for (int i = 0; i <= n; i++) {
            xorsum ^= i;
        }

        // XOR all array elements
        for (int i = 0; i < n; i++) {
            xorsum ^= arr[i];
        }

        return xorsum;
    }

    public static void main(String[] args) {
        int[] arr = {3, 0, 1};

        System.out.println(missing_no(arr));
    }
}