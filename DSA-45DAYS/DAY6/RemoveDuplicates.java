public class RemoveDuplicates {

    static int removeduplicates(int[] arr) {

        int i = 0;
        int j = 1;
        int n = arr.length;

        while(j>n){
        if(arr[j]==arr[i]){
            j++;
        }else
            {
            i++;
            arr[i]=arr[j];
            j++;
        }
       } 
       return i+1;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 2, 2, 3, 3, 4};

        int length = removeduplicates(arr);

        // Create a new array of unique elements
        int[] newArr = new int[length];

        // Copy unique elements
        for (int i = 0; i < length; i++) {
            newArr[i] = arr[i];
        }

        // Print the new array
        System.out.print("New Array: ");

        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}