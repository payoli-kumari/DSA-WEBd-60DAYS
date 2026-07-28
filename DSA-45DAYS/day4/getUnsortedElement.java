public class getUnsortedElement {
    static int getUnsortedElement(int arr[]){
        for(int i=0;i<arr.length;i++){
            if (arr[i+1]> arr[i]){

            }else{
                return arr[i+1];
            }
        }
    return -1;
}
static void main(String[] args){
    int arr[]={1,2,5,4,7};
    System.out.println(getUnsortedElement(arr));
}
}