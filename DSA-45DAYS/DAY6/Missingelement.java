import java.util.*;

public class Missingelement {

    public static List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> ans = new ArrayList<>();

        int n = nums.length;

        // Mark the numbers that are present
        for (int index = 0; index < n; index++) {

            int value = Math.abs(nums[index]);

            int position = value - 1;

            if (nums[position] > 0) {
                nums[position] = -nums[position];
            }
        }

        // Positive positions represent missing numbers
        for (int i = 0; i < n; i++) {

            if (nums[i] > 0) {

                int valueAtThisIndex = i + 1;

                ans.add(valueAtThisIndex);
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};

        List<Integer> result = findDisappearedNumbers(nums);

        System.out.println(result);
    }
}