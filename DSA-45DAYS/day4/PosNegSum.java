public class PosNegSum {
    static int[] getPosNegSum(int arr[]){
        int PosSum=0;
        int NegSum=0;
         for(int i=0;i<arr.length;i++){
            if (arr[i] >0){
                PosSum +=arr[i];
            }
            else{
                NegSum +=arr[i];
            }
         }

         int ans[]={PosSum,NegSum};
         return ans;
        }
         public static void main(String[] args){
            int arr[]={2,-3,-5,-7,9};
            int ans[]= getPosNegSum(arr);
            System.out.println("positive sum:" +ans[0]);
               System.out.println("negative sum:" +ans[1]);
         }
    }
    

