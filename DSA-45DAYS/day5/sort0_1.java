public class sort0_1 {
    static int[] Sort_0_1(int[] arr){
        int n=arr.length;
        int i=0;
        int j=n-1;

        while(i<j){
            if(arr[i]==1 && arr[j]==0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]= temp;
            }
            if(arr[i]==0){
                i++;
            }
            if(arr[j]==1){
                j--;
            }
        }
         return arr;
            }
        public static void main(String[] args) {
            int arr[]={0,1,0,1,1,1,1};
            Sort_0_1(arr);
            for(int i=0;i<=arr.length ;i++){
                System.out.println(arr[i]);
            }
        }
    }

    

