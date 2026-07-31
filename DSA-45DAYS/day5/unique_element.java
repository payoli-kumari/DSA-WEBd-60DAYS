public class unique_element {

    public static int unique_element_miss(int[] arr) {

        int xorsum = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            xorsum = xorsum ^ arr[i];
        }

        return xorsum;
    }

    public static void main(String[] args) {

        int[] arr = {2, 3, 5, 4, 5, 3, 4};

        System.out.println(unique_element_miss(arr));
    }
}