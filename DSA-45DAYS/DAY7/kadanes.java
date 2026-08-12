import java.util.Scanner;

public class kadanes {

    public int maxSubArray(int[] nums) {
        int Sum = 0;
        int maxi = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            Sum = Sum + nums[i];

            maxi = Math.max(maxi, Sum);

            if (Sum < 0) {
                Sum = 0;
            }
        }

        return maxi;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        kadanes obj = new kadanes();

        int result = obj.maxSubArray(nums);

        System.out.println("Maximum Subarray Sum = " + result);

        sc.close();
    }
}