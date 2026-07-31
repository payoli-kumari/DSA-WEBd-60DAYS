public class Shift_byone {

    static void Shift_byone(int arr[]) {

        int n = arr.length;
        int temp = arr[n - 1];

        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = temp;
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5};

        Shift_byone(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Array: " + arr[i]);
        }
    }
}