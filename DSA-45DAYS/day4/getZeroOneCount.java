public class getZeroOneCount {
    static int[] getZeroOneCount(int arr[]){
        int ZeroCount=0;
        int OneCount=0;

        for(int i=0;i<arr.length;i++){
            if (arr[i]==0){
                ZeroCount++;
            }
            else{
                OneCount++;
            }
        }
        int ans[]={ZeroCount,OneCount};
        return ans;
    }
    static void main(String[] args){
        int[] arr={1,0,1,1,0,1,1};
        int ans[]=getZeroOneCount(arr);

            System.out.println("ZeroCount:=" +ans[0]);
             System.out.println("OneCount:=" +ans[1]);
        
    }
}
