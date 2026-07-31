public class reverse_array {
static void reverse_array(int arr[]){
    int n =arr.length;
    int i=0;
    int j=n-1;
     while(i<j){
        int temp=arr[i];
        arr [i]=arr [j];
        arr[j]=temp;
        i++;
        j--;
     }
      for(i=0;i<n;i++){
        System.out.println(arr[i]);
      }

}
   static void main(String[] args){
    int arr[]={1,2,3,4,5};
       reverse_array(arr);
   }
    
}
